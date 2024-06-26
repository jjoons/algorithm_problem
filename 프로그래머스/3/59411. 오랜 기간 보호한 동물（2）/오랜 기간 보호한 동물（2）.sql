-- 코드를 입력하세요
SELECT 
    e.animal_id,
    e.name
    FROM animal_ins i
    JOIN animal_outs e ON
        e.animal_id = i.animal_id
    ORDER BY e.datetime - i.datetime DESC
    LIMIT 2
    ;