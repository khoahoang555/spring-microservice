-- liquibase formatted sql

-- changeset Admin:1681620163681-1
CREATE TABLE auth_user (id CHAR(36) NOT NULL, email VARCHAR(64) NOT NULL, password VARCHAR(64) NOT NULL, CONSTRAINT auth_userPK PRIMARY KEY (id));
