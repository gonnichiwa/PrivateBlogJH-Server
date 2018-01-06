Private Blog Server
================================
![p..ri...vit....ser...ver...](https://drive.google.com/file/d/1nQUzOXmUtc3Cy3F6p0R5FxqGVpzZrfk2/view?usp=sharing)

## \# 목적
> private Blog Client - Server 통신 실습을 위한
> 서버의 local 개발환경 설치 및 서버 API 문서 입니다

## \# 목차
### 1. 다운로드 SW 목록
### 2. 세팅 (OS - windows)
### 3. 세팅 (MAVEN, oracle library (ojdbc))
### 4. 세팅 (STS IDE)

## 1. 다운로드 SW 목록
> 1. JDK 1.8 [http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html]
> 2. Oracle 11g XE [http://www.oracle.com/technetwork/database/database-technologies/express-edition/downloads/index.html]
> 3. Oracle sql developer [http://www.oracle.com/technetwork/developer-tools/sql-developer/downloads/index.html]
> 4. tomcat **8.0** : 설치 경로와 **버전(8.0.xx)** 확인 필수 [https://tomcat.apache.org/download-80.cgi]
> 5. Spring Tool Suite (STS) [https://spring.io/tools/sts/all]
> 6. Maven 3 : 설치경로 확인 필수 [https://maven.apache.org/download.cgi]
> 7. SourceTree [https://www.sourcetreeapp.com/]

## 2. 세팅 (OS - windows)
> JDK 및 maven 환경변수 추가 해 주세요
> JDK (이름/path) : JAVA_HOME / path
> Maven (이름/path) : MAVEN_HOME / path

## 3. 세팅 (MAVEN)
> {MAVEN_HOME}에서 repository 디렉토리 생성
> {MAVEN_HOME}/conf/settings.xml 에서 다음 태그를 찾아서 주석 풀고 절대경로 추가
> **코드 중간에 주석처리 되어 있음**
> `<localRepository>
{MAVEN_HOME}\repository
</localRepository>`

### 3-1. oracle java database connector (ojdbc) download
> `ojdbc6.jar` download [http://www.oracle.com/technetwork/apps-tech/jdbc-112010-090769.html]

> ojdbc6.jar 다운로드 후 다운 경로에서 다음 명령어 입력
>> `mvn install:install-file -Dfile=ojdbc6.jar -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=10.0 -Dpackaging=jar -DgeneratePom=true`

## 4. 세팅 (STS)
> 1. 메인메뉴 `[window]` - `[preferences]` 클릭
> 2. 검색창에서 `maven` 입력
> 3. 메뉴 트리에서 `user settings` 클릭
> 4. `Global Settings` & `User Settings` 경로 둘다 절대경로로 `{MAVEN_HOME}\conf\settings.xml` 설정 후 `update settings` 클릭
> 5. `Local Repository` 도 `{MAVEN_HOME}\repository` 설정 후 `Reindex` 클릭

## 5. git Clone
## 6. STS에서 Project Import 및 Build
## 7. STS에서 WAS (tomcat) 추가 및 실행

***
