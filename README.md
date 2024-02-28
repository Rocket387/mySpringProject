
To Run the project:
open the terminal at the bottom and type ./mvnw spring-boot:run
(for Windows, use mvnw spring-boot:run).

Whenever you make any code changes, you will need to stop the application 
(in the same Terminal window, do Ctrl-C to interrupt and if prompted to terminate, type Y), and rerun the mvnw command.

An easy way to test your app is by typing the URL – the HTTP endpoint – into your local web browser.

Open a web browser on your computer and type http://localhost:8080/helloworld into the address bar. The Spring web app, 
running on the Apache Tomcat server, is listening for HTTP requests on localhost:8080, where localhost is the host name 
and 8080 is the address of the port on which the server listens. You should see this simple “Hello World” 
endpoint display on your browser page

Can also test on curl
open another terminal window and type in curl http://localhost:8080/helloworl
Should return the same response ... Hello World!