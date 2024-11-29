-- Active: 1732694339715@@127.0.0.1@3306@sakila
-- 고객의 기본 정보, 주소 조회
SELECT c.first_name, c.last_name, a.address
FROM customer c
JOIN address a ON c.address_id = a.address_id


-- 고객의 기본 정보, 주소, 도시 조회
SELECT c.first_name, c.last_name, a.address, ci.city
FROM customer c
JOIN address a ON c.address_id = a.address_id
JOIN city ci ON a.city_id = ci.city_id
ORDER BY ci.city

-- 고객의 기본 정보, 주소, 도시, 국가조회
SELECT c.first_name, c.last_name, a.address, ci.city, co.country
FROM customer c
JOIN address a ON c.address_id = a.address_id
JOIN city ci ON a.city_id = ci.city_id
JOIN country co ON ci.country_id = co.country_id

-- London(city)에 사는 고객의 기본 정보, 주소, 도시 조회
SELECT c.first_name, c.last_name, a.address, ci.city, co.country
FROM customer c
JOIN address a ON c.address_id = a.address_id
JOIN city ci ON a.city_id = ci.city_id
JOIN country co ON ci.country_id = co.country_id
WHERE ci.city = 'LONDON'


-- 도시별 고객 수 조회
SELECT ci.city, COUNT(c.customer_id) AS customer_count
FROM customer c
JOIN address a ON c.address_id = a.address_id
JOIN city ci ON a.city_id = ci.city_id
GROUP BY ci.city
ORDER BY customer_count DESC


-- 배우가 출연한 영화 조회

SELECT a.first_name, a.last_name, f.title
FROM actor a
LEFT JOIN film_actor fa ON a.actor_id = fa.actor_id
LEFT JOIN film f ON fa.film_id = f.film_id

SELECT a.first_name, a.last_name, f.title
FROM film f
LEFT JOIN film_actor fa ON f.film_id = fa.film_id
LEFT JOIN actor a ON fa.actor_id = a.actor_id
-- 만약, 배우가 없는 다큐멘터리 영화가 있다고 칩시다.
-- 우리가 영화 상세정보 조회에 출연한 배우 목록을 확인하고 싶어요.
-- 그때,
  -- 스파이더맨 : 주인공
  -- 스파이더맨 : 서브주인공
  -- 다큐멘터리 : null
-- 다큐멘터리 영화도 우리 사이트의 영화 디테일 페이지에서 보여주고 싶을 때
-- left join



-- 위의 두개 쿼리의 개수가 다른 이유 - actor가 없는 film이 존재하기 때문

SELECT * 
FROM film f
LEFT JOIN film_actor fa ON f.film_id = fa.film_id
-- WHERE fa.actor_id IS NULL
-- WHERE fa.film_id IS NULL
WHERE fa.last_update IS NULL


-- 배우별 출연 영화 수

SELECT a.first_name, a.last_name, COUNT(fa.film_id) AS film_count
FROM actor a
LEFT JOIN film_actor fa ON a.actor_id = fa.actor_id
-- LEFT JOIN film f ON fa.film_id = f.film_id 필요가 없다!
GROUP BY a.actor_id


-- 영화 별 출연 배우 수

SELECT f.title, COUNT(fa.actor_id)
FROM film f
LEFT JOIN film_actor fa ON f.film_id = fa.film_id
GROUP BY f.film_id

SELECT * FROM film_actor


-- 영화의 카테고리 정보

SELECT f.title, c.name AS category
FROM film f
JOIN film_category fc ON f.film_id = fc.film_id
JOIN category c ON fc.category_id = c.category_id


-- 영화가 가지는 카테고리의 개수

SELECT f.title, COUNT(c.category_id) AS category_count
FROM film f
JOIN film_category fc ON f.film_id = fc.film_id
JOIN category c ON fc.category_id = c.category_id
GROUP BY f.film_id
ORDER BY category_count DESC

SELECT * FROM film_category

SELECT DISTINCT film_id FROM film_category

-- 카테고리 별 영화 수
SELECT c.name, COUNT(f.film_id) as film_count
FROM film f
JOIN film_category fc ON f.film_id = fc.film_id
JOIN category c ON fc.category_id = c.category_id
GROUP BY c.category_id


-- 배우가 출연한 영화를 카테고리 포함 조회
SELECT a.first_name, a.last_name, f.title, c.name AS category
FROM actor a
LEFT JOIN film_actor fa ON a.actor_id = fa.actor_id
LEFT JOIN film f ON fa.film_id = f.film_id
LEFT JOIN film_category fc ON f.film_id = fc.film_id
LEFT JOIN category c  ON fc.category_id = c.category_id