DROP TABLE IF EXISTS pagamento;
DROP TABLE IF EXISTS funcionario;
DROP TABLE IF EXISTS ocorrencia;

CREATE TABLE pagamento (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    descricao VARCHAR(250) NOT NULL,
    valor INT NOT NULL,
    dataVencimento DATE NOT NULL,
    dataPagamento DATE NOT NULL
);

CREATE TABLE funcionario (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    nome VARCHAR(250) NOT NULL,
    cargo VARCHAR(250) NOT NULL,
);

CREATE TABLE ocorrencia (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    data DATE NOT NULL,
    descricao VARCHAR(250) NOT NULL,
    usuario VARCHAR(250) NOT NULL
);

INSERT INTO funcionario (nome, cargo) VALUES
  ('Lucas', 'Professor'),
  ('Felipe', 'Medico'),
  ('Matheus', 'Flanelinha');
