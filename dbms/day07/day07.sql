SELECT * FROM EMP_DETAILS_VIEW edv ;


-- view
CREATE VIEW v_emp(
	emp_id, first_name, job_id, 
	hiredate, dept_id
) AS 
SELECT 	employee_id, first_name, job_id, 
		hire_date, department_id
FROM 	EMPLOYEES e 
WHERE 	job_id = 'ST_CLERK'
;
SELECT * FROM V_EMP ve ;

CREATE VIEW v_emp2(
	emp_id, first_name, job_id, 
	hiredate, dept_id
) AS 
SELECT 	employee_id, first_name, job_id, 
		hire_date, department_id
FROM 	EMPLOYEES e 
WHERE 	job_id = 'ST_CLERK'
;
-- view 삭제
DROP VIEW V_EMP2 ;
SELECT * FROM V_EMP2 ve ;

CREATE OR REPLACE VIEW v_emp3(
	emp_id, first_name, job_id, 
	hirdate, cms_pct
) AS 
SELECT 	employee_id, first_name, job_id,
		hire_date, NVL(commission_pct, 0)
FROM	EMPLOYEES e 
;

SELECT  *
FROM 	V_EMP3 ve  
WHERE 	EMP_ID = 139;
-- 오류 : ORA-01733: virtual column not allowed here
-- 함수로 작성된 부분은 수정 불가
UPDATE  V_EMP3 SET CMS_PCT = 0.5
WHERE 	EMP_ID = 139
;

/*
 * v_emp_salary
 * emp_id, last_name, salary, annual_sal
 * annual_sal 
 * : (salary + nvl(commission_pct,0)*salary)*12
 */
CREATE VIEW v_emp_salary(
	emp_id, last_name, salary, 
	annual_sal
) AS 
SELECT 	employee_id, last_name, salary,
		(salary + nvl(commission_pct,0)*salary)*12
FROM EMPLOYEES e 
;
-- King
SELECT * FROM V_EMP_SALARY ves
--UPDATE V_EMP_SALARY	SET last_name = 'King'
WHERE 	emp_id = 100;

SELECT * FROM EMPLOYEES e WHERE EMPLOYEE_ID = 100; 


CREATE VIEW v_emp_salary2(
	emp_id, last_name, salary, 
	annual_sal
) AS 
SELECT 	employee_id, last_name, salary,
		(salary + nvl(commission_pct,0)*salary)*12
FROM EMPLOYEES e 
WITH READ ONLY 
;
SELECT * FROM V_EMP_SALARY2 ves ;
-- 오류 : ORA-42399: cannot perform a DML operation on a read-only view
--SELECT * FROM V_EMP_SALARY2 ves
UPDATE V_EMP_SALARY2 SET last_name = 'King'
WHERE 	emp_id = 100;

/*
 * view 이름 : v_join
 * view 컬럼 : 사번, 이름(first_name last_name), 
 * 			부서번호, 부서명 입사일
 * 단, 동일한 이름의 view가 존재할때 해당 뷰로 대체 생성 
 */
CREATE OR REPLACE VIEW v_join(
	사번, 이름, 부서번호, 부서명, 입사일
) AS 
SELECT 	e.employee_id, 
		e.first_name || ' ' || e.last_name,
		d.department_id, d.department_name,
		e.hire_date
FROM 	EMPLOYEES e 
	LEFT OUTER JOIN DEPARTMENTS d 
	ON e.department_id = d.department_id
;

SELECT * FROM v_join;

-- sequence
CREATE SEQUENCE seq_serial_no
INCREMENT BY 1
START WITH 100
MAXVALUE 110
MINVALUE 99
CYCLE 
cache 2;

CREATE TABLE goods(
	good_no		number(3),
	gooe_name	varchar2(10)
);
-- nextval : 다음 값
INSERT INTO GOODS
VALUES (seq_serial_no.nextval, '제품1');
SELECT * FROM GOODS g ;

-- 현재 시퀀스 값 : 시퀀스이름.currval
INSERT INTO GOODS
VALUES (seq_serial_no.currval, '제품2');
SELECT * FROM GOODS g ;

SELECT seq_serial_no.currval FROM DUAL ;

DROP SEQUENCE seq_serial_no;

-- index
CREATE TABLE EMPLOYEES3 
AS SELECT * FROM EMPLOYEES e ;

SELECT 	rowid, EMPLOYEE_ID  
FROM 	EMPLOYEES3 e 
;
-- 102	Lex	De Haan	LDEHAAN	515.123.4569	2001-01-13 00:00:00.000	AD_VP	17000		100	90
SELECT * FROM EMPLOYEES3 e ORDER BY EMPLOYEE_ID ;
INSERT INTO EMPLOYEES3 e 
(employee_id, first_name, last_name)
VALUES 
(102, 'John', 'De Haan')
;
-- index 생성
-- employee_id, unique index
-- 에러 : ORA-01452: cannot CREATE UNIQUE INDEX; duplicate keys found
CREATE UNIQUE INDEX idx_employee3_id
ON EMPLOYEES3(employee_id);
CREATE INDEX idx_employee3_id
ON EMPLOYEES3(employee_id);

SELECT *
--DELETE  
FROM EMPLOYEES3 e 
WHERE 	EMPLOYEE_ID = 102
AND 	FIRST_NAME = 'John'
;




