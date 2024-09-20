-- 코드를 입력하세요
SELECT SUBSTRING(PRODUCT_CODE, 1, 2) as "코드", count(*)
from PRODUCT
Group by SUBSTRING(PRODUCT_CODE, 1, 2)
order by SUBSTRING(PRODUCT_CODE, 1, 2) asc;