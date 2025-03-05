FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ADD target/docker-jenkins-integration.jar docker-jenkins-integration.jar
ENTRYPOINT ["java","-jar","/docker-jenkins-integration.jar"]