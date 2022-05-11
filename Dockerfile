FROM openjdk:11
EXPOSE 8080
ADD target/class-enrollment-image.jar class-enrollment-image.jar
ENTRYPOINT ["java", "-jar", "/class-enrollment-image.jar"]