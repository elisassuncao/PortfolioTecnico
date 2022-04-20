create function minimo (valorx int, valory int) returns int as $$
declare
    minimo int;
begin
    if valorx > valory then minimo = valory;

    else minimo = valorx;

end if;
    return minimo;
end; $$ 
    language PLPGSQL;

select minimo(500,650);
