-- Utilize as tabelas e os registros criados durante a ATP44.
-- Dntro de uma única transação, adicione um páis, 3 estados e 6 cidades.
-- Selecione todas as cidades, seus estados e países. Deve exibir o id da cidade, o nome, o id do estado, o nome do estado, a sigla do estado, o id do país e a sigla do país.
-- Para a atividade do select, utilize: join, alias(as) para as tabelas e colunas para diferenciar as colunas nome e id entre as tabelas.

-- TRANSAÇÃO DE ADIÇÃO DE PAÍSES/ESTADOS/CIDADES
begin transaction;

insert into pais
(nome, sigla)
values('Estados Unidos', 'EUA');

insert into estado
(nome, sigla, id_pais)
values('Califórnia', 'CA', 2);

insert into estado
(nome, sigla, id_pais)
values('Bahia', 'BA', 1);

insert into estado
(nome, sigla, id_pais)
values('Colorado', 'CO', 2);

insert into cidade
(nome, id_estado)
values('Denver', 4);

insert into cidade
(nome, id_estado)
values('Los Angeles', 2);

insert into cidade
(nome, id_estado)
values('Salvador', 3);

insert into cidade
(nome, id_estado)
values('Feira de Santana', 3);

insert into cidade
(nome, id_estado)
values('Sacramento', 2);

insert into cidade
(nome, id_estado)
values('Brighton', 4);

commit;
end;

-- SELECTS
select
	c.*,
	e.nome as "Estado",
	e.sigla as "Sigla Estado",
	p.id as "ID País",
	p.nome as "Nome País"
from
	cidade as c
join estado as e on
	c.id_estado = e.id
join pais as p on
	p.id = e.id_pais;