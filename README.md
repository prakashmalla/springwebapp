# springwebapp
Spring REST annotation based web application example which exposes a HTTP GET end point giving the random lottery numbers in JSON format.

Software dependencies:
1) Maven
2) Tomcat 

Steps for deploying the project:
1) Checkout the project
2) Run >mvn clean install command on the root folder
3) Copy the war file in the target directory and deploy it in tomcat

Note: No additional requirements and steps are needed to deploy the app.

Example request:

http://localhost:8080/app/lottery/powerball/generate

Response:

{"numbers":[23,10,12,28,45],"powerBall":22}
