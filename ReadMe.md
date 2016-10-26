
This is a simplified architecture, that wants to demonstrate the use of

1. Eureka server - will give the status of the registered applications (in our case just Micro1)

2. Config server - gathers all the properties files for all the microservices from the system . Properties will be stored in out example on a github repository

3. Microservice that will retrieve the properties values from config server


Steps to follow in order to execute the example

1. Clone the project :  config-server, build it (mvn clean install) and run it . Check the Eureka server is started at : http://localhost:8761/

2. Clone configuration server : config-server - build it and run it 

3. Clone micro-1 project : build it and run it. 


- short time after micro-1 is started (be patient :) ), it will appear in the config-server as UP and running. To check all the applications registered to eureka and details about them : http://localhost:8761/eureka/apps/

- to test the relation between micro-1 and configuration server : use Postman (or any other extension that can be used to make a rest call) and post a get call to micro-1 on path : /lucky-word (for example : http://EN63227:8002/lucky-word)  => the values will be retrieved from github using the configserver
