# RailwayOffice
web application to order tickets online
This application task: 
Railway Office provide to the passangers with ability to choose the route of trip and needed date and find the available trains.
Passanger can choose train and should provide his name and email. Then pay for the ticket. 

Installation details.

To run the project you need installed (according to the documentation):

Java 9 (jre/jdk) or higher version
Apache Tomcat 9.0.8 or higher version
Apache Maven 3.5.3 or higher version
MySQL 8.0 or higher version

To run the project on localhost:

- Clone or download the project railway from the GitHub

- Create database "railway" on your MySQL server. After creating the database, edit file
"/src/main/java/model/DBConnection/ConnectionPool.java".
Find poolProp setUserName data "username" and set your database username then set your password for key "password".
Execute sql-script "railway_script.sql" from the directory "DBConnection" of the project.

Run Tomcat server. To do it run file "startup.sh" (for Mac/Linux/Unix, or file "startup.bat" for Windows)
from "bin" directory of your Tomcat installation folder. When server starts, the site 
will be available by web-address: http:\localhost:8080
To shutdown Tomcat just run file "shutdown.sh" (for Mac/Linux/Unix, or file "shutdown.bat" for Windows)
from "bin" directory of your Tomcat root folder.

