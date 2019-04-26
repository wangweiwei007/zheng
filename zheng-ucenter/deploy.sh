#!/usr/bin/env bash

cd $PROJ_PATH/zheng-ucenter/zheng-ucenter-rpc-service

mvn clean install -Dmaven.test.skip=true

# 备份原有工程
cp $SERVER_PROVIDER/zheng-ucenter-rpc-service-assembly.tar.gz  $SERVER_PROVIDER/backup/zheng-ucenter-rpc-service-assembly.tar.gz.`date +%Y%m%d%H%M`

# 删除原有工程
rm -rf $SERVER_PROVIDER/zheng-ucenter-rpc-service-assembly.tar.gz

# 复制新的工程
cp $PROJ_PATH/zheng-ucenter/zheng-ucenter-rpc-service/target/zheng-ucenter-rpc-service-assembly.tar.gz $SERVER_PROVIDER/

# 解压jar包
cd $SERVER_PROVIDER
tar -zxvf zheng-ucenter-rpc-service-assembly.tar.gz

# 启动服务
sh /home/deploy-share/zheng-ucenter-rpc-service/bin/restart.sh



