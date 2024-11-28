-- Active: 1732690064755@@127.0.0.1@3306@sakila
- film: 영화
- title: 제목
- rental_rate: 대여료
- rating: 등급
- length: 상영 시간
- rental_duration: 대여 기간
- replacement_cost: 교체 비용


-- 1. 모든 영화의 제목과 대여료를 조회하시오.
SELECT c.title, c.rental_rate  FROM film c;

-- 2. 대여료가 4달러 이상인 영화의 제목과 대여료를 조회하시오.
SELECT c.title, c.rental_rate FROM film c
WHERE c.rental_rate >= 4;

-- 3. 등급별 영화 수를 조회하시오.
SELECT count(*) FROM film c
GROUP BY rating;

-- 4. 상영 시간을 중복 제거하여 내림차순으로 정렬하고, 상위 10개를 조회하시오.
SELECT DISTINCT length FROM film as f
ORDER BY length DESC
LIMIT 10;

-- 5. 대여 기간별 영화 수를 대여 기간 내림차순으로 정렬하여 조회하시오.
SELECT f.`rental_duration`, COUNT(*) FROM film f
GROUP BY rental_duration
ORDER BY rental_duration desc;
SELECT * FROM film;

-- 6. 대여 기간이 5일 이상이고 대여료가 4달러 이상인 영화의 제목, 대여 기간, 대여료를 조회하시오.
SELECT f.title, f.rental_duration, f.rental_rate  FROM film f
WHERE rental_duration >=5 AND rental_rate >=4;

-- 7. 등급이 'R'인 영화 중 처음 10개의 제목과 등급을 조회하시오.
SELECT title, rating FROM film
WHERE rating = 'R'
LIMIT 10;

-- 8. 대여료별 영화 수를 영화 수 내림차순으로 정렬하여 조회하시오.
SELECT rental_rate, count(*) FROM film
GROUP BY rental_rate
ORDER BY count(*) desc;

-- 9. 교체 비용별 영화 수와 평균 대여료를 교체 비용 오름차순으로 정렬하여 조회하시오.
SELECT replacement_cost, count(*), AVG(`rental_rate`)  FROM film
GROUP BY replacement_cost
ORDER BY replacement_cost;

-- 10. 제목에 'angel'이 포함된 영화의 제목을 조회하시오.
SELECT title FROM film
WHERE title LIKE '%angel%';

-- 11. 등급별 평균 대여료가 3달러 미만인 등급과 평균 대여료를 조회하시오.
SELECT rating, AVG(rental_rate)  FROM film
GROUP BY rating
HAVING AVG(rental_rate) < 3;

SELECT AVG(rental_rate), rating FROM film
WHERE rating = 'pg';

-- 12. 상영 시간이 10번째에서 15번째로 긴 영화의 제목과 상영 시간을 
-- 조회하시오. (상영 시간이 같을 경우 제목 오름차순으로 정렬)
SELECT title, length  FROM film
ORDER BY length desc, title
LIMIT 5 OFFSET 10;

-- 13. 등급이 'PG' 또는 'G'이면서 대여 기간이 
--4일 이하인 영화의 제목, 등급, 대여 기간을 조회하시오.
SELECT f.title, f.rating, f.rental_duration FROM film f
WHERE rental_duration <= 4 AND (rating ='G' or rating ='PG');

SELECT f.title, f.rating, f.rental_duration FROM film f
WHERE rental_duration <= 4 AND rating IN ('G','PG');


SELECT f.title, f.rating, f.rental_duration FROM film f
WHERE rental_duration <= 4 AND rating ='G';


SELECT f.title, f.rating, f.rental_duration FROM film f
WHERE rental_duration <= 4 AND rating ='PG';

SELECT * FROM film

SELECT rental_duration FROM film
ORDER BY rental_duration IS NOT NULL;
WHERE rating = 'g' AND rental_duration <= 4;

-- 14. 등급별 영화 수와 평균 상영 시간을 조회하시오.
SELECT rating, count(*), AVG(length) FROM film
GROUP BY rating;

-- 15. 상영 시간이 60분 이상 120분 이하인 영화의 제목과 
--상영 시간을 상영 시간 오름차순으로 조회하시오.
SELECT `title`, `length` FROM film
WHERE length BETWEEN 60 AND 120
ORDER BY `length`;