FROM openjdk:8-jre-alpine
ADD /build/libs/hello-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]