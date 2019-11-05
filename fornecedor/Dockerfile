FROM java:8
EXPOSE 9090
ADD /target/fornecedor-0.0.1-SNAPSHOT.jar app-fornecedor.jar
ENTRYPOINT ["java", "-jar", "app-fornecedor.jar"]