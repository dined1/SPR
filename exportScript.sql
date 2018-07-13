drop table if exists spr.role cascade;
drop table if exists spr.user cascade;
alter table user_role drop constraint FKa68196081fvovjhkek5m97n3y;
alter table user_role drop constraint FK859n2jvi8ivhui0rl0esws6o;
drop table if exists user_role cascade;
drop sequence if exists hibernate_sequence;
create table spr.role (id int8 not null, name varchar(255), primary key (id));
create table spr.user (id int8 not null, login varchar(255), password varchar(255), passwordConfirm varchar(255), primary key (id));
create sequence hibernate_sequence start 1 increment 1;
create table user_role (user_id int8 not null, role_id int8 not null, primary key (user_id, role_id));
alter table user_role add constraint FKa68196081fvovjhkek5m97n3y foreign key (role_id) references spr.role;
alter table user_role add constraint FK859n2jvi8ivhui0rl0esws6o foreign key (user_id) references spr.user;
alter table spr.user_role drop constraint FKa68196081fvovjhkek5m97n3y;
alter table spr.user_role drop constraint FK859n2jvi8ivhui0rl0esws6o;
drop table if exists spr.role cascade;
drop table if exists spr.user cascade;
drop table if exists spr.user_role cascade;
drop sequence if exists hibernate_sequence;
create table spr.role (id int8 not null, name varchar(255), primary key (id));
create table spr.user (id int8 not null, login varchar(255), password varchar(255), passwordConfirm varchar(255), primary key (id));
create table spr.user_role (user_id int8 not null, role_id int8 not null, primary key (user_id, role_id));
create sequence hibernate_sequence start 1 increment 1;
alter table spr.user_role add constraint FKa68196081fvovjhkek5m97n3y foreign key (role_id) references spr.role;
alter table spr.user_role add constraint FK859n2jvi8ivhui0rl0esws6o foreign key (user_id) references spr.user;
