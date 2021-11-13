FROM openjdk:8-jdk-alpine
MAINTAINER Oudessya_Balqist_Wibowo <1941720168@student.polinema.ac.id>
RUN mkdir -p /java
WORKDIR /java

COPY Balok.java /java

# Compile file java
RUN javac Balok.java

# Running java
ENTRYPOINT java Balok