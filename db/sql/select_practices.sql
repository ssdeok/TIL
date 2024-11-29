-- - film: 영화
-- - title: 제목
-- - rental_rate: 대여료
-- - rating: 등급
-- - length: 상영 시간
-- - rental_duration: 대여 기간
-- - replacement_cost: 교체 비용

-- 1. 모든 영화의 제목과 대여료를 조회하시오.
SELECT f.title, f.rental_rate FROM film f;

-- 2. 대여료가 4달러 이상인 영화의 제목과 대여료를 조회하시오.
-- 대여료가 4달러 이상인            rental rate > 4
-- 영화의                           from film
-- 제목과 대여료를 조회하시오.        title, rental rate

SELECT f.title, f.rental_rate 
FROM film f
WHERE f.rental_rate >= 4;


-- 3. 등급별 영화 수를 조회하시오.
-- 등급별        group by rating
-- 영화 수를    count(film)
-- 조회하시오.   select

SELECT f.rating, COUNT(*) film_count FROM film f
GROUP BY f.rating


-- 4. 상영 시간을 중복 제거하여 내림차순으로 정렬하고, 상위 10개를 조회하시오.
-- 상영 시간을              length
-- 중복 제거하여            distinct
-- 내림차순으로 정렬하고,     order desc
-- 상위 10개를 조회하시오.    limit
SELECT DISTINCT f.`length` FROM film f
ORDER BY f.`length` DESC
LIMIT 10



-- 5. 대여 기간별 영화 수를 대여 기간 내림차순으로 정렬하여 조회하시오.
-- 대여 기간별                group by rental_duration
-- 영화 수를                   count(film)
-- 대여 기간 내림차순으로 정렬    order rental_duration / desc
-- 하여 조회하시오.             select
SELECT f.rental_duration, COUNT(*) film_count FROM film f
GROUP BY f.rental_duration
ORDER BY f.rental_duration DESC



-- 6. 대여 기간이 5일 이상이고 대여료가 4달러 이상인 영화의 제목, 대여 기간, 대여료를 조회하시오.
-- 대여 기간이 5일 이상이고                   rental_duration > 5
-- 대여료가 4달러 이상인                      rental_rate > 4
-- 영화의 제목, 대여 기간, 대여료를 조회하시오.
SELECT f.title, f.rental_duration, f.rental_rate FROM film f
WHERE f.rental_duration >= 5
  AND f.rental_rate >= 4

-- 7. 등급이 'R'인 영화 중 처음 10개의 제목과 등급을 조회하시오.
-- 등급이 'R'인 영화             rating = 'r'
--  중 처음 10개의              limit 10
--  제목과 등급을 조회하시오.     select
SELECT f.title, f.rating
FROM film f
WHERE f.rating = 'R'

-- 8. 대여료별 영화 수를 영화 수 내림차순으로 정렬하여 조회하시오.
--  대여료별 
--  영화 수를
--   영화 수 내림차순으로 정렬하여 
--   조회하시오.
SELECT f.rental_rate, COUNT(*) as film_count FROM film f
GROUP BY f.rental_rate
ORDER BY film_count DESC

-- 9. 교체 비용별 영화 수와 평균 대여료를 교체 비용 오름차순으로 정렬하여 조회하시오.

-- 교체 비용별                          group by replace__
-- 영화 수와                             count(film)
-- 평균 대여료를                        avg(rental_rate)
-- 교체 비용 오름차순으로 정렬하여        ordrr by replace~~
-- 조회하시오.
SELECT f.replacement_cost, COUNT(*) film_count, AVG(f.rental_rate) avg_rental FROM film f
GROUP BY f.replacement_cost
ORDER BY f.replacement_cost


-- 10. 제목에 'angel'이 포함된 영화의 제목을 조회하시오.
SELECT f.title FROM film f
WHERE f.title LIKE '%angel%';

-- 11. 등급별 평균 대여료가 3달러 미만인 등급과 평균 대여료를 조회하시오.
-- 등급별                             group by rating
-- 평균 대여료가 3달러 미만인         avg(rental_rate) < 3
-- 등급과 평균 대여료를 조회하시오.    select
SELECT f.rating, AVG(rental_rate) avg_rate FROM film f
GROUP BY f.rating
HAVING avg_rate < 3

-- 12. 상영 시간이 10번째에서 15번째로 긴 영화의 제목과 상영 시간을 조회하시오. (상영 시간이 같을 경우 제목 오름차순으로 정렬)
-- 상영 시간이                                     length
-- 10번째에서 15번째로                             limit 10 ~ 15 / 9번째 이후에서 6개
-- 긴 영화의                                       order by length desc
-- 제목과 상영 시간을 조회하시오.                     
-- (상영 시간이 같을 경우 제목 오름차순으로 정렬)    order by length => title
SELECT f.title, f.`length` FROM film f
ORDER BY f.`length` DESC, f.title
LIMIT 6 OFFSET 9
-- LIMIT 9, 6


-- 13. 등급이 'PG' 또는 'G'이면서 대여 기간이 4일 이하인 영화의 제목, 등급, 대여 기간을 조회하시오.
-- 등급이 'PG' 또는 'G'이면서                 rating = pg, g / where
-- 대여 기간이 4일 이하인                     rental durgion < 4 / where
-- 영화의 제목, 등급, 대여 기간을 조회하시오.
SELECT f.title, f.rating, f.rental_duration FROM film f
WHERE f.rental_duration <= 4
  AND (f.rating = 'PG' OR f.rating = 'G')
  -- AND f.rating IN ('PG', 'G')



-- 14. 등급별 영화 수와 평균 상영 시간을 조회하시오.
-- 등급별                group by rating
-- 영화 수와              count(film)
-- 평균 상영 시간을        avg(length)
SELECT COUNT(*) film_count, AVG(f.`length`) avg_length FROM film f
GROUP BY f.rating


-- 15. 상영 시간이 60분 이상 120분 이하인 영화의 제목과 상영 시간을 상영 시간 오름차순으로 조회하시오.
-- 상영 시간이 60분 이상 120분 이하인   length 60 ~ 120 wherer
-- 영화의 제목과 상영 시간을           title, length
-- 상영 시간 오름차순으로               orderby length 
-- 조회하시오.

SELECT f.title, f.`length` FROM film f
-- WHERE f.`length` BETWEEN 60 AND 120
WHERE f.`length` >= 60 AND f.`length` <= 120
ORDER BY f.`length`


