FROM eclipse-temurin:17-jre-alpine
RUN mkdir /opt/app
COPY target/graphdb-demo-0.0.1-SNAPSHOT.jar /opt/app/graphdb.jar
CMD ["java", "-jar", "/opt/app/graphdb.jar"]