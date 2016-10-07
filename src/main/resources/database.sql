-- Table: users
CREATE TABLE users(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255)NOT NULL,
  password VARCHAR(255)NOT NULL,
  firstname VARCHAR(255)NOT NULL,
  surename VARCHAR(255)NOT NULL,
  phone VARCHAR(255)NOT NULL,
  city VARCHAR(255)NOT NULL,
  street VARCHAR(255)NOT NULL,
  home VARCHAR(255)NOT NULL,
  email VARCHAR(255)NOT NULL



)
  ENGINE = InnoDB;
-- Table: role
CREATE TABLE  roles (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100)NOT NULL
)
  ENGINE = InnoDB;

-- Table for mapping user and roles^ user_roles
CREATE TABLE  user_roles(
  user_id INT NOT NULL ,
  role_id INT NOT NULL ,
  FOREIGN KEY (user_id)REFERENCES users(id),
  FOREIGN KEY (role_id)REFERENCES roles(id),
  UNIQUE (user_id, role_id)
)
  ENGINE = InnoDB;
-- Insert data
INSERT INTO users VALUES (1,'Fedorenko','$2a$11$9NLtOFHamWkb9lQocDtruudtu2WuyGG7bp/CXewpdPNj8RC2c5TMKC','Fedr','Fedorovich','375297564590','Minsk','Nemanskaya','18','111@gmail.com');
INSERT INTO roles VALUES (1,'ROLE_USER');
INSERT INTO roles VALUES (2,'ROLE_ADMIN');

INSERT INTO user_roles VALUES (1,2)

