FROM openjdk:11.0.1-jre-slim

COPY ./{projetojar}.jar /home
WORKDIR /home

ENTRYPOINT ["java", "-jar", "{projetojar}.jar"]
EXPOSE 8080
# project's name in target
# after mvn install
