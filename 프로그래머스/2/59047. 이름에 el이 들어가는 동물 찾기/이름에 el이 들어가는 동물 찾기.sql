-- 코드를 입력하세요
SELECT a.animal_id, a.name FROM animal_ins a
WHERE a.animal_type = 'Dog' AND a.name LIKE '%EL%'
ORDER BY a.name
;