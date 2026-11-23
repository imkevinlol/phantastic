CREATE SCHEMA IF NOT EXISTS UNIVERSITY;

CREATE TABLE IF NOT EXISTS UNIVERSITY.students (
    id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name varchar(50),
    last_name varchar(50),
    ssn varchar(9)
);