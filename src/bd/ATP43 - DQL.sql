-- Utilize as tabelas criadas durante a ATP41 e os registros criados durante a ATP42.
-- Liste todos os dados de todas as colunas da tabela Categoria.
-- Liste todos os dados de todas as colunas da tabela Produto.
-- Liste os dados de todas as colunas da tabela Categoria, para as linhas que possuam uma descrição preenchida.
-- Liste os dados das colunas Id, nome e preço da tabela Produto, para as linhas que possuem um nome iniciando com C.
-- Para os próximos exercícios, caso necessário, utilize o JOIN para unir as duas tabelas.
-- Liste os dados das colunas Id, nome e preço da tabela Produto e os dados id, nome e descrição da tabela Categoria para as linhas que possuem um preço maior que 0.
-- Liste os dados de todas as colunas da tabela Produto que possuem categoria com Id maior que 2.
-- Liste os dados de todas as colunas da tabela Categoria e o os dados da coluna nome da tabela Produto, para as categorias que estão sendo utilizadas por produtos.

-- DADOS DA TABELA CATEGORIA
select
	*
from
	categoria;

-- DADOS DA TABELA PRODUTO
select
	*
from
	produto;

-- DADOS DA TABELA CATEGORA QUE POSSUAM DESCRIÇÃO
select
	*
from
	categoria
where
	descricao <> '';

-- DADOS DA TABELA PRODUTO QUE COMECEM COM C
select
	id,
	nome,
	preco
from
	produto
where
	nome like 'C%';

-- DADOS DAS TABELAS PRODUTO E CATEGORIA COM PREÇO > 0
select
	p.id,
	p.nome,
	p.preco,
	c.id,
	c.nome,
	c.descricao
from
	produto as p
join categoria as c on
	p.id_categoria = c.id
where
	p.preco > 0;
	
-- DADOS DA TABELA PRODUTO COM ID_CATEGORIA > 2
select
	*
from
	produto
where
	id_categoria > 2;
	
-- DADOS DA TABELA CATEGORIA E NOME DA TABELA PRODUTO PARA PRODUTOS QUE POSSUEM CATEGORIA
select
	c.*,
	p.nome
from
	categoria as c
join produto as p on
	c.id = p.id_categoria;