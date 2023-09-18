DROP DATABASE bloggheaven;
CREATE DATABASE bloggheaven;
USE bloggheaven;


CREATE TABLE Addresses(
addressID INT NOT NULL AUTO_INCREMENT, 
street VARCHAR(50) NOT NULL,
postCode INT NOT NULL,
city VARCHAR(50) NOT NULL,
country VARCHAR (50) NOT NULL,

PRIMARY KEY (addressID)
);

CREATE TABLE Users(
userID INT AUTO_INCREMENT NOT NULL,
firstName VARCHAR(50) NOT NULL,
lastName VARCHAR(50) NOT NULL,
addressID int NOT NULL,
email VARCHAR(50) NOT NULL,
phone VARCHAR(20) NOT NULL,
memberType VARCHAR(8) NOT NULL,

PRIMARY KEY (userID),
FOREIGN key (addressID) REFERENCES addresses(addressID)
);

CREATE TABLE Blogs(
blogID INT AUTO_INCREMENT NOT NULL,
blogText TEXT NOT NULL,
userID int NOT NULL, 

PRIMARY KEY (blogID),
FOREIGN key (userID) REFERENCES Users(userID)
);

INSERT INTO Addresses(street, postCode, city, country) VALUES ('kopparvägen 1', '11132', 'Jonkoping', 'Sweden');
INSERT INTO Addresses(street, postCode, city, country) VALUES ('Kungsgatan 2 ', '41152', 'Gothenburg', 'Sweden');
INSERT INTO Addresses(street, postCode, city, country) VALUES ('Storvägen 1', '42563', 'Kungsbacka', 'Sweden');
INSERT INTO Addresses(street, postCode, city, country) VALUES ('Torggatan 8', '45741', 'Varberg', 'Sweden');
INSERT INTO Addresses(street, postCode, city, country) VALUES ('Kyrkogatan 4', '12424', 'Uppsala', 'Sweden');



INSERT INTO Users(firstName, lastName, addressID, email, phone, memberType) VALUES ('Lisa','Svensson', 1, 'sadf@gmail.com', '0700124515','STANDARD');
INSERT INTO Users(firstName, lastName, addressID, email, phone, memberType) VALUES ('Åke', 'Hansson', 2, 'sfdmio@outlook.com', '0700223654','ENHANCED');
INSERT INTO Users(firstName, lastName, addressID, email, phone, memberType) VALUES ('Lars', 'Karlsson', 3, 'meidhhbg@gmail.com', '0700124515','STANDARD');
INSERT INTO Users(firstName, lastName, addressID, email, phone, memberType) VALUES ('Arik', 'Voro', 4, 'lijnnmeh@gmail.com', '0700122236','PREMIUM');

INSERT INTO Blogs(blogText, userId) VALUES ('Hello, this is my first post', 1);
INSERT INTO Blogs(blogText, userId) VALUES ('Why do turtles have shells?', 2);