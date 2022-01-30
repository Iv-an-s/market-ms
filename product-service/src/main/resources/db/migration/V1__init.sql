create table if not exists products (
    id              bigserial primary key,
    title           varchar(255),
    price           int
);

insert into products (title, price) values
    ('bread', 10),
    ('milk', 20),
    ('cheese', 30),
    ('apple', 40),
    ('fish', 50);




