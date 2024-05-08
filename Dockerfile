
FROM eclipse-temurin:17
COPY target/myfirstjenkinsproject.jar myfirstwebapp.jar
CMD [ "java","-jar","myfirstwebapp.jar" ]