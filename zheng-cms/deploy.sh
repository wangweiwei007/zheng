#!/usr/bin/env bash
#编译+部署zheng-cms-rpc-service站点

#需要配置如下参数
# 项目路径, 在Execute Shell中配置项目路径, pwd 就可以获得该项目路径
# export PROJ_PATH=这个jenkins任务在部署机器上的路径

# 输入你的环境上部署服务提供者的全路径
# export SERVER_PROVIDER=dubbo服务在部署机器上的路径

### base 函数
killService()
{
    pid=`ps -ef|grep zheng-cms-rpc-service.jar|grep java|awk '{print $2}'`
    echo "zheng-cms-rpc-service Id list :$pid"
    if [ "$pid" = "" ]
    then
      echo "no zheng-cms-rpc-service pid alive"
    else
      kill -9 $pid
    fi
}
cd $PROJ_PATH/zheng-cms-rpc-service
mvn clean install -Dmaven.test.skip=true

# 停服务
killService

# 备份原有工程
cp $SERVER_PROVIDER/zheng-cms-rpc-service.war  $SERVER_PROVIDER/backup/zheng-cms-rpc-service.war.`date +%Y%m%d%H%M`

# 删除原有工程
rm -rf $SERVER_PROVIDER/zheng-cms-rpc-service.war

# 复制新的工程
cp $PROJ_PATH/zheng-cms-rpc-service/target/zheng-cms-rpc-service.war $SERVER_PROVIDER/

# 启动服务
java -jar /home/deploy-share/zheng-cms-rpc-service.war



