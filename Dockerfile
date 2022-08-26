FROM maven:3.8.5-openjdk-18 AS build
ENV ENV=dev

WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src src
RUN mvn clean package
ENTRYPOINT ["java", "-jar", "target/empire.war"]
