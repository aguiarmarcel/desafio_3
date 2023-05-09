FROM maven:3.6.3-jdk-8
WORKDIR /app
RUN apt-get -y update
RUN apt-get -y install git
RUN git clone https://github.com/aguiarmarcel/desafio_3.git
RUN cd /app/desafio4
RUN mvn clean install -f /app/desafio4/pom.xml
ENTRYPOINT ["java", "-jar", "/app/desafio4/target/desafio_3-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
