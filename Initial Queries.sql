use students_affairs;

go

insert into roles (ar_name,en_name) values (N'ãÏíÑ','Admin');
insert into roles (ar_name,en_name) values (N'ãÏÎá ÈíÇäÇÊ','Data Entry');
insert into roles (ar_name,en_name) values (N'ŞÇÑÆ ÈíÇäÇÊ','Data Viewer');

insert into users (active,name,username,password,role_id,mobile) values (1,'Abbas','a','a',1,'733522549');

insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'ÇáÇæáì','1st','1');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'ÇáËÇäíÉ','2nd','2');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'ÇáËÇáËÉ','3rd','3');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'ÇáÑÇÈÚÉ','4th','4');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'ÇáÎÇãÓÉ','5th','5');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'ÇáÓÇÏÓÉ','6th','6');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'ÇáÓÇÈÚÉ','7th','7');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'ÇáËÇãäÉ','8th','8');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'ÇáÊÇÓÚÉ','9th','9');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'ÇáÚÇÔÑÉ','10th','10');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'ÇáÍÇÏíÉ ÚÔÑ','11th','11');

insert into levels (ar_name,en_name,no) values (N'ÇáÇæá','1st','1');
insert into levels (ar_name,en_name,no) values (N'ÇáËÇäí','2nd','2');
insert into levels (ar_name,en_name,no) values (N'ÇáËÇáË','3rd','3');
insert into levels (ar_name,en_name,no) values (N'ÇáÑÇÈÚ','4th','4');

insert into term_types (ar_name,en_name) values (N'İÑÏí','odd');
insert into term_types (ar_name,en_name) values (N'ÒæÌí','even');

insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'ÇáÇæá','1st','1',1,1);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'ÇáËÇäí','2nd','2',1,2);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'ÇáËÇáË','3rd','3',2,1);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'ÇáÑÇÈÚ','4th','4',2,2);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'ÇáÎÇãÓ','5th','5',3,1);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'ÇáÓÇÏÓ','6th','6',3,2);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'ÇáÓÇÈÚ','7th','7',4,1);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'ÇáËÇãä','8th','8',4,2);

insert into years (active,created_at,created_by,start_year,end_year,symbol,current_year) values (1,CURRENT_TIMESTAMP,1,'2011','2012','11',0);
insert into years (active,created_at,created_by,start_year,end_year,symbol,current_year) values (1,CURRENT_TIMESTAMP,1,'2012','2013','12',0);
insert into years (active,created_at,created_by,start_year,end_year,symbol,current_year) values (1,CURRENT_TIMESTAMP,1,'2013','2014','13',0);
insert into years (active,created_at,created_by,start_year,end_year,symbol,current_year) values (1,CURRENT_TIMESTAMP,1,'2014','2015','14',0);
insert into years (active,created_at,created_by,start_year,end_year,symbol,current_year) values (1,CURRENT_TIMESTAMP,1,'2015','2016','15',0);
insert into years (active,created_at,created_by,start_year,end_year,symbol,current_year) values (1,CURRENT_TIMESTAMP,1,'2016','2017','16',0);
insert into years (active,created_at,created_by,start_year,end_year,symbol,current_year) values (1,CURRENT_TIMESTAMP,1,'2017','2018','17',0);
insert into years (active,created_at,created_by,start_year,end_year,symbol,current_year) values (1,CURRENT_TIMESTAMP,1,'2018','2019','18',0);
insert into years (active,created_at,created_by,start_year,end_year,symbol,current_year) values (1,CURRENT_TIMESTAMP,1,'2019','2020','19',0);
insert into years (active,created_at,created_by,start_year,end_year,symbol,current_year) values (1,CURRENT_TIMESTAMP,1,'2020','2021','20',0);
insert into years (active,created_at,created_by,start_year,end_year,symbol,current_year) values (1,CURRENT_TIMESTAMP,1,'2021','2022','21',1);

insert into depts (ar_name,en_name) values (N'ÈÑãÌÉ','Programming');
insert into depts (ar_name,en_name) values (N'ÔÈßÇÊ','Networking');
insert into depts (ar_name,en_name) values (N'äÙã ãÚáæãÇÊ','Information System');
insert into depts (ar_name,en_name) values (N'ÇáÕã æÇáÈßã','Deaf');

insert into categories (ar_name,en_name) values (N'ÕÈÇÍí','Morning');
insert into categories (ar_name,en_name) values (N'ãæÇÒí','Evening');
insert into categories (ar_name,en_name) values (N'äİŞÉ ÎÇÕÉ','Private');

insert into student_status (name) values (N'ãäÊÙã');
insert into student_status (name) values (N'ãæŞİ ŞíÏ');
insert into student_status (name) values (N'ãäÓÍÈ');
insert into student_status (name) values (N'ãİÕæá');
insert into student_status (name) values (N'ãÊæİí');

insert into genders (ar_name,en_name) values (N'ĞßÑ','Male');
insert into genders (ar_name,en_name) values (N'ÇäËì','Female');

insert into identity_types (name) values (N'ÈØÇŞÉ ÔÎÕíÉ');
insert into identity_types (name) values (N'ÌæÇÒ ÓİÑ');
insert into identity_types (name) values (N'ÈØÇŞÉ ÚÇÆáíÉ');
insert into identity_types (name) values (N'ÑÎÕÉ ŞíÇÏÉ');

insert into subject_types (ar_name,en_name) values (N'äÙÑí','Theoritical');
insert into subject_types (ar_name,en_name) values (N'Úãáí','Labortory');

insert into mark_status (ar_name,en_name) values (N'äÇÌÍ','Pass');
insert into mark_status (ar_name,en_name) values (N'ÑÇÓÈ','Fail');

insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'ããÊÇÒ','Excellent','A',90,100,1);
insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'ÌíÏ ÌÏÇ','Very Good','B',80,89.99,1);
insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'ÌíÏ','Good','C',65,79.99,1);
insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'ãŞÈæá','Satisfactory','D',50,64.99,1);
insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'ÑÇÓÈ','Fail','F',0,49.99,2);
insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'ÛÇíÈ','Absent','ABS',200,201,2);
insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'ãÓÊäåÌ','Mustanheg','H',300,301,2);

insert into mark_types (name) values (N'ÏæÑ Çæá');
insert into mark_types (name) values (N'ÏæÑ ËÇäí');
insert into mark_types (name) values (N'ÏæÑ ÇÓÊËäÇÆí');

