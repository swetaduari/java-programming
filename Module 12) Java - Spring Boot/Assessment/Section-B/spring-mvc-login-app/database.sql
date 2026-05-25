CREATE DATABASE springdb;

USE springdb;

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50),
    password VARCHAR(50)
);

INSERT INTO users(username, password)
VALUES ('admin', '1234');
