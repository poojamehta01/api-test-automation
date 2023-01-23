# api-test-automation

## Table of Contents
- [Installation & Run](#installation)
    - [Quick Start](#quick-start)
    - [Note](#note)
- [Testcases](#Testcases)
- [Useful information](#useful-information)
    - [Project Structure](#project-stracture)
    - [Links](#links)

## <a name="installation"></a>Installation & Run
### <a name="quick-start"></a>Quick Start for Mac User

 ```bash
 # Install maven 
 brew install maven
 
 #Install allure
 brew install allure

# Run Tests
mvn clean test

# Generate Allure Report 
allure serve target/allure-results

# Spotless 
mvn spotless:apply
mvn spotless:check
```

### <a name="note"></a>Note

**1. TO RUN ALLURE AND MAVEN:
Make sure Java version = 11.0.16.1 and allure version = 2.20.1** <br>
**2. SET  global variable JAVA_HOME in terminal.** <br>
## <a name="#testcases"></a>Testcases
[Token TestCases link](https://docs.google.com/spreadsheets/d/1IN46tcXhezuYC-zLRoicmxu0DQ4qO5HF003QcdfsxYg/edit#gid=1301695409)

[Bugs link](https://docs.google.com/document/d/1VrQy9pweRhBsNvt7qHxfxrwZvq2yBVWcYegM33OFraI/edit)

## <a name="useful-information"></a>Useful information
### <a name="project-stracture"></a>Project Structure

| Path                     | Description                        |
|--------------------------|------------------------------------|
| src/main/java/           | Base folder for core code          |   |   |   |
| src/main/java/enums/     | Enums for testcases                |   |   |   |
| src/main/java/helpers    | Helpers for testcases              |   |   |   |
| src/main/java/pojo/      | Request and response pojos         |   |   |   |
| src/main/java/utilities/ | Util folder for processing request |   |   |   |
| src/main/resources       | Xml for logging                    |   |   |   |
| src/test/java/tests      | Folder for query tests             |   |   |   |
### <a name="links"></a>Links
1. [Allure Documentation](https://docs.qameta.io/allure/#_testng)
2. [TestNG Documentation](https://testng.org/doc/documentation-main.html)
3. [Rest Assured Documentation](https://github.com/rest-assured/rest-assured/wiki/Usage)
4. [Maven Documentation](https://maven.apache.org/guides/)
 

