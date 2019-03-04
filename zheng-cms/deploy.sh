#!/usr/bin/env bash

cd $PROJ_PATH/zheng-cms/zheng-cms-rpc-service

mvn clean install -Dmaven.test.skip=true

# 备份原有工程
cp $SERVER_PROVIDER/zheng-cms-rpc-service-assembly.tar.gz  $SERVER_PROVIDER/backup/zheng-cms-rpc-service-assembly.tar.gz.`date +%Y%m%d%H%M`

# 删除原有工程
rm -rf $SERVER_PROVIDER/zheng-cms-rpc-service-assembly.tar.gz

# 复制新的工程
cp $PROJ_PATH/zheng-cms/zheng-cms-rpc-service/target/zheng-cms-rpc-service-assembly.tar.gz $SERVER_PROVIDER/

# 解压jar包
cd $SERVER_PROVIDER
tar -zxvf zheng-cms-rpc-service-assembly.tar.gz

# 启动服务
sh /home/deploy-share/zheng-cms-rpc-service/bin/restart.sh



