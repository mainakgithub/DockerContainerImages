FROM openjdk
WORKDIR usr/lib
ENV MONGO_DATABASE=custdb
ENV MONGO_URL=mongodb://localhost:27017/custdb
ADD ./target/CustomerService-0.0.1-SNAPSHOT.jar /usr/lib/CustomerService-0.0.1-SNAPSHOT.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar", "CustomerService-0.0.1-SNAPSHOT.jar"]

