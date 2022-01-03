FROM java:8

EXPOSE 9080

ADD target/shopping-user-service.jar user-service.jar

ENTRYPOINT ["java", "-jar", "user-service.jar"]