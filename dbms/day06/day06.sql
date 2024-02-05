-- DDL
CREATE TABLE EMPLOYEES2(
	employee_id		number(10),
	name			varchar2(20),
	salary			number(7,2)
);

-- 기존 테이블과 동일하게 작성
CREATE TABLE EMPLOYEES3
AS 
SELECT * FROM EMPLOYEES2;

-- employees2 테이블에 컬럼 추가
ALTER TABLE EMPLOYEES2 add(
	manger_id	varchar2(10)
);

-- 컬럼 데이터타입 수정
ALTER TABLE EMPLOYEES2 modify(
	manger_id	varchar2(20)		
);

-- 컬럼을 삭제
ALTER TABLE EMPLOYEES2 
DROP COLUMN manger_id;

-- 테이블 삭제
DROP TABLE EMPLOYEES3 ;

SELECT * FROM EMPLOYEES2;
-- insert
INSERT INTO EMPLOYEES2
(employee_id, name, salary )
VALUES
(100, '홍길동', 3200);

INSERT INTO EMPLOYEES2
VALUES (101, '김디비', 3000);

-- 데이터 비워내기 : truncate
TRUNCATE TABLE EMPLOYEES2 ;
SELECT * FROM EMPLOYEES2 e ;


/*
 * 테이블 생성
 * 테이블명: sample
 * 컬럼 	: deptNo 	- number(10)
 * 		  deptName	- varchar2(15)
 * 		  deptloc	- varchar2(15)
 * 		  depManager- varchar2(10)
 * 임의의 데이터 3건 insert
 */

CREATE TABLE sample(
	deptNo		number(20),
	deptName	varchar2(15),
	deptLoc		varchar2(15),
	deptManager	varchar2(10)
);

INSERT INTO SAMPLE
VALUES (10, '기획실', '서울', '홍길동');
INSERT INTO SAMPLE
VALUES (20, '전산실', '부산', '김자바');
INSERT INTO SAMPLE
VALUES (30, '영업부', '광주', null);
SELECT * FROM SAMPLE s ;

-- update30
-- 부서번호가 30번인 부서의 부서번호를 50번으로 수정
UPDATE 	SAMPLE SET DEPTNO = 50
-- SELECT * FROM SAMPLE s 
WHERE 	DEPTNO = 30;
SELECT * FROM SAMPLE s ;

-- 부서명이 '영업부'인 부서의 위치를 '인천'으로 수정
UPDATE SAMPLE SET DEPTLOC = '인천'
WHERE DEPTNAME = '영업부';
SELECT * FROM SAMPLE s ;

-- 영업부를 삭제
DELETE sample WHERE deptName = '영업부';
SELECT * FROM SAMPLE s ;


COMMIT;
SELECT * FROM SAMPLE s ;
DELETE sample;
ROLLBACK;

-- not null
CREATE TABLE null_test(
	col1 	varchar2(20) NOT NULL,
	col2	varchar2(20) NULL, 
	col3	varchar2(20)
);
SELECT * FROM NULL_TEST;
SELECT * FROM NULL_TEST nt ;
INSERT INTO NULL_TEST nt (col1, col2)
VALUES ('aa', 'bb');
-- 오류 :  cannot insert NULL into ("HR"."NULL_TEST"."COL1")
INSERT INTO NULL_TEST nt (col2, col3)
VALUES ('cc', 'dd');
INSERT INTO NULL_TEST nt (col1, col3)
VALUES ('cc', 'dd');
SELECT * FROM NULL_TEST nt ;

-- unique
CREATE TABLE unique_test(
	col1	varchar2(20) UNIQUE NOT NULL,
	col2	varchar2(20) UNIQUE,
	col3 	varchar2(20) NOT NULL,
	col4 	varchar2(20) NOT NULL,
	CONSTRAINTS temp_unique unique(col3, col4)
);
SELECT * FROM UNIQUE_TEST ut ;
SELECT * FROM UNIQUE_TEST ut ;
INSERT INTO UNIQUE_TEST(col1, col2, col3, col4)
VALUES ('aa','bb','cc','dd');
INSERT INTO UNIQUE_TEST(col1, col2, col3, col4)
VALUES ('aa2','bb2','cc2','dd2');
-- 오류 :  unique constraint (HR.SYS_C007023) violated
UPDATE 	UNIQUE_TEST 
SET 	COL1 = 'aa'
WHERE 	col2 = 'bb2';

