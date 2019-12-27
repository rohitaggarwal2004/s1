FROM java:8
VOLUME /tmp
ADD ../../target/s1-0.0.1-SNAPSHOT.war app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]