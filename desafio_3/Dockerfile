FROM maven:3.6.3-jdk-8
WORKDIR /app
RUN apt-get -y update
RUN apt-get -y install git
RUN git clone https://github.com/aguiarmarcel/desafio_3.git
RUN cd /app/desafio_3
RUN mvn clean install -f /app/desafio_3/desafio_3/pom.xml
ENTRYPOINT ["java", "-jar", "/app/desafio_3/target/desafio_3-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
