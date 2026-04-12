CREATE TABLE Pago(
	id INT PRIMARY KEY AUTO_INCREMENT,
    metodoPago 	VARCHAR(10),
    estado VARCHAR(10),
    id_chofer INT,
    id_ruta INT,
    fechaCreacion DATETIME DEFAULT CURRENT_TIMESTAMP,
	FOREIGN KEY (id_chofer) REFERENCES Chofer(id),
    FOREIGN KEY (id_ruta) REFERENCES Ruta(id)
)