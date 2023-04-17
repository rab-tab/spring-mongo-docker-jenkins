FROM openjdk:19
ADD target/spring-container-mongo-docker.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]