-- 코드를 입력하세요
SELECT
    a.animal_id
FROM animal_ins a
WHERE a.name IS NULL OR a.name = ''
;