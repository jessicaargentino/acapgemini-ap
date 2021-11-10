-- Utilize o programa DBeaver e o banco de dados postgres para realizar as atividades.
-- Crie uma tabela de Produto com as seguintes colunas: id(identidade e incremental), nome, descri��o, codigo e pre�o. Todas devem ser de preenchimento obrigat�rio.
-- Crie uma tabela de Categoria com as seguintes colunas: id(identidade e incremental), nome, descri��o. Apenas a coluna descri��o deve permitir valores nulos.
-- Crie uma tabela de Carro com as seguintes colunas: id(identidade e incremental), modelo e marca. Todas devem ser de preenchimento obrigat�rio.
-- Adicione duas novas colunas em carro. As colunas devem ser: chassi e ano. As duas colunas devem ser de preenchimento obrigat�rio. 
-- Remove a coluna c�dido, da tabela Produto.
-- Delete a tabela Carro.
-- Adicione uma nova coluna na tabela Produto. A coluna deve ser o id da categoria e n�o deve permitir nulos.
-- Adicione uma constraint a coluna id de categoria da tabela Produto. A constraint deve ser uma Foreign Key para a coluna Id, da tabela Categoria.

-- CRIA��O DA TABELA PRODUTO
create table produto(id int generated always as identity,
nome varchar(30) not null,
descricao varchar(100) not null,
codigo varchar(6) not null,
preco decimal not null);

-- CRIA��O DA TABELA CATEGORIA
create table categoria(id int primary key generated always as identity,
nome varchar(25) not null,
descricao varchar(100) null);

-- CRIA��O DA TABELA CARRO
create table carro(id int generated always as identity,
modelo varchar(40) not null,
marca varchar(25) not null);

-- ADI��O DE COLUNAS EM CARRO
alter table carro add column chassi varchar(17) not null;
alter table carro add column ano int not null;

-- REMO��O DA COLUNA C�DIGO EM PRODUTO
alter table produto drop column codigo;

-- EXCLUS�O DA TABELA CARRO
drop table carro;

-- ADI��O DE COLUNA EM PRODUTO
alter table produto add column id_categoria int not null;

-- ADI��O DE CONSTRAINT/FK EM ID_CATEGORIA - PRODUTO
alter table produto add constraint fk_categoria foreign key (id_categoria) references categoria (id);