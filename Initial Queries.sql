use students_affairs;

go

insert into roles (ar_name,en_name) values (N'����','Admin');
insert into roles (ar_name,en_name) values (N'���� ������','Data Entry');
insert into roles (ar_name,en_name) values (N'���� ������','Data Viewer');

insert into users (active,name,username,password,role_id,mobile) values (1,'Abbas','a','a',1,'733522549');

insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'������','1st','1');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'�������','2nd','2');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'�������','3rd','3');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'�������','4th','4');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'�������','5th','5');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'�������','6th','6');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'�������','7th','7');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'�������','8th','8');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'�������','9th','9');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'�������','10th','10');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'������� ���','11th','11');

insert into levels (ar_name,en_name,no) values (N'�����','1st','1');
insert into levels (ar_name,en_name,no) values (N'������','2nd','2');
insert into levels (ar_name,en_name,no) values (N'������','3rd','3');
insert into levels (ar_name,en_name,no) values (N'������','4th','4');

insert into term_types (ar_name,en_name) values (N'����','odd');
insert into term_types (ar_name,en_name) values (N'����','even');

insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'�����','1st','1',1,1);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'������','2nd','2',1,2);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'������','3rd','3',2,1);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'������','4th','4',2,2);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'������','5th','5',3,1);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'������','6th','6',3,2);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'������','7th','7',4,1);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'������','8th','8',4,2);

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

insert into depts (ar_name,en_name) values (N'�����','Programming');
insert into depts (ar_name,en_name) values (N'�����','Networking');
insert into depts (ar_name,en_name) values (N'��� �������','Information System');
insert into depts (ar_name,en_name) values (N'���� ������','Deaf');

insert into categories (ar_name,en_name) values (N'�����','Morning');
insert into categories (ar_name,en_name) values (N'�����','Evening');
insert into categories (ar_name,en_name) values (N'���� ����','Private');

insert into student_status (name) values (N'�����');
insert into student_status (name) values (N'���� ���');
insert into student_status (name) values (N'�����');
insert into student_status (name) values (N'�����');
insert into student_status (name) values (N'�����');

insert into genders (ar_name,en_name) values (N'���','Male');
insert into genders (ar_name,en_name) values (N'����','Female');

insert into identity_types (name) values (N'����� �����');
insert into identity_types (name) values (N'���� ���');
insert into identity_types (name) values (N'����� ������');
insert into identity_types (name) values (N'���� �����');

insert into subject_types (ar_name,en_name) values (N'����','Theoritical');
insert into subject_types (ar_name,en_name) values (N'����','Labortory');

insert into mark_status (ar_name,en_name) values (N'����','Pass');
insert into mark_status (ar_name,en_name) values (N'����','Fail');

insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'�����','Excellent','A',90,100,1);
insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'��� ���','Very Good','B',80,89.99,1);
insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'���','Good','C',65,79.99,1);
insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'�����','Satisfactory','D',50,64.99,1);
insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'����','Fail','F',0,49.99,2);
insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'����','Absent','ABS',200,201,2);
insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'������','Mustanheg','H',300,301,2);

insert into mark_types (name) values (N'��� ���');
insert into mark_types (name) values (N'��� ����');
insert into mark_types (name) values (N'��� ��������');

