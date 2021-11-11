-- Utilize as tabelas criadas durante a atividade pr�tica 41.
-- Insira 3 categorias na tabela categoria.
-- Insira 6 produtos na tabela produto.
-- Altere a descri��o de dois produtos.
-- Delete um produto e uma categoria. 
-- Altere uma categoria de um produto.
-- Altere o pre�o de todos os produtos tirando R$1,00 do pre�o atual.

-- INSER��O DE 3 CATEGORIAS
insert into categoria(nome, descricao)
values('Eletrodom�stico', 'Aparelho el�trico para atividades dom�sticas');

insert into categoria(nome, descricao)
values('Smartphone', 'Aparelho telef�nico com recursos avan�ados');

insert into categoria(nome, descricao)
values('Perfumaria', 'Objeto para cuidados pessoais');

-- INSER��O DE 6 PRODUTOS
insert into produto(nome, descricao, preco, id_categoria)
values('Geladeira BRO80 Frost Free', 'Aparelho com duas portas e freezer na parte inferior', 5999.00, 1);

insert into produto(nome, descricao, preco, id_categoria)
values('Torradeira Toast Due Black', 'Aparelho port�til para tostar p�o', 104.40, 1);

insert into produto(nome, descricao, preco, id_categoria)
values('Eau De Lacoste L.12.12 Blanc', 'Frag�ncia amadeirada floral', 225.81, 3);

insert into produto(nome, descricao, preco, id_categoria)
values('iPhone 11', 'Aparelo celular multifuncional', 4598.99, 2);

insert into produto(nome, descricao, preco, id_categoria)
values('Creamy �cido Mand�lico', 'Gel clareador para pele', 59.00, 3);

insert into produto(nome, descricao, preco, id_categoria)
values('Lo��o Corporal Cerave', 'Creme hidrante para corpo', 64.90, 3);

-- ALTERANDO DESCRI��O DE DOIS PRODUTOS
update produto set descricao = 'Perfume amadeirado floral, com cardamomo e harmoniza��o aveludada' where id = 3;
update produto set descricao = 'Telefone celular' where id = 4;
	
-- EXCLUINDO PRODUTO E CATEGORIA
delete from produto where id = 4;
delete from categoria where id = 2;
	
-- ALTERA��O DE CATEGORIA
update categoria set nome = 'Lar', descricao = 'Utens�lios dom�sticos' where id = 1;
	
-- ALTERANDO O PRE�O DOS PRODUTOS
update produto set preco = preco - 1.00;