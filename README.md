# Fitness Management System

> This is a web application for maintaining records in a Fitness Management System.

## Setup

1. In a Terminal (Linux / Mac OS) / Command Prompt (Windows), start MSSQL.

    ```sh
    docker run -e "ACCEPT_EULA=Y" -e "SA_PASSWORD=P@ssw0rd" \
    -p 1433:1433 --name mssql-2019 --hostname mssql-2019 \
    -d mcr.microsoft.com/mssql/server:2019-latest
    ```

    If the container already exists, start the container using the following command:

    ```sh
    docker container start mssql-2019
    ```

2. Connect to MS SQL Server using the SQLCMD tool.

    ```sh
    sqlcmd -S localhost -U sa
    ```

3. In SQLCMD, create the database if it is not exist.

    ```sql
    create database fitness;
    go
    ```

4. In another Terminal / Command Prompt, run application using Jetty plugin.

    ```sh
    mvn clean package jetty:run
    ```
    
    For the first time running the application, the tables will be created.

5. In SQLCMD, check the tables are created:

    ```sql
    use fitness
    go
    select * from t_card;
    go
    select * from t_qicai;
    go
    select * from t_user;
    go
    select * from t_zhijiao;
    go
    ```
   
6. In SQLCMD, insert the following record:

    ```sql
    INSERT INTO t_user (user_id, user_name, user_pw, user_type, user_realname) VALUES (1, 'admin', 'admin', 0, 'Administrator');
    go
    ```

7. Open a browser and type in the following URL:

    ```
    http://localhost:8080/
    ```
   
    The login page should be shown.  Input 'admin' for both of the 'Username' and 'Password' fields.  Click the 'Login' button.

## Deployment

To package the WAR file for deployment, type the following command in Terminal / Command Prompt:

```sh
mvn clean package
```

Once successfully, a WAR file named 'fms-admin-0.0.1-SNAPSHOT.war' is created.  Deploy this file to the application server.