INSERT INTO UNIQUE_TEST(col1, col2, col3, col4)
VALUES ('aa3','','cc3','dd3');
INSERT INTO UNIQUE_TEST(col1, col2, col3, col4)
VALUES ('aa4','','cc4','dd4');
SELECT * FROM UNIQUE_TEST ut ;
------------
-- unique 제약으로 들어가는 컬럼들은 그들의 조합이 유일해야 한다.
-- 각 컬럼의 데이터의 유일함은 의미가 없고, 조합이 유일해야한다.
CREATE TABLE UNIQUE_TEST2(
	col1	varchar2(20),
	col2	varchar2(20),
	CONSTRAINTS temp_unique2 unique(col1, col2)
);
SELECT * FROM UNIQUE_TEST2 ut ;
INSERT INTO UNIQUE_TEST2(col1, col2)
VALUES ('aa','aa');
INSERT INTO UNIQUE_TEST2(col1, col2)
VALUES ('aa','aa3');
INSERT INTO UNIQUE_TEST2(col1, col2)
VALUES ('aa3','aa');


-- check
CREATE TABLE check_test(
	gender varchar2(10) NOT NULL ,
	CONSTRAINTS check_gender check(gender IN('M','F'))
);
SELECT * FROM check_test;

INSERT INTO check_test VALUES ('M');
INSERT INTO check_test VALUES ('F');
-- 오류 : check constraint (HR.CHECK_GENDER) violated
INSERT INTO check_test VALUES ('남');
INSERT INTO check_test VALUES ('여');

---------------------------------------
-- 기본키(Primary Key)
CREATE TABLE primary_test(
	student_id	number(10) PRIMARY KEY ,
	name		varchar2(20)
);
SELECT * FROM primary_test;


CREATE TABLE primary_test2(
	student_id	number(10),
	name		varchar2(20),
	CONSTRAINTS student_pk PRIMARY KEY (student_id)
);
SELECT * FROM PRIMARY_TEST2 pt ;

--------------------------------------
CREATE TABLE daddy(
	idx		NUMBER ,
	mID		NUMBER PRIMARY key
);
CREATE TABLE daughter(
	idx		NUMBER PRIMARY key,
	mID		NUMBER ,
	CONSTRAINTS fk_da FOREIGN KEY (mID)
	REFERENCES DADDY(mID) ON DELETE CASCADE 
);

INSERT INTO DADDY d VALUES (1, 10);
INSERT INTO DADDY d VALUES (2, 20);
SELECT * FROM DADDY d ;
SELECT * FROM DAUGHTER d ;
INSERT INTO DAUGHTER d VALUES (100, 10);
INSERT INTO DAUGHTER d VALUES (101, 10);
INSERT INTO DAUGHTER d VALUES (102, 10);
INSERT INTO DAUGHTER d VALUES (200, 20);
INSERT INTO DAUGHTER d VALUES (201, 20);
INSERT INTO DAUGHTER d VALUES (202, 20);

SELECT * FROM DADDY d ;
DELETE FROM DADDY d WHERE idx = 1;

CREATE TABLE daughter2(
	idx		NUMBER PRIMARY key,
	mID		NUMBER ,
	CONSTRAINTS fk2_da FOREIGN KEY (mID)
	REFERENCES DADDY(mID) ON DELETE SET NULL 
);
INSERT INTO DAUGHTER2 d VALUES (200, 20);
INSERT INTO DAUGHTER2 d VALUES (201, 20);
INSERT INTO DAUGHTER2 d VALUES (202, 20);
SELECT * FROM DAUGHTER2;

DELETE FROM DADDY d WHERE idx = 2;


