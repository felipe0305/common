FROM openjdk:8-jdk-alpine

RUN apk --update add fontconfig  ttf-dejavu

USER appmobid

COPY ./adapter-consalud.jar /home/appmobid/app/adapter-consalud.jar

EXPOSE 8080

ENTRYPOINT ["java" \
,"-Djava.security.egd=file:/dev/./urandom","-Dlogging.config=file:///home/appmobid/properties-docker/adapter-consalud/properties/logback.xml" \
, "-jar","/home/appmobid/app/adapter-consalud.jar" \
,"--spring.config.location=/home/appmobid/properties-docker/adapter-consalud/properties/application.properties"]