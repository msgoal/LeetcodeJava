FROM openjdk:17-oracle

WORKDIR /app

COPY target/DockerECS-0.0.1-SNAPSHOT.jar /app/DockerECS-0.0.1-SNAPSHOT.jar

RUN ls -ltr

ENTRYPOINT ["java", "-jar", "DockerECS-0.0.1-SNAPSHOT.jar"]