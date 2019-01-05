FROM openjdk:8-jre-alpine
RUN mkdir /app
WORKDIR /app
ADD ./sharycar-catalogue-api/target/sharycar-catalogue-api-1.0-SNAPSHOT.jar /app
EXPOSE 8082
CMD ["java", "-jar", "sharycar-catalogue-api-1.0-SNAPSHOT.jar"]
