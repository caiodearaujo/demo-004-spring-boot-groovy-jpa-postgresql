FROM java
VOLUME /tmp
ADD demo-0.0.1.jar spring-boot-app.jar
EXPOSE 8080
RUN bash -c 'touch /spring-boot-app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-boot-app.jar"]