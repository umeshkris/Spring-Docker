FROM openjdk:17
COPY target/docker.io-0.0.1-SNAPSHOT.jar a725133/docker.io-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/a725133/docker.io-0.0.1-SNAPSHOT.jar"]
