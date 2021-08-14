use students_affairs;

go

insert into roles (ar_name,en_name) values (N'„œÌ—','Admin');
insert into roles (ar_name,en_name) values (N'„œŒ· »Ì«‰« ','Data Entry');
insert into roles (ar_name,en_name) values (N'ﬁ«—∆ »Ì«‰« ','Data Viewer');

insert into users (active,name,username,password,role_id,mobile) values (1,'Abbas','a','a',1,'733522549');

insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'«·«Ê·Ï','1st','1');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'«·À«‰Ì…','2nd','2');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'«·À«·À…','3rd','3');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'«·—«»⁄…','4th','4');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'«·Œ«„”…','5th','5');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'«·”«œ”…','6th','6');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'«·”«»⁄…','7th','7');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'«·À«„‰…','8th','8');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'«· «”⁄…','9th','9');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'«·⁄«‘—…','10th','10');
insert into batches (active,created_at,created_by,ar_name,en_name,no) values (1,CURRENT_TIMESTAMP,1,N'«·Õ«œÌ… ⁄‘—','11th','11');

insert into levels (ar_name,en_name,no) values (N'«·«Ê·','1st','1');
insert into levels (ar_name,en_name,no) values (N'«·À«‰Ì','2nd','2');
insert into levels (ar_name,en_name,no) values (N'«·À«·À','3rd','3');
insert into levels (ar_name,en_name,no) values (N'«·—«»⁄','4th','4');

insert into term_types (ar_name,en_name) values (N'›—œÌ','odd');
insert into term_types (ar_name,en_name) values (N'“ÊÃÌ','even');

insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'«·«Ê·','1st','1',1,1);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'«·À«‰Ì','2nd','2',1,2);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'«·À«·À','3rd','3',2,1);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'«·—«»⁄','4th','4',2,2);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'«·Œ«„”','5th','5',3,1);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'«·”«œ”','6th','6',3,2);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'«·”«»⁄','7th','7',4,1);
insert into terms (ar_name,en_name,no,level_id,term_type_id) values (N'«·À«„‰','8th','8',4,2);

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

insert into depts (ar_name,en_name) values (N'»—„Ã…','Programming');
insert into depts (ar_name,en_name) values (N'‘»ﬂ« ','Networking');
insert into depts (ar_name,en_name) values (N'‰Ÿ„ „⁄·Ê„« ','Information System');
insert into depts (ar_name,en_name) values (N'«·’„ Ê«·»ﬂ„','Deaf');

insert into categories (ar_name,en_name) values (N'’»«ÕÌ','Morning');
insert into categories (ar_name,en_name) values (N'„Ê«“Ì','Evening');
insert into categories (ar_name,en_name) values (N'‰›ﬁ… Œ«’…','Private');

insert into student_status (name) values (N'„‰ Ÿ„');
insert into student_status (name) values (N'„Êﬁ› ﬁÌœ');
insert into student_status (name) values (N'„‰”Õ»');
insert into student_status (name) values (N'„›’Ê·');
insert into student_status (name) values (N'„ Ê›Ì');

insert into genders (ar_name,en_name) values (N'–ﬂ—','Male');
insert into genders (ar_name,en_name) values (N'«‰ÀÏ','Female');

insert into identity_types (name) values (N'»ÿ«ﬁ… ‘Œ’Ì…');
insert into identity_types (name) values (N'ÃÊ«“ ”›—');
insert into identity_types (name) values (N'»ÿ«ﬁ… ⁄«∆·Ì…');
insert into identity_types (name) values (N'—Œ’… ﬁÌ«œ…');

insert into subject_types (ar_name,en_name) values (N'‰Ÿ—Ì','Theoritical');
insert into subject_types (ar_name,en_name) values (N'⁄„·Ì','Labortory');

insert into mark_status (ar_name,en_name) values (N'‰«ÃÕ','Pass');
insert into mark_status (ar_name,en_name) values (N'—«”»','Fail');

insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'„„ «“','Excellent','A',90,100,1);
insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'ÃÌœ Ãœ«','Very Good','B',80,89.99,1);
insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'ÃÌœ','Good','C',65,79.99,1);
insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'„ﬁ»Ê·','Satisfactory','D',50,64.99,1);
insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'—«”»','Fail','F',0,49.99,2);
insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'€«Ì»','Absent','ABS',200,201,2);
insert into grades (ar_name,en_name,symbol,min_end,max_end,mark_status_id) values (N'„” ‰ÂÃ','Mustanheg','H',300,301,2);

