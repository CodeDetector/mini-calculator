FROM openjdk
COPY ./target/mini-calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "mini-calculator-1.0-SNAPSHOT.jar"]