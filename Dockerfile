FROM maven:3.9.6-eclipse-temurin-17

WORKDIR /app

# Зависимости
COPY pom.xml .
RUN mvn -q -e -DskipTests dependency:go-offline

# Исходники
COPY . .

# Запуск тестов по умолчанию
CMD ["mvn", "-q", "test"]