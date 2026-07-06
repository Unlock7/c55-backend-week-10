create table if not exists users
(
    id text not null
        constraint users_pk
            primary key,
    username text not null,
    password text not null
);