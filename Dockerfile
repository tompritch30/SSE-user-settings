FROM tomcat:9-jdk11-openjdk

COPY ./build/libs/myapp.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]
