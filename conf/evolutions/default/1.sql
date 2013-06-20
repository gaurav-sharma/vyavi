# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table activity (
  id                        bigint not null,
  what                      varchar(255),
  when                      timestamp not null,
  constraint pk_activity primary key (id))
;

create table idea (
  id                        bigint not null,
  summary                   varchar(255),
  inspiration               varchar(255),
  description               varchar(255),
  created_on                timestamp not null,
  constraint pk_idea primary key (id))
;

create table organization (
  id                        bigint not null,
  name                      varchar(255),
  invited                   boolean,
  accepted                  boolean,
  created_on                timestamp not null,
  constraint pk_organization primary key (id))
;

create table user (
  id                        bigint not null,
  first_name                varchar(255),
  last_name                 varchar(255),
  user_name                 varchar(255),
  password                  varchar(255),
  email                     varchar(255),
  created_on                timestamp not null,
  constraint pk_user primary key (id))
;


create table organization_user (
  organization_id                bigint not null,
  user_id                        bigint not null,
  constraint pk_organization_user primary key (organization_id, user_id))
;
create sequence activity_seq;

create sequence idea_seq;

create sequence organization_seq;

create sequence user_seq;




alter table organization_user add constraint fk_organization_user_organiza_01 foreign key (organization_id) references organization (id) on delete restrict on update restrict;

alter table organization_user add constraint fk_organization_user_user_02 foreign key (user_id) references user (id) on delete restrict on update restrict;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists activity;

drop table if exists idea;

drop table if exists organization;

drop table if exists organization_user;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists activity_seq;

drop sequence if exists idea_seq;

drop sequence if exists organization_seq;

drop sequence if exists user_seq;

