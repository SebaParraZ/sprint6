insert into user (username,password) values('lau','123');
insert into user (username,password) values('cat','123');
insert into user (username,password) values('diego','123');

insert into autorities (name) values ("ADMIN");
insert into autorities (name) values ("USER");
insert into autorities (name) values ("OTRO");

insert into user_authority (username,authority_id) values("lau",1);
insert into user_authority (username,authority_id) values("cat",2);
insert into user_authority (username,authority_id) values("diego",3);