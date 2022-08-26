FROM maven:3.8.5-openjdk-18 AS build
ENV ENV=dev

WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src src
RUN mvn clean package

FROM tomcat:10.1
COPY --from=build /app/target/empire.war ${CATALINA_HOME}/webapps/ROOT.war
EXPOSE 8080
ENTRYPOINT ["catalina.sh", "run"]
