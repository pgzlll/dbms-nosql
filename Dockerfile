FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
COPY target/nosql-spark-lab-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

