
# Xtramile Assignment

This project uses Spring Boot and MySql alongside clean architecture design.

This is only a web API without frontend.

To run the project, follow the following steps:

1. Import the sql files from [resources](alpha/src/main/resources) into your mysql server
2. Change the mysql connection information on the alpha/src/main/infrastructure/persistence/Database.java file with the following format:   "jdbc:mysql://{your ip}:{your port}/xtramilemhs","{your username}","{your password}"
3. Run the project and visit localhost:8080




## API Reference

#### Get all items

```http
  GET /localhost:8080/all
```
This will return a json array file with the following format:

```json
{
    "id": "{Nim Mahasiswa}",
    "name": "{Full Name Mahasiswa}",
    "age": "{Umur Mahasiswa}"
}
```
#### Create new Entry
To create new entry, you have to send a JSON file with this format:
```json
{
    "id": "{Nim Mahasiswa}",
    "fname": "{First Name Mahasiswa}",
    "lname": "{Last Name Mahasiswa}",
    "birthdate": "{Birthdate Mahasiswa, format: YYYY-MM-DD}"
}
```
Into the following api link:
```http
  POST /localhost:8080/create
```
#### Edit data
To edit an entry, you have to send a JSON file with this format:
```json
{
    "id": "{Nim Mahasiswa That will be changed}",
    "fname": "{New First Name Mahasiswa}",
    "lname": "{New Last Name Mahasiswa}",
    "birthdate": "{New Birthdate Mahasiswa, format: YYYY-MM-DD}"
}
```
Into the following api link:
```http
  POST /localhost:8080/update
```
#### Delete entry
To delete an entry, you have to send a JSON file with this format:
```json
{
    "id": "{Nim Mahasiswa that will be deleted}"
}
```
Into the following api link:
```http
  POST /localhost:8080/delete
```
