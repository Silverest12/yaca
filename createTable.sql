CREATE OR REPLACE TABLE USERS (
    Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(30) NOT NULL,
    password VARCHAR(64) NOT NULL
) ENGINE = InnoDB;

