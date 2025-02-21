create table "user" (
    id SERIAL NOT NULL PRIMARY KEY,
    username VARCHAR(200) NOT NULL,
    password VARCHAR(500) NOT NULL,
    email VARCHAR(100) NOT NULL,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL
);

create table souvenir (
    id SERIAL NOT NULL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    price NUMERIC(5, 2) NOT NULL
);

create table image(
    id SERIAL NOT NULL PRIMARY KEY,
    image_data BYTEA,
    souvenir_id SERIAL
);
