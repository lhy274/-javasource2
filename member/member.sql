CREATE TABLE member(
	id number primary key,
	name varchar2(10) unique not null,
	addr varchar2(50) not null,
	nation varchar2(12) not null,
	email varchar2(30) not null,
	age number null
);
CREATE SEQUENCE member_seq;

insert into member values(member_seq.nextval,'홍길동','서울시 강남구','미국','hong132@naver.com',20);

select * from member;