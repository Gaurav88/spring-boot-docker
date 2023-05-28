<b>spring-boot-dockerize</b>

How to Dockerize Spring Boot Application

<b>Build Docker Image</b>

$ docker build -t spring-boot-docker.jar .

<b>Check Docker Image</b>

$ docker image ls

<b>Run Docker Image</b>

$ docker run -p 9090:8080 -e "JAVA_OPTS=-Ddebug -Xmx128m" spring-boot-docker.jar

In the run command, we have specified that the port 8080 on the container should be mapped to the port 9090 on the Host OS.

Another way to build is -

./gradlew bootBuildImage --imageName=spring-boot-docker.jar
