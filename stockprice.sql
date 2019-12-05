#create database for stock price
create database IF NOT EXISTS stock;

use stock;

DROP TABLE IF EXISTS stockprice;

CREATE TABLE stockprice(
  id bigint auto_increment,
  companycode VARCHAR(512) NOT NULL,
  stockexchange VARCHAR(512) NOT NULL,
  currentprice FLOAT NOT NULL,
  currentdate DATE NOT NULL,
  currenttime TIME NOT NULL,
  primary key(id)
);

DROP TABLE IF EXISTS user;

CREATE TABLE user(
  id bigint auto_increment,
  username VARCHAR(512) NOT NULL,
  password VARCHAR(512) NOT NULL,
  primary key(id)
);



