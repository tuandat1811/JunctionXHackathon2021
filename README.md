# JunctionXHackathon2021
JxH 2021 final submission - Deadlight team

## Technology used:
##### Front-end: 
##### Back-end: Java Spring Boot and RESTful API
##### Database: MySQL

## Step to use:
1. Clone this directory to your device.
2. Open with IntelliJ
3. Navigate to "Application.properties" in the resources folder.
4. Change username and password to the default ones in your local computer.
5. Change `spring.jpa.hibernate.ddl-auto` value from `none` to `create`
6. Open MySQL WorkBench and create database, such as "DeadlightDB". Keep in mind that your database's name must be matched with the name in source code.
7. Right Click and Select "Set as default schema"

![image](https://user-images.githubusercontent.com/69025561/145685177-8f802f29-0173-4a88-abad-2d432fabde47.png)


8. Select database and select the + button. Click on MySQL.


![image](https://user-images.githubusercontent.com/69025561/145685214-20d159bc-0f40-476b-bd50-124177f70451.png)


9. Fill in the username and password as settings before. Fill the name of the database with the name set in step 4. Press Test connection, if Success, you are ready to go.


![image](https://user-images.githubusercontent.com/69025561/145685301-d82d0c64-68c4-4599-b136-38cf21fe88ac.png)


10. Press run. After table created successfully, stop and come back to Application.Properties, change back `spring.jpa.hibernate.ddl-auto` value from `create` to `none`


![image](https://user-images.githubusercontent.com/69025561/145685366-043799fa-6af0-4f9d-8e9f-b70cb304c7a2.png)
