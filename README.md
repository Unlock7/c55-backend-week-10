# Backend week 10 assignment
Full instructions for the assignment can be found in the learning platform: https://hub.hackyourfuture.nl/backend-week-10-assignment

## Implementation Instructions
* Implement your changes in this project according to the instructions
* The DB Schema can be found in [src/main/resources/schema.sql](src/main/resources/schema.sql)

## Endpoints

| Method | Path              | Access    |
| ------ | ----------------- | --------- |
| POST   | `/users/register` | Public    |
| POST   | `/auth/login`     | Public    |
| POST   | `/auth/logout`    | Protected |
| GET    | `/users/profile`  | Protected |