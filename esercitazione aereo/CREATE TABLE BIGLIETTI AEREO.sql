CREATE TABLE compagniaaerea (
    id_compagnia INT PRIMARY KEY NOT NULL,
    nome_compagnia VARCHAR(50) NOT NULL,
    sede_compagnia VARCHAR(50) NOT NULL
);
CREATE TABLE aereoporto (
    id_aereoporto INT PRIMARY KEY NOT NULL,
    nome_aereoporto VARCHAR(50) not null,
    citta VARCHAR(50) NOT NULL,
    piste VARCHAR (5) NOT NULL,
    stato_città VARCHAR (50) NOT NULL
);
CREATE TABLE cliente (
    id_cliente INT PRIMARY KEY NOT NULL,
    nome VARCHAR(50) NOT NULL,
    indirizzo VARCHAR(50) NOT NULL,
    numerotelefono INT,
    eta INT NOT NULL
);
CREATE TABLE aereo (
    id_aereo INT PRIMARY KEY NOT NULL,
    id_compagnia INT NOT NULL REFERENCES compagniaaerea(id_compagnia),  
    modello VARCHAR(50) NOT NULL,
    stato_aereo NUMBER(1,0) NOT NULL,
	posti_totali INT,
    capienza_merci INT,
    note VARCHAR(256)
);
CREATE TABLE volo (
    id_volo VARCHAR(5) PRIMARY KEY NOT NULL,
    id_aeroporto_origine INT NOT NULL REFERENCES aereoporto(id_aereoporto),
    id_aeroporto_destinazione INT NOT NULL REFERENCES aereoporto(id_aereoporto),
    id_aeroporto_scalo INT REFERENCES aereoporto(id_aereoporto),
	id_aereo INT NOT NULL REFERENCES aereo(id_aereo),
    posti_prenotati INT NOT NULL,
    posti_disponibili INT NOT NULL,
    costo_base DECIMAL NOT NULL 
);
CREATE TABLE prenotazione (
    id_prenotazione INT PRIMARY KEY NOT NULL,
	id_volo VARCHAR(5) NOT NULL REFERENCES volo(id_volo),
    id_cliente INT NOT NULL REFERENCES cliente(id_cliente),
    data_prenotazione DATE NOT NULL,
    data_viaggio DATE NOT NULL,
    costo_fatturato DECIMAL NOT NULL
);

CREATE TABLE statistiche (
    id_prenotazione INT PRIMARY KEY NOT NULL REFERENCES prenotazione(id_prenotazione),
    id_volo VARCHAR(5) NOT NULL REFERENCES volo(id_volo),
    num_prenotazioni INT NOT NULL,
    eta_media_passeggieri INT NOT NULL,
    num_adulti INT NOT NULL,
    num_bambini INT,
    tot_euro_fatturato DECIMAL NOT NULL
    );
	