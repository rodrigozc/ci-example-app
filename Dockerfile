FROM frolvlad/alpine-oraclejdk8:slim

VOLUME /app/logs

WORKDIR /app

ADD *.jar app.jar
ADD application.properties application.properties

EXPOSE 8080

RUN sh -c 'touch app.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]

