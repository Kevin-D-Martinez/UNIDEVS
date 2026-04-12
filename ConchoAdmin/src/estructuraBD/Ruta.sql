CREATE TABLE Ruta(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nombre 	VARCHAR(25),
    id_usuario INT,
    fechaCreacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id)
)