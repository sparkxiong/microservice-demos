FROM 192.168.1.52/system_containers/oraclejdk:8u231

MAINTAINER sparkxiong shi.xiong@tenxcloud.com

ENV PROFILE=test \
    K8S_NAMESPACE=default \
    MESH_SWITCHER_MESH=false \
    DEPLOY_TYPE=container \
    MESH_SVC_NAME="eureka-demo-consumer" \
    EUREKA_HOST="eureka-server.test-demo" \
    EUREKA_PORT=8761 \
    JVM="-Xms256m -Xmx1g -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -Djava.security.egd=file:/dev/./urandom"

ADD eureka-demo-consumer-1.0-SNAPSHOT.jar /app/app.jar

WORKDIR "/app"

EXPOSE 8081

CMD java -jar /app/app.jar