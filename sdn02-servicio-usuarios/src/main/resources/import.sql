INSERT INTO tbl_usuarios (usuario, correo, contrasena, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido) 
	VALUES ('nmartinez', 'nahum.martinez@sedena.gob.hn', '$2a$10$ySS9/dgnUfiAxb0upZUvy.5rY2WqWNarvlWANFatj8j.AJXEIZqAO', 
	'Nahum', 'Aaron', 'Martinez', 'Salgado');
	
INSERT INTO tbl_roles (nombre_rol) VALUES ('ROLE_ADMIN');
INSERT INTO tbl_roles (nombre_rol) VALUES ('ROLE_USER');
INSERT INTO tbl_roles (nombre_rol) VALUES ('ROLE_GUEST');

INSERT INTO tlb_usuarios_roles (usuario_id, rol_id) VALUES (1,1);
INSERT INTO tlb_usuarios_roles (usuario_id, rol_id) VALUES (1,2);
INSERT INTO tlb_usuarios_roles (usuario_id, rol_id) VALUES (1,3);