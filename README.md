# IPL-web-app

A simple web application for IPL

https://www.journaldev.com/2114/servlet-jsp-tutorial


    mvn archetype:generate -DgroupId=in.co.ipl -DartifactId=webapp -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

Maven Cordinates

    <groupId>in.co.ipl</groupId>
    <artifactId>webapp</artifactId>
    <packaging>jar</packaging>
    <version>1.0-SNAPSHOT</version>
    <name>webapp</name>
    <url>http://maven.apache.org</url>

Pom provides a unique signature to the application
Once built same is stored in repository for distribution
Distribution can be local or private / publis mvn repository

mvn needs a pom - Project Object Model

command line

mvn install - goal
mvn archetype:generate - plugin:goal

Life phase
GOAL - specific task,
Plugin - set of task

mvn life cycle
. validate - validate the project is correct and all necessary information is available
. compile - compile the source code of the project
. test - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
. package - take the compiled code and package it in its distributable format, such as a JAR.
. verify - run any checks on results of integration tests to ensure quality . criteria are met
. install - install the package into the local repository, for use as a . dependency in other projects locally
. deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.

compiler:compiler
surefire:test
jar:jar

Maven Centrail Repository
https://repo.maven.apache.org/maven2/

Public, Enterprice, Local

Check effective plugin to see all the configuration that applies

Change maven compiler and update project

Skip test

    -DskipTests

Add Spring dependency

    spring maven context dependency

Create a project with maven archetype webapp

    mvn archetype:generate -DgroupId=in.co.ipl -DartifactId=webapp -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

Create java and test folder


### Create first servlet 
 - Right click on project and generate new servlet class
 - Call its Default servlet for url /status
 - Return just 200 response
 - Added servlet dependeny in pom
 - check the web.xml
 
### Create first JSP

- Create a JSP file called home.jsp from eclipse
- Add some title and  run on server
- Create a  file for error and simply access to from the url path



Maven tomcat plugin

http://tomcat.apache.org/maven-plugin-2.2/


Tomcat facilitates the communication with servelets 
Creates a new thread for every request
created a request and response object

