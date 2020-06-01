# FinalProject
Major Project

To be able to access and test my Voting System, you must have installed in your machine the following: NetBeans IDE 8.0, GlassFish server version 4, Java 8.0, gson-2.8.0.jar, JDK version 1.8; and must have internet connection. 

This project is not hosted online. In order to run it, you have to download the zip from the "Clone or Download" button on the right, or clone it using your machine command prompt or terminal. 

If you download it, you must exctract the files as is going to be downloaded compressed, under .ZIP extension. 

If you want to clone it using command prompt or terminal, you must run the following commands:
cd 'your desired machine location'
git clone https://github.com/DianaAlina/FinalProject.git

Once you have followed one of the 2 options to download it, open NetBeans, go to "File" -> "Open Project". Find the path you chose to download the project in and access the "FinalProject" folder. You will have to select both "app" and "PDMS" and tick the "Open Required Projects" box. 



Upon running the system in NetBeans, there might be an error on the project if you have
independently installed the glassfish server, JDK or the JAR. To resolve the issue:
1. Right click on PDMS and click the last field displaying resolve on the list. (do the same for app if necessary).
2. A window will appear prompting you to to find the JDK or JAR files, then click OK.
3. You will be required to change the static variable PATH in the PDMSWebService class, under PDMS project, to the path of the PDMS project folder in your machine, in order to have access to the system as an admin and be able to create user profiles and elections.
4. Select the PDMS web project, right click and select "Deploy".
5. Right click on the "app" and select "Clean and Build", then "Run".

The login page off the web app will be lauched. To log in you can use the username: "admin" and the password: "admin" to see the main content page. 

If you want to create a new profile, you can do so by clicking on the "Register User" tab. It will show up a form that has to be filled in with the required details. Once you create the account, if successful, you will be redirected to main tab. If not successful, you will be given information on the registration button element. 

If you decide to add many users with the candidate type while logged in as an admin, you will be able to create en election, by going in the "Create election" tab and fill in the required details. 

To test the voter and candidate privileges, you must create at least a profile for each user type. 

To close the system just close the window with the running application. 
