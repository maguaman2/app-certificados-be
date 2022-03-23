CREATE TABLE IF NOT EXISTS  certificado (
  id serial,
  cedula VARCHAR(13) NOT NULL,
  nombres VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  fechas VARCHAR(100) NOT NULL,
  rol VARCHAR(50) NOT NULL,
  capacitador VARCHAR(100) NOT NULL,
  codigo VARCHAR(100) NOT NULL,
  area VARCHAR(100) NOT NULL,
  curso VARCHAR(200) NOT NULL,
  objetivo VARCHAR(200) NOT NULL,
  contenidos VARCHAR(500) NOT NULL,
  PRIMARY KEY (id)
  );
