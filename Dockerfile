FROM eclipse-temurin:17-jre-focal
COPY ./target/demo1-0.0.1-SNAPSHOT.jar /app/demo1-0.0.1-SNAPSHOT.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "demo1-0.0.1-SNAPSHOT.jar"]