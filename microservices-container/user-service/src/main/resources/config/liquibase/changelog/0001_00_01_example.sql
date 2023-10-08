-- liquibase formatted sql

-- changeset Admin:1681620417387-1
CREATE TABLE user_profile (id CHAR(36) NOT NULL, full_name VARCHAR(64) NULL, gender VARCHAR(64) NULL, CONSTRAINT user_profilePK PRIMARY KEY (id));
