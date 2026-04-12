CREATE TABLE Vehiculo(
	id INT PRIMARY KEY AUTO_INCREMENT,
	marca VARCHAR(15),
    nombre 	VARCHAR(15),
    modelo VARCHAR(10),
    año DATE,
    matricula VARCHAR(10),
    id_chofer INT,
    id_ruta INT,
    fechaCreacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_chofer) REFERENCES Chofer(id),
    FOREIGN KEY (id_ruta) REFERENCES Ruta(id)
)