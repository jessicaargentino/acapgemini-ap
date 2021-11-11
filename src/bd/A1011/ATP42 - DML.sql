-- Utilize as tabelas criadas durante a atividade prática 41.
-- Insira 3 categorias na tabela categoria.
-- Insira 6 produtos na tabela produto.
-- Altere a descrição de dois produtos.
-- Delete um produto e uma categoria. 
-- Altere uma categoria de um produto.
-- Altere o preço de todos os produtos tirando R$1,00 do preço atual.

-- INSERÇÃO DE 3 CATEGORIAS
insert into categoria(nome, descricao)
values('Eletrodoméstico', 'Aparelho elétrico para atividades domésticas');

insert into categoria(nome, descricao)
values('Smartphone', 'Aparelho telefónico com recursos avançados');

insert into categoria(nome, descricao)
values('Perfumaria', 'Objeto para cuidados pessoais');

-- INSERÇÃO DE 6 PRODUTOS
insert into produto(nome, descricao, preco, id_categoria)
values('Geladeira BRO80 Frost Free', 'Aparelho com duas portas e freezer na parte inferior', 5999.00, 1);

insert into produto(nome, descricao, preco, id_categoria)
values('Torradeira Toast Due Black', 'Aparelho portátil para tostar pão', 104.40, 1);

insert into produto(nome, descricao, preco, id_categoria)
values('Eau De Lacoste L.12.12 Blanc', 'Fragância amadeirada floral', 225.81, 3);

insert into produto(nome, descricao, preco, id_categoria)
values('iPhone 11', 'Aparelo celular multifuncional', 4598.99, 2);

insert into produto(nome, descricao, preco, id_categoria)
values('Creamy Ácido Mandélico', 'Gel clareador para pele', 59.00, 3);

insert into produto(nome, descricao, preco, id_categoria)
values('Loção Corporal Cerave', 'Creme hidrante para corpo', 64.90, 3);

-- ALTERANDO DESCRIÇÃO DE DOIS PRODUTOS
update produto set descricao = 'Perfume amadeirado floral, com cardamomo e harmonização aveludada' where id = 3;
update produto set descricao = 'Telefone celular' where id = 4;
	
-- EXCLUINDO PRODUTO E CATEGORIA
delete from produto where id = 4;
delete from categoria where id = 2;
	
-- ALTERAÇÃO DE CATEGORIA
update categoria set nome = 'Lar', descricao = 'Utensílios domésticos' where id = 1;
	
-- ALTERANDO O PREÇO DOS PRODUTOS
update produto set preco = preco - 1.00;