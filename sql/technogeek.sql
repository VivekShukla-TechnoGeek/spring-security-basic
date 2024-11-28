CREATE DATABASE technogeek;
use technogeek;


CREATE TABLE Users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


INSERT INTO Users (name, email, password)
VALUES
('Alice Smith', 'alice@example.com', 'pwd1'),
('Bob Johnson', 'bob@example.com', 'pwd2'),
('Charlie Brown', 'charlie@example.com', 'pwd3'),
('David Miller', 'david@example.com', 'pwd4'),
('Eva Wilson', 'eva@example.com', 'pwd5');

UPDATE `technogeek`.`Users` SET `password` = '$2a$12$hgSPUKcF81cfVQKTgPHW4.PiYHvyANFS/fNj/KkoYbGQ8D8dYBx1K' WHERE (`id` = '1');
UPDATE `technogeek`.`Users` SET `password` = '$2a$12$bJKjTTeW/o4H3r39QEuFEOLIQIW6H8Pq2.vW4hOStDmqgc./WvCkO' WHERE (`id` = '2');
UPDATE `technogeek`.`Users` SET `password` = '$2a$12$5TWyJAT2QJ2xrRjaQlikp.DzOHR3KpO9julKr2GPuLAR5LjP38W8.' WHERE (`id` = '3');
UPDATE `technogeek`.`Users` SET `password` = '$2a$12$wMh2grzzEhMNqwCRfXJBx.U7cmYVEjKm756jcXh2WyHPSMpog7Lbe' WHERE (`id` = '4');
UPDATE `technogeek`.`Users` SET `password` = '$2a$12$iFDdD5sF.I5TLwVjAAmaOOhnpCTHvYHKqVvFz5MjmM5d7hymtzT/C' WHERE (`id` = '5');


select * from Users;
