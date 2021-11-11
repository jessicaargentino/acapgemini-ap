-- Utilize as tabelas criadas durante a ATP41 e os registros criados durante a ATP42.
-- Crie uma estrutura de transação para executar duas inserções. Entao, utilize o conjunto de begin, transaction, commit e end para criar um bloco de instruções.
-- Dentro do bloco, execute a inserção de um produto novo e uma categoria nova. Faça com que o produto contenha o id de uma categoria inexistente para que ocorra um erro. Verifique que nenhum dos dados foi inserido.
-- Crie uma tabela Carros com id, marca e modelo. 
-- Insira dois novos carros dentro desta tabela. 
-- Execute todos os comandos em uma única transação.
-- Crie uma tabela país com id(PK), nome e sigla.
-- Crie uma tabela estado com id(PK), nome, sigla e pais_id(FK);
-- Crie uma tabela cidade com id(PK), nome e estado_id(FK);
-- Adicione um país, um estado e uma cidade. Execute os DDL e DML em uma mesma transação 

-- TRANSAÇÃO DE CATEGORIA INEXISTENTE
begin transaction;

insert into produto
(nome, descricao, preco, id_categoria)
values('Dipirona Gotas 50ml', 'Remédio para dor de cabeça', 5.00, 6);

insert into categoria
(nome, descricao)
values('Drogaria', 'Produtos relacionados a infermidades');

commit;
end;

-- TRANSAÇÃO DE CARRO
begin transaction;

create table carro(id int primary key generated always as identity,
marca varchar(30) not null,
modelo varchar(30) not null);

insert into carro
(marca, modelo)
values('General Motors', 'Opala');

insert into carro
(marca, modelo)
values('Fiat', 'Fiorino');

commit;
end;

-- TRANSAÇÃO DE PAÍS/CIDADE/ESTADO
begin transaction;

create table pais(id int primary key generated always as identity,
nome varchar(30) not null,
sigla varchar(10) not null);

create table estado(id int primary key generated always as identity,
nome varchar(30) not null,
sigla varchar(10) not null,
id_pais int not null, constraint fk_pais foreign key(id_pais) references pais(id));

create table cidade(id int primary key generated always as identity,
nome varchar(30) not null,
id_estado int not null, constraint fk_estado foreign key(id_estado) references estado(id));

insert into pais(nome, sigla)
values('Brasil', 'BR');

insert into estado(nome, sigla, id_pais)
values('Minas Gerais', 'MG', 1);

insert into cidade(nome, id_estado)
values('Belo Horizonte', 1);

commit;
end;