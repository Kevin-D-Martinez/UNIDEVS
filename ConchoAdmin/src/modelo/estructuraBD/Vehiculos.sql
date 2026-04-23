CREATE TABLE Vehiculos(
	id INT PRIMARY KEY AUTO_INCREMENT,
    marca VARCHAR(15),
    modelo VARCHAR(10),
    año VARCHAR(4),
    matricula CHAR(7),
    id_chofer INT,
    id_ruta INT,
    id_usuario INT,
    fechaCreacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_chofer) REFERENCES Chofer(id),
    FOREIGN KEY (id_ruta) REFERENCES Ruta(id),
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id)
)

SELECT * FROM Vehiculo