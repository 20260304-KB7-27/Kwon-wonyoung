use sqldb;

select sc.clubName,
       c.roomNo,
       s.stdName,
       s.addr
from stdtbl s
         join stdclubtbl sc on s.stdName = sc.stdName
         join clubtbl c on c.clubName = sc.clubName


select
       e2.emp    as 부하직원,
       e3.emp    as 직속상관,
       e3.empTel as 직속상관연락처
from emptbl e1
         left outer join emptbl e2 on e1.emp = e2.manager
         left outer join emptbl e3 on e1.manager = e3.emp
where e1.emp = '우대리';


