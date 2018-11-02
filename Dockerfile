FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/huupkuu.jar /huupkuu/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/huupkuu/app.jar"]
