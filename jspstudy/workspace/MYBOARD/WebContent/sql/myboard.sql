DROP TABLE reply;
DROP TABLE qnaReply;
drop table qna;
drop table board;

create table qna (
	idx NUMBER PRIMARY KEY,
	writer VARCHAR2(100),
	title VARCHAR2(100),
	content VARCHAR2(1000),
	category VARCHAR2(100),
	readCount NUMBER,
	register DATE
);

create table board (
	idx NUMBER PRIMARY KEY,
	writer VARCHAR2(100),
	title VARCHAR2(100),
	content VARCHAR2(1000),
	category VARCHAR2(100),
	readCount NUMBER,
	register DATE
);



DROP SEQUENCE qna_seq;
DROP SEQUENCE board_seq;

CREATE SEQUENCE qna_seq NOCACHE;
CREATE SEQUENCE board_seq NOCACHE;

create table reply (
	ridx 	NUMBER PRIMARY KEY,
	writer  VARCHAR2(100),
	content VARCHAR2(2000),
	idx		NUMBER,
	register DATE
);

create table qnaReply (
	ridx 	NUMBER PRIMARY KEY,
	writer  VARCHAR2(100),
	content VARCHAR2(2000),
	idx		NUMBER,
	register DATE
);

DROP SEQUENCE reply_seq;
CREATE SEQUENCE reply_seq NOCACHE;

DROP SEQUENCE qnaReply_seq;
CREATE SEQUENCE qnaReply_seq NOCACHE;

/* 외래키 */
ALTER TABLE qnaReply ADD CONSTRAINT qnaReply_qna_fk FOREIGN KEY(idx) REFERENCES qna(idx) ON DELETE CASCADE;
ALTER TABLE reply ADD CONSTRAINT reply_board_fk FOREIGN KEY(idx) REFERENCES board(idx) ON DELETE CASCADE;




/* 회원 테이블 */
DROP TABLE MEMBER_LOG;
DROP TABLE MEMBER;

CREATE TABLE MEMBER
(
	MNO		NUMBER PRIMARY KEY,
	ID 		VARCHAR2(32) NOT NULL UNIQUE,
	PW 		VARCHAR2(100) NOT NULL,
	NAME    VARCHAR2(50)  NOT NULL,
	EMAIL   VARCHAR2(100),
	PHONE   VARCHAR2(100),
	BIRTH   VARCHAR2(10),
	GENDER  CHAR(1),
	REGISTER DATE
);

CREATE TABLE MEMBER_LOG 
(
	/* 기록번호 */    LNO	  NUMBER   PRIMARY KEY,
	/* 아이디 */	  ID 	  VARCHAR2(32),
	/* 로그인일시 */  LOGIN	  DATE
);
ALTER TABLE MEMBER_LOG ADD CONSTRAINT MEMBER_LOG_MEMBER_FK 
   FOREIGN KEY(ID) REFERENCES MEMBER(ID) ON DELETE CASCADE;    /* 탈퇴하면 로그 자동 삭제 */

DROP SEQUENCE MEMBER_SEQ;
DROP SEQUENCE MEMBER_LOG_SEQ;

CREATE SEQUENCE MEMBER_SEQ NOCACHE;
CREATE SEQUENCE MEMBER_LOG_SEQ NOCACHE;

INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL, 'admin', 'aaaa1111', '관리자', 'admin@myhome.com', '010-1111-1111','19800101', 'W', SYSDATE);
INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL, 'scott', 'aaaa1111', '스캇', 'scott@myhome.com', '010-2222-2222','19900101', 'M', SYSDATE);




