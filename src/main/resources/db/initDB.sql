-- create table if not exists book
-- (
--     id        int                                       not null auto_increment,
--     name      varchar(16)                               not null,
--     publish   varchar(16)                               null,
--     isbn      char(17)                                  null,
--     writer    varchar(16)                               null,
--     local_url varchar(64)                               null,
--     price     float                                     null,
--     type      char(32)                                  null,
--     upper     char(16)                                  null,
--     pv        int          default 0                    null,
--     cover     varchar(128) default 'images/default.png' null,
--     constraint book_bookname_uindex
--         unique (name),
--     constraint book_isbn_uindex
--         unique (isbn),
--     PRIMARY KEY (id)
-- );
-- create unique INDEX idx_book_name on book (name);
--
-- create table if not exists course
-- (
--     id   int         not null,
--     name varchar(48) not null,
--     PRIMARY KEY (id)
-- );
-- create unique INDEX idx_course_name on course (name);
--
-- create table if not exists major
-- (
--     id   int auto_increment
--         primary key,
--     name varchar(32) not null
-- );
--
-- create table if not exists major_course
-- (
--     majorid  int null,
--     courseid int null,
--     constraint major_course_course_courseid_fk
--         foreign key (courseid) references course (id)
--             on update cascade on delete cascade,
--     constraint major_course_major_majorid_fk
--         foreign key (majorid) references major (id)
--             on update cascade on delete cascade
-- );
--
-- create table if not exists school
-- (
--     id      int auto_increment
--         primary key,
--     name    varchar(32) not null,
--     address varchar(64) null,
--     tel     char(20)    null
-- );
--
-- create table if not exists school_major
-- (
--     schoolid int null,
--     majorid  int null,
--     constraint school_major_major_majorid_fk
--         foreign key (majorid) references major (id)
--             on update cascade on delete cascade,
--     constraint school_major_school_schoolid_fk
--         foreign key (schoolid) references school (id)
--             on update cascade on delete cascade
-- );

DROP TABLE IF EXISTS users;
CREATE TABLE users
(
    id        int primary key auto_increment,
    name      char(14) NOT NULL unique,
    pwd       char(16) not NULL,
    sex       char(8)  NULL,
    email     char(32) NULL,
    tel       char(16) NULL
);






