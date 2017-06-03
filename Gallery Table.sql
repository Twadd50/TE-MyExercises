--CREATE DATABASE gallery; ^^^ Switch to gallery?? 
DROP TABLE artist;
DROP TABLE customers;

CREATE TABLE artist (
artist_id serial PRIMARY KEY,
name VARCHAR(255) NOT NULL
);

CREATE TABLE customers (
customer_id serial PRIMARY KEY,
name VARCHAR(255) NOT NULL,
address VARCHAR(255),
phone VARCHAR(255)
);


CREATE TABLE artworks (                                           -- NOT NULL because a work of art might not have an artist
artwork_id serial PRIMARY KEY,
title VARCHAR(255) NOT NULL ,
artist_id int REFERENCES artists(artist_id)                       -- artworks.artist_id REFERENCES  artist.artist_id
);
CREATE TABLE purchases (
purchase_id serial PRIMARY KEY,                                  -- NOT NULL in this case = selling something
sale_price decimal(8,2) NOT NULL   ,                             --8 digits total, 2 after the decimal place
date_sold timestamp     NOT NULL  ,                              -- timestamp holds date and milliseconds 
customer_id int NOT NULL REFERENCES customers(customer_id)  ,    -- customer_id is a foreign key that points to customer
artwork_id int  NOT NULL REFERENCES artworks(artwork_id)
);
