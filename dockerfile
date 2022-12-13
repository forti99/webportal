FROM openjdk:11
ADD target/web-portal.jar web-portal.jar
ENTRYPOINT ["java", "-jar","web-portal.jar"]
EXPOSE 8080






































