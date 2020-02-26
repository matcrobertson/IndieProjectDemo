set foreign_key_checks = 0;
DROP TABLE IF EXISTS `artist`;
CREATE TABLE `artist` (
                          `id` int(11) NOT NULL AUTO_INCREMENT,
                          `artistName` varchar(45) NOT NULL,
                          PRIMARY KEY (`id`),
                          UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
                        `id` int(11) NOT NULL AUTO_INCREMENT,
                        `role` varchar(45) NOT NULL,
                        PRIMARY KEY (`id`),
                        UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `role` VALUES (1,'admin'),(2,'user'),(3,'Lord of Pancakes');
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
                        `id` int(11) NOT NULL AUTO_INCREMENT,
                        `user_name` varchar(45) NOT NULL,
                        `password` varchar(45) NOT NULL,
                        `role_id` int(11) NOT NULL,
                        PRIMARY KEY (`id`,`role_id`),
                        UNIQUE KEY `User_UNIQUE` (`user_name`),
                        UNIQUE KEY `id_UNIQUE` (`id`),
                        KEY `fk_user_role1_idx` (`role_id`),
                        CONSTRAINT `fk_user_role1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `user` VALUES (1,'dan','dan',1),(2,'sue','sue',2),(3,'bob','bob',2);

DROP TABLE IF EXISTS `user_artist`;

CREATE TABLE `user_artist` (
                               `id` int(11) NOT NULL AUTO_INCREMENT,
                               `user_id` int(11) NOT NULL,
                               `artist_id` int(11) NOT NULL,
                               PRIMARY KEY (`id`,`user_id`,`artist_id`),
                               UNIQUE KEY `id_UNIQUE` (`id`),
                               KEY `fk_user_artist_user_idx` (`user_id`),
                               KEY `fk_user_artist_artist1_idx` (`artist_id`),
                               CONSTRAINT `fk_user_artist_artist1` FOREIGN KEY (`artist_id`) REFERENCES `artist` (`id`),
                               CONSTRAINT `fk_user_artist_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
set foreign_key_checks = 1;