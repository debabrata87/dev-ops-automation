FROM container-registry.oracle.com/java/jdk:21

EXPOSE 8085
# Copy your app files or JAR
ADD target/dev-ops-automation.jar dev-ops-automation.jar
ENTRYPOINT ["java", "-jar", "/dev-ops-automation.jar"]
