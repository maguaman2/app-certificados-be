CREATE TABLE IF NOT EXISTS  certificado (
  id serial,
  cedula VARCHAR(30) NOT NULL,
  nombres VARCHAR(100) NOT NULL,
  link VARCHAR(250) NOT NULL,
  fechas VARCHAR(100) NOT NULL,
  rol VARCHAR(250) NOT NULL,
  capacitador VARCHAR(100) NOT NULL,
  codigo VARCHAR(250) NOT NULL,
  area VARCHAR(100) NOT NULL,
  curso VARCHAR(250) NOT NULL,
  objetivo VARCHAR(250) NOT NULL,
  contenidos VARCHAR(250) NOT NULL,
  horas VARCHAR(25) NOT NULL,
  PRIMARY KEY (id)
  );