insert into mark_types (name) values (N'œÊ— «Ê·');
insert into mark_types (name) values (N'œÊ— À«‰Ì');
insert into mark_types (name) values (N'œÊ— «” À‰«∆Ì');

insert into form_functions (ar_name,en_name) values (N'Õ›Ÿ ÿ«·»','Save Student');
insert into form_functions (ar_name,en_name) values (N' ⁄œÌ· ÿ«·»','Edit Student');
insert into form_functions (ar_name,en_name) values (N'Õ–› ÿ«·»','Delete Student');
insert into form_functions (ar_name,en_name) values (N'Õ›Ÿ „«œ…','Save Subject');
insert into form_functions (ar_name,en_name) values (N' ⁄œÌ· „«œ…','Edit Subject');
insert into form_functions (ar_name,en_name) values (N'Õ–› „«œ…','Delete Subject');
insert into form_functions (ar_name,en_name) values (N'Õ›Ÿ Œÿ… œ—«”Ì…','Save Plan');
insert into form_functions (ar_name,en_name) values (N' ⁄œÌ· Œÿ… œ—«”Ì…','Edit Plan');
insert into form_functions (ar_name,en_name) values (N'Õ–› Œÿ… œ—«”Ì…','Delete Plan');
insert into form_functions (ar_name,en_name) values (N'Õ›Ÿ „«œ… ›Ì «·Œÿ…','Save Plan Subject');
insert into form_functions (ar_name,en_name) values (N' ⁄œÌ· „«œ… ›Ì «·Œÿ…','Edit Plan Subject');
insert into form_functions (ar_name,en_name) values (N'Õ–› „«œ… ›Ì «·Œÿ…','Delete Plan Subject');
insert into form_functions (ar_name,en_name) values (N'Õ›Ÿ œ—Ã… œÊ— «Ê·','Save First Mark');
insert into form_functions (ar_name,en_name) values (N' ⁄œÌ· œ—Ã… œÊ— «Ê·','Edit First Mark');
insert into form_functions (ar_name,en_name) values (N'Õ›Ÿ œ—Ã… œÊ— À«‰Ì','Save Second Mark');
insert into form_functions (ar_name,en_name) values (N' ⁄œÌ· œ—Ã… œÊ— À«‰Ì','Edit Second Mark');
insert into form_functions (ar_name,en_name) values (N'Õ›Ÿ ·«∆Õ…','Save Board');
insert into form_functions (ar_name,en_name) values (N' ⁄œÌ· ·«∆Õ…','Edit Board');
insert into form_functions (ar_name,en_name) values (N'Õ–› ·«∆Õ…','Delete Board');
insert into form_functions (ar_name,en_name) values (N' —›Ì⁄ «·ÿ·«»','Upgrade Students');
insert into form_functions (ar_name,en_name) values (N' ⁄œÌ· Õ«·… «·ÿ«·»','Edit Student Status');

insert into user_depts (active,created_at,created_by,user_id,dept_id) values (1,CURRENT_TIMESTAMP,1,1,1);
insert into user_depts (active,created_at,created_by,user_id,dept_id) values (1,CURRENT_TIMESTAMP,1,1,2);
insert into user_depts (active,created_at,created_by,user_id,dept_id) values (1,CURRENT_TIMESTAMP,1,1,3);
insert into user_depts (active,created_at,created_by,user_id,dept_id) values (1,CURRENT_TIMESTAMP,1,1,4);

insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,1,1);
insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,2,1);
insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,3,1);
insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,4,1);
insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,5,1);
insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,6,1);
insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,7,1);
insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,8,1);
insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,9,1);
insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,10,1);
insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,11,1);
insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,12,1);
insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,13,1);
insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,14,1);
insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,15,1);
insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,16,1);
insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,17,1);
insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,18,1);
insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,19,1);
insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,20,1);
insert into user_functions (active,created_at,created_by,user_id,function_id,status) values (1,CURRENT_TIMESTAMP,1,1,21,1);
