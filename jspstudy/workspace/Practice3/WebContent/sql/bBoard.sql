drop table bboard;
create table bboard (
	idx NUMBER PRIMARY KEY,
	writer VARCHAR2(100),
	title VARCHAR2(100),
	content VARCHAR2(1000),
	category VARCHAR2(100),
	readCount NUMBER,
	register DATE
);

DROP SEQUENCE bboard_seq;
CREATE SEQUENCE bboard_seq NOCACHE;


