FROM openjdk:11


ARG JAR_FILE=target/xiao-hong-shu-all-*-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8080

CMD ["java","-jar","/app.jar"]