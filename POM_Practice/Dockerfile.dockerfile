FROM maven:3.8-jdk-8

COPY src /Home/Project/src

COPY testng.xml /Home/Project

COPY pom.xml /Home/Project

RUN mvn -f /Home/Project/pom.xml clean test -DskipTests=true