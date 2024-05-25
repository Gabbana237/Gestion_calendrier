21/04/2024 13:24


- command to change the column type

    ALTER TABLE calendrier ALTER COLUMN id_calendrier TYPE bigint USING id_calendrier::bigint;

how to execute the current version of project
1. you have to create a database called calendar
2. modify your user and password in /Gestion_calendrier/src/main/resources/application.properties files
3. you may have to grant acces to public schema to that user on all the tables in the database 


`GRANT SELECT, INSERT, UPDATE, DELETE ON ALL TABLES IN SCHEMA public TO role2;`
