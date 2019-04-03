create table `order`(
	id bigint auto_increment,
	user_id bigint not null,
	price bigint null,
	constraint t_order_pk
		primary key (id)
);

create table user(
	id bigint auto_increment,
	age int not null,
	name varchar(32) null,
	constraint t_order_pk
		primary key (id)
);



create table order0(id bigint auto_increment, user_id bigint not null,price bigint null,constraint t_order_pk primary key (id));
create table order1(id bigint auto_increment, user_id bigint not null,price bigint null,constraint t_order_pk primary key (id));
create table order2(id bigint auto_increment, user_id bigint not null,price bigint null,constraint t_order_pk primary key (id));
create table order3(id bigint auto_increment, user_id bigint not null,price bigint null,constraint t_order_pk primary key (id));
create table order4(id bigint auto_increment, user_id bigint not null,price bigint null,constraint t_order_pk primary key (id));
create table order5(id bigint auto_increment, user_id bigint not null,price bigint null,constraint t_order_pk primary key (id));
create table order6(id bigint auto_increment, user_id bigint not null,price bigint null,constraint t_order_pk primary key (id));
create table order7(id bigint auto_increment, user_id bigint not null,price bigint null,constraint t_order_pk primary key (id));
create table order8(id bigint auto_increment, user_id bigint not null,price bigint null,constraint t_order_pk primary key (id));
create table order9(id bigint auto_increment, user_id bigint not null,price bigint null,constraint t_order_pk primary key (id));
create table order10(id bigint auto_increment, user_id bigint not null,price bigint null,constraint t_order_pk primary key (id));





create table user0(id bigint auto_increment,age int not null,name varchar(32) null, constraint t_order_pk primary key (id));
create table user1(id bigint auto_increment,age int not null,name varchar(32) null, constraint t_order_pk primary key (id));
create table user2(id bigint auto_increment,age int not null,name varchar(32) null, constraint t_order_pk primary key (id));
create table user3(id bigint auto_increment,age int not null,name varchar(32) null, constraint t_order_pk primary key (id));
create table user4(id bigint auto_increment,age int not null,name varchar(32) null, constraint t_order_pk primary key (id));
create table user5(id bigint auto_increment,age int not null,name varchar(32) null, constraint t_order_pk primary key (id));
create table user6(id bigint auto_increment,age int not null,name varchar(32) null, constraint t_order_pk primary key (id));
create table user7(id bigint auto_increment,age int not null,name varchar(32) null, constraint t_order_pk primary key (id));
create table user8(id bigint auto_increment,age int not null,name varchar(32) null, constraint t_order_pk primary key (id));
create table user9(id bigint auto_increment,age int not null,name varchar(32) null, constraint t_order_pk primary key (id));
create table user10(id bigint auto_increment,age int not null,name varchar(32) null, constraint t_order_pk primary key (id));