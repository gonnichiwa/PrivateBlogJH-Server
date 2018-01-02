
DROP TABLE BlogTable;

CREATE TABLE BlogBoard (
  bb_Num int primary key,
  bb_Title varchar2(70) not null,
  bb_Author varchar2(20) not null,
  bb_Contents varchar2(1000) not null,
  bb_WriteTime date not null,
  bb_IsDel char(1) not null
);

create sequence seq_blogBoard_bbNum
start with 1
increment by 1
nomaxvalue
nocache;

CREATE TABLE BlogMenu (
  bm_IdNum int primary key,
  bm_Name varchar2(30) not null,
  bm_Lev int not null,
  bm_Step int not null,
  bm_ref int not null,
  bm_IsDel char(1) not null
);

create sequence seq_blogMenu_idNum
start with 1
increment by 1
nomaxvalue
nocache;

insert into blogMenu (bm_IdNum, bm_Name, bm_Lev, bm_Step, bm_ref, bm_IsDel) 
values (seq_blogMenu_idNum.nextval, 'html',1,0,0,'N');
insert into blogMenu (bm_IdNum, bm_Name, bm_Lev, bm_Step, bm_ref, bm_IsDel) 
values (seq_blogMenu_idNum.nextval, 'css',1,0,0,'N');
insert into blogMenu (bm_IdNum, bm_Name, bm_Lev, bm_Step, bm_ref, bm_IsDel) 
values (seq_blogMenu_idNum.nextval, 'javascript',1,0,0,'N');

commit;




