FROM adoptopenjdk/openjdk11:latest

ARG PROFILE
ARG ADDITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADDITIONAL_OPTS=${ADDITIONAL_OPTS}

WORKDIR /usr/src

COPY /target/demo-h2-docker*.jar app.jar

SHELL ["/bin/sh", "-c"]

EXPOSE 8088

CMD java ${ADDITIONAL_OPTS} -jar app.jar --spring.profiles.active=${PROFILE}