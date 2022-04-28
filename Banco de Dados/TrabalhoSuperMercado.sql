create table produtos(
    codProd int primary key,
    nome varchar,
    qtdEtq varchar,
    preco decimal (6,2),
	codVend int
);

create table funcionarios(
    codFunc int primary key,
    nome varchar,
    cargo varchar,
    salario decimal (6,2),
	ctps int
);

create table clientes(
    codClien int primary key,
    nome varchar,
    cpf varchar,
    telefone varchar
);

create table vendas(
    numVend int primary key,
    codClie int,
	foreign key (codClie) references clientes(codClien),
    codFun int,
    foreign key (codFun) references funcionarios(codFunc),
    codVen int,
    foreign key (codVen) references produtos;

select 
    v.numvend as Nf,
    s.nome as "Nome do Cliente",
    f.nome as "Nome do Funcionário",
    p.nome as "Nome do Produto",
    p.preco as "Preço do Produto"
from vendas v
   left join clientes s
     on s.codclien = v.codclie
  left join funcionarios f
    on f.codfunc = v.codfun
  left join produtos p
    on p.codvend = v.codven

/*Trabalho em grupo que me ajudou bastante com o conteúdo*/
