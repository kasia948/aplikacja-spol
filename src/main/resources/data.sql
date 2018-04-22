INSERT INTO USER (first_name, last_name, username, password, enabled) VALUES ('Bogdan', 'Kowalski', 'kowal', '$2a$10$hYewqYSaPfmxy9WSN2ttt.5DIKukl4JeZ7.tAA25BDJDoN3hS.Vnu', true);
INSERT INTO USER (first_name, last_name, username, password, enabled) VALUES ('Anna', 'Drzymala', 'kwiatek', '$2a$10$gBFRTQQQAW5bADEGg2aWDOo6IJKX4RSd3AsrkbZN2a1GXR9TD30IO', true);

INSERT INTO USER_ROLE (username, role) VALUES ('kowal', 'ROLE_ADMIN');
INSERT INTO USER_ROLE (username, role) VALUES ('kwiatek', 'ROLE_USER');