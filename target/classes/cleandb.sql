delete from user;
delete from role;
INSERT INTO role (id, role) VALUES (1,'admin'),(2,'user'),(3,'banned'),(4,'Goofy Goober');
INSERT INTO user (id, user_name, password, role_id) VALUES ( 1, 'dan','dan', 1),(2, 'sue','sue', 2),(3, 'bob','bob', 2);
