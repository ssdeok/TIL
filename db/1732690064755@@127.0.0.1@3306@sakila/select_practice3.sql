-- Active: 1732690064755@@127.0.0.1@3306@sakila

- film: 영화
- title: 제목
- rental_rate: 대여료
- rating: 등급
- length: 상영 시간
- rental_duration: 대여 기간
- replacement_cost: 교체 비용

-- 1. 모든 영화의 제목과 대여료를 조회하시오.
SELECT f.title, f.rental_rate FROM film f;

-- 2. 대여료가 4달러 이상인 영화의 제목과 대여료를 조회하시오.
SELECT f.title, f.rental_rate FROM film f
WHERE f.rental_rate >= 4;

-- 3. 등급별 영화 수를 조회하시오.
-- 등급별
-- 영화 수를
-- 조회하시오
SELECT f.rating, count(*) FROM film f
GROUP BY f.rating;

-- 4. 상영 시간을 중복 제거하여 내림차순으로 정렬하고, 상위 10개를 조회하시오.
-- 상영 시간을 
-- 중복 제거하여 
-- 내림차순으로 정렬하고, 
-- 상위 10개를 조회하시오.
SELECT DISTINCT f.length FROM film f
ORDER BY f.length DESC
LIMIT 10;

-- 5. 대여 기간별 영화 수를 대여 기간 내림차순으로 정렬하여 조회하시오.
-- 대여 기간별 
-- 영화 수를 
-- 대여 기간 내림차순으로 정렬하여 
-- 조회하시오.
SELECT f.rental_duration, count(*) FROM film f
GROUP BY f.rental_duration
ORDER BY f.rental_duration DESC;

-- 6. 대여 기간이 5일 이상이고 대여료가 4달러 이상인 영화의 제목, 대여 기간, 대여료를 조회하시오.
-- 대여 기간이 5일 이상이고 
-- 대여료가 4달러 이상인 
-- 영화의 제목, 대여 기간, 대여료를 조회하시오.
SELECT f.title, f.rental_duration, f.rental_rate FROM film f
WHERE f.rental_duration >= 5 AND f.rental_rate >=4;

-- 7. 등급이 'R'인 영화 중 처음 10개의 제목과 등급을 조회하시오.
-- 등급이 'R'인 영화 중 
-- 처음 10개의 
-- 제목과 등급을 조회하시오.
SELECT f.title, f.rating FROM film f
WHERE f.rating = 'R'
LIMIT 10;

-- 8. 대여료별 영화 수를 영화 수 내림차순으로 정렬하여 조회하시오.
-- 대여료별 
-- 영화 수를 
-- 영화 수 내림차순으로 정렬하여
-- 조회하시오.
SELECT f.rental_rate, count(*) FROM film f
GROUP BY f.rental_rate
ORDER BY count(*) DESC;

-- 9. 교체 비용별 영화 수와 평균 대여료를 교체 비용 오름차순으로 정렬하여 조회하시오.
-- 교체 비용별 
-- 영화 수와 
-- 평균 대여료를
-- 교체 비용 오름차순으로 정렬하여 
-- 조회하시오.
SELECT f.replacement_cost, count(*), AVG(rental_rate) FROM film f
GROUP BY f.replacement_cost
ORDER BY f.replacement_cost;

-- 10. 제목에 'angel'이 포함된 영화의 제목을 조회하시오.
SELECT f.title FROM film f
WHERE f.title LIKE '%angel%';

-- 11. 등급별 평균 대여료가 3달러 미만인 등급과 평균 대여료를 조회하시오.
-- 등급별 
-- 평균 대여료가 3달러 미만인 
-- 등급과 평균 대여료를 조회하시오.
SELECT f.rating, AVG(rental_rate) FROM film f
GROUP BY f.rating
HAVING AVG(rental_rate) < 3;

-- 12. 상영 시간이 10번째에서 15번째로 긴 영화의 제목과 상영 시간을 조회하시오. (상영 시간이 같을 경우 제목 오름차순으로 정렬)
-- 12. 상영 시간이 10번째에서 15번째로 긴 영화의 제목과 상영 시간을 조회하시오. (상영 시간이 같을 경우 제목 오름차순으로 정렬)
SELECT f.title, f.length FROM film f
-ORDER BY f.length desc, f.title
--LIMIT 5 OFFSET 10;
--LIMIT 6 OFFSET 9;

-- 13. 등급이 'PG' 또는 'G'이면서 대여 기간이 4일 이하인 영화의 제목, 등급, 대여 기간을 조회하시오.
-- 13. 등급이 'PG' 또는 'G'이면서 대여 기간이 4일 이하인 영화의 제목, 등급, 대여 기간을 조회하시오.
SELECT f.title, f.rating, f.rental_duration FROM film f
WHERE f.rating IN ('PG', 'G') AND f.rental_duration <= 4;

-- 14. 등급별 영화 수와 평균 상영 시간을 조회하시오.
SELECT f.rating, count(*), AVG(length) FROM film f
GROUP BY f.rating;

-- 15. 상영 시간이 60분 이상 120분 이하인 영화의 제목과 상영 시간을 상영 시간 오름차순으로 조회하시오.
SELECT f.title, f.`length` FROM film f
WHERE `length` BETWEEN 60 AND 120
ORDER BY `length`;


-- 배우와 출연 영화 목록 M:N
SELECT * 
FROM actor



-- 모든 고객의 대여 현황 조회 1:N
SELECT * 
FROM customer c


-- 영화별 대여 현황 M:N


