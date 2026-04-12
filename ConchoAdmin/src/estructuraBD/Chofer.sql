CREATE TABLE Chofer(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nombre 	VARCHAR(25),
    apellido VARCHAR(25),
    numeroRuta VARCHAR(3),
    cedula CHAR(11),
    telefono CHAR(10),
    estado VARCHAR(10),
    id_ruta INT,
    fechaCreacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_ruta) REFERENCES Ruta(id)
)