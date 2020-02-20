delete from user;
delete from role;
INSERT INTO role VALUES (1,'admin'),(2,'user'),(3,'banned'),(4,'Goofy Goober');
INSERT INTO user (user_name, password, role_id) VALUES ('dan','dan', 1),('sue','sue', 2),('bob','bob', 2);
