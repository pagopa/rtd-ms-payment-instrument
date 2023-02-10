FROM gradle:6.9.3-jdk17-alpine AS build

WORKDIR /build
COPY . .

RUN gradle build --no-daemon 

FROM amazoncorretto:17 as runtime

VOLUME /tmp
WORKDIR /app

COPY --from=buildtime /build/target/*.jar /app/app.jar
# The agent is enabled at runtime via JAVA_TOOL_OPTIONS.
ADD https://github.com/microsoft/ApplicationInsights-Java/releases/download/3.4.9/applicationinsights-agent-3.4.9.jar /app/applicationinsights-agent.jar

EXPOSE 8080

ENTRYPOINT [ "java","-jar","/app/app.jar" ]