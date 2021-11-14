DROP TABLE astudent;
CREATE TABLE astudent(
	stuNo NUMBER PRIMARY KEY,
	name VARCHAR2(100),
	grade NUMBER(1),
	addr varchar2(100),
	email varchar2(30),
	score varchar2(10),
	major VARCHAR2(50),
	register DATE
);

DROP SEQUENCE stuNo_seq;
CREATE SEQUENCE stuNo_seq INCREMENT BY 1 START WITH 202201 NOCACHE NOCYCLE;


