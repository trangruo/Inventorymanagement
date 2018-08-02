
create database TYDK;

use TYDK;

drop table if exists goods;

CREATE TABLE goods(
id INT (5) NOT NULL PRIMARY KEY ,
name VARCHAR (20) NOT NULL  ,
number INT (5) NOT NULL,
w_id INT(5) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

drop table if exists warehouse;

CREATE TABLE warehouse (
id INT (5) NOT NULL PRIMARY KEY ,
name VARCHAR (20) NOT NULL ,
capacity INT (3) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO warehouse VALUES
(1,'beijing',20),
(2,'hefei',20),
(3,'shanghai',30);

INSERT INTO goods VALUES
(1,'apple', 1000, 1),
(2,'orange', 200, 1),
(3,'banana',100, 1),
(4,'pear',100, 2),
(5,'tea',100, 2),
(6,'milk',100, 2),
(7,'bread',100, 2),
(8,'peach',100, 3),
(9,'mango',100, 3),
(10,'strawberry',100, 3),
(11,'lemon',100, 3);
