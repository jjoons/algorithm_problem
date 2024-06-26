-- 코드를 입력하세요
SELECT fw.warehouse_id, fw.warehouse_name, fw.address,
IFNULL(fw.freezer_yn, 'N') AS FREEZER_YN
    FROM food_warehouse fw
    WHERE fw.warehouse_name LIKE '창고_경기%'
    ORDER BY fw.warehouse_id
;
