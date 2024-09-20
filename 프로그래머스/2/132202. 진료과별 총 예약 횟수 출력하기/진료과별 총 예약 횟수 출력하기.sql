-- 코드를 입력하세요
SELECT MCDP_CD as "진료과 코드", count(APNT_YMD) as "5월예약건수"
from APPOINTMENT
where month(APNT_YMD) = 5 
group by MCDP_CD
order by count(APNT_YMD), MCDP_CD asc;
# order by MCDP_CD;
