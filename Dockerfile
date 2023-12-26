# 빌드를 위한 임시 이미지
FROM gradle:7.6-jdk17-alpine as build
WORKDIR /workspace

# 소스 코드 복사
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src

# 권한 부여 및 빌드 실행
RUN chmod +x ./gradlew
RUN ./gradlew clean build

# 최종 이미지
FROM openjdk:17
WORKDIR /app

# 빌드된 JAR 파일 복사
EXPOSE 8080
COPY --from=build /workspace/build/libs/*.jar /servers-0.0.1-SNAPSHOT.jar

# 실행 명령어
ENTRYPOINT ["java", "-jar", "/servers-0.0.1-SNAPSHOT.jar"]
