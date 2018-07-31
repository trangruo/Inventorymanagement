
create database TYDK;

drop table if exists goods;

CREATE TABLE goods(
id INT (5) NOT NULL PRIMARY KEY AUTO_INCREMENT,
name VARCHAR (20) NOT NULL ,
number INT (5) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO goods VALUES
(3,'banana',100),
(4,'pear',100),
(5,'tea',100),
(6,'milk',100),
(7,'bread',100),
(8,'peach',100),
(9,'mango',100),
(10,'strawberry',100),
(11,'lemon',100);
