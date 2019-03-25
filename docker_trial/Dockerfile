FROM openjdk:8u191-jdk-alpine3.9 AS build-env
ADD . /java/src/app
WORKDIR /java/src/app
RUN gradlew build

FROM openjdk:8u191-jre-alpine3.9
COPY --from=build-env /java/src/app/build/libs/target.jar /java/app/
EXPOSE 8080
CMD ["java", "-jar", "/java/app/target.jar"]