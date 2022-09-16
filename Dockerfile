FROM openjdk:11 as build
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} productsearchservice.jar
EXPOSE 5000
ENTRYPOINT ["java","-jar","/productsearchservice.jar"]