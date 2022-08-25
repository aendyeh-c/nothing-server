FROM openjdk:8-jdk-alpine AS base
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

FROM maven:3.8.5-openjdk-18
ENV ENV=dev
EXPOSE 8080
COPY . .
RUN mvn install
CMD ["mvn", "spring-boot:run"]
