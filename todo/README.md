## Build docker PostgreSQL image
To build docker PostgreSQL image:
````
cd todo
docker build -t todo_postgres .
docker run --name todo_postgres -p 5432:5432 -d todo_postgres
````