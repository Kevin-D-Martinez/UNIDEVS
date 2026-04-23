CREATE TABLE Choferes(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(25),
    apellido VARCHAR(25),
    cedula CHAR(11) UNIQUE,
    telefono CHAR(10) UNIQUE,
    estado VARCHAR(10),
    id_ruta INT,
    id_usuario INT,
    fechaCreacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_ruta) REFERENCES Ruta(id),
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id)
)

SELECT * FROM Chofer

SELECT * FROM Chofer WHERE (nombre LIKE '%Ra%' OR apellido LIKE '%Ra%' OR cedula LIKE '%Ra%') AND id_usuario = 8