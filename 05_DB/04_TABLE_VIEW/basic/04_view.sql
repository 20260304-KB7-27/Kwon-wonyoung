use employees;


/*
View
- 실제 데이터 저장 x
- 하나 이상의 테이블을 조회하는 select 문을 가상의 테이블로 사용하는 객체

- 원본 변경 반영
- insert, update, delete 비권장

장점
- 자주 사용하는 select 쿼리를 재사용 가능
- 보안, 편의성, 유지보수성 확보
 */

-- 참조하고 있는 테이블이 사라지면 뷰도 같이 가기 때문에 유의
create OR REPLACE view v_employees
as
select emp_no, concat(first_name, ' ', last_name)
from employees;

select * from v_employees where emp_no = '2'