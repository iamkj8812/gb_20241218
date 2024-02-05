-- 부서를 할당받은 부서별 사원수 중에서 
-- 총 사원수가 10명 이상인 부서를 출력 
SELECT 	DEPARTMENT_ID , COUNT(*) 
FROM 	EMPLOYEES e
WHERE 	DEPARTMENT_ID IS NOT NULL 
-- AND 	count(*) >= 10
GROUP BY DEPARTMENT_ID 
HAVING COUNT(*) >= 10 
ORDER BY DEPARTMENT_ID 
;

/*
 * 문제1) EMPLOYEES 테이블에서 job_id가 'SA'로 시작하는 
 * 사람에 대하여 급여의 평균, 최고액, 최저액, 합계를 구하여 출력하여라.
 */
SELECT 	AVG(SALARY), MAX(SALARY),
		MIN(SALARY), SUM(SALARY)  
FROM 	EMPLOYEES e
WHERE 	JOB_ID  LIKE 'SA%'
;

/*
 * 문제2) EMPLOYEES 테이블에 등록되어 있는 인원수, 
	커미션이 NULL이 아닌 인원수, 연봉평균, 
	등록되어 있는 부서의 수를 구하여 출력하라.
 */
SELECT 	COUNT(*) ,
		COUNT(COMMISSION_PCT) ,
		AVG(salary),
		COUNT(DISTINCT DEPARTMENT_ID) 
FROM 	EMPLOYEES e 
;

/*
 * 문제3) EMPLOYEES 테이블에서 부서별로 인원수, 
	평균 급여, 최저급여, 최고 급여, 급여의 합을 구하여 출력하라.
 */
SELECT 	DEPARTMENT_ID , COUNT(*),
		AVG(SALARY), MAX(SALARY),
		MIN(SALARY), SUM(SALARY)  
FROM 	EMPLOYEES e
GROUP BY DEPARTMENT_ID 
;
/*
 * 문제4)EMPLOYEES테이블에서 각 부서별로 인원수,
 * 급여의 평균, 최저급여, 최고급여, 급여의합을 구하여
 * 급여의 합이 많은 순으로 출력하라
 */
SELECT 	DEPARTMENT_ID , COUNT(*),
		AVG(SALARY), MAX(SALARY),
		MIN(SALARY), SUM(SALARY) AS sumsal
FROM 	EMPLOYEES e
GROUP BY DEPARTMENT_ID
ORDER BY sumsal DESC
;

/*
 * 문제5)EMPLOYEES 테이블에서 부서별, 업무별 그룹하여 
 * 결과를 부서번호, 
   업무, 인원수, 급여의 평균, 급여의 합을 구하여 출력하여라.
 */
SELECT 	DEPARTMENT_ID , JOB_ID ,
		COUNT(*), AVG(SALARY), SUM(SALARY)  
FROM 	EMPLOYEES e
GROUP BY DEPARTMENT_ID , JOB_ID 
;
/*
 * 문제6) EMPLOYEES 테이블에서 
 * 부서 인원이 4명보다 많은 부서의 부서번호, 
	인원수, 급여의 합을 구하여 출력하여라
 */
SELECT 	DEPARTMENT_ID , COUNT(*), SUM(SALARY)  
FROM 	EMPLOYEES e
GROUP BY DEPARTMENT_ID 
HAVING COUNT(*) > 4 
;

-- 문제7) EMPLOYEES 테이블에서 업무별 급여의 평균이 
-- 10000 이상인 업무에 대해서 업무명,
-- 평균 급여, 급여의 합을 구하여 출력하라.
SELECT 	JOB_ID , AVG(SALARY), SUM(SALARY)  
FROM 	EMPLOYEES e
GROUP BY JOB_ID 
HAVING AVG(SALARY) >= 10000 
;

-- 문제8)동일한 직업(JOB_ID)을 가진 사원들의 총 수를 조회한다.
SELECT 	JOB_ID , COUNT(*) 
FROM 	EMPLOYEES e
GROUP BY JOB_ID 
;



