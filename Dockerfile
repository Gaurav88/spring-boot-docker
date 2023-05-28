FROM openjdk:17
EXPOSE 8080
ADD build/libs/*.jar spring-boot-docker.jar
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /spring-boot-docker.jar"]
