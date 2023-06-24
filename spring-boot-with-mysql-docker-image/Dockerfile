# openjdk:19-alpine as i am using jdk 20 so openjdk:19-alpine is not supported.
FROM openjdk:20-jdk
WORKDIR /app
COPY target/demo-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]

#first mvn clean install
#FROM openjdk:20-jdk
#WORKDIR /app
#COPY ./target/<your-file>-<version>/SNAPSHOT.jar /app
#EXPOSE 8080
#CMD ["java", "-jar", "<your-file>-<version>/SNAPSHOT.jar"]
# docker build -t <custom-name> .
# docker run -it -p 8080:8080 <custom-name>







