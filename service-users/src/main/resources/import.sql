INSERT INTO `users` (username, password, enabled, nombre, apellido, email) VALUES ('jose', '$2a$10$eOfZx.rw3bYIWE6AEPDYiOrz1lf6U67uq0E4FKh5XrqDzIBLDX6pq', 1, 'Andres', 'Guzman', 'guz@mail.com');
INSERT INTO `users` (username, password, enabled, nombre, apellido, email) VALUES ('admin', '$2a$10$IRfwRfHOZiBLz.dNu.2v8erW4HGEVtO1w7EhqSiict6jKjbqIXYU6', 1, 'John', 'Doe', 'jhon@mail.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);
