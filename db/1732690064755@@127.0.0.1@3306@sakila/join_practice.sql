-- Active: 1732690064755@@127.0.0.1@3306@sakila

-- 고객의 기본 정보, 주소 조회
SELECT c.first_name, c.last_name, c.email, a.address
FROM customer c
INNER JOIN address a ON c.address_id = a.address_id

SELECT c.first_name, c.last_name, c.email, a.address
FROM customer c
LEFT JOIN address a ON c.address_id = a.address_id

-- 고객의 기본 정보, 주소, 도시 조회
SELECT c.first_name, c.last_name, c.email, a.address, ci.city
FROM customer c
LEFT JOIN address a ON c.address_id = a.address_id
LEFT JOIN city ci ON a.city_id = ci.city_id

SELECT c.first_name, c.last_name, c.email, a.address, ci.city
FROM customer c
JOIN address a ON c.address_id = a.address_id
JOIN city ci ON a.city_id = ci.city_id

-- 고객의 기본 정보, 주소, 도시, 국가 조회
SELECT c.first_name, c.last_name, c.email, a.address, ci.city, co.country
FROM customer c
LEFT JOIN address a ON c.address_id = a.address_id
LEFT JOIN city ci ON a.city_id = ci.city_id
LEFT JOIN country co ON ci.country_id = co.country_id

-- London(city)에 사는 고객의 기본 정보, 주소, 도시 조회
SELECT c.first_name, c.last_name, c.email, a.address, ci.city
FROM customer c
LEFT JOIN address a ON c.address_id = a.address_id
LEFT JOIN city ci ON a.city_id = ci.city_id
WHERE ci.city = 'London'

-- 도시별 고객 수 조회
SELECT ci.city, count(*) as customer_count
FROM customer c
LEFT JOIN address a ON c.address_id = a.address_id
LEFT JOIN city ci ON a.city_id = ci.city_id
GROUP BY ci.city
ORDER BY customer_count desc

-- 배우가 출연한 영화 조회
SELECT f.title, f.release_year, f.`length`, f.rating, a.first_name
FROM film f
JOIN film_actor fa ON f.film_id = fa.film_id
JOIN actor a ON fa.actor_id = a.actor_id

SELECT a.first_name, a.last_name, f.title
FROM actor a
JOIN film_actor fa ON a.actor_id = fa.actor_id
JOIN film f ON fa.film_id = f.film_id
ORDER BY f.title

-- 배우별 출연 영화 수   ******
SELECT a.actor_id, COUNT(fa.film_id) as num_of_films
FROM actor a
JOIN film_actor fa ON a.actor_id = fa.actor_id
GROUP BY a.actor_id
ORDER BY num_of_films;

-- 영화 별 출연 배우 수
SELECT f.title, count(fa.actor_id) as actor_count
FROM film f
JOIN film_actor fa ON f.film_id = fa.film_id
GROUP BY f.film_id

-- 영화의 카테고리 정보
SELECT f.title, c.name
FROM film f
JOIN film_category fc ON f.film_id = fc.film_id
JOIN category c ON fc.category_id = c.category_id

-- 영화가 가지는 카테고리의 개수
SELECT f.title, count(c.category_id)
FROM film f
JOIN film_category fc ON f.film_id = fc.film_id
JOIN category c ON fc.category_id = c.category_id
GROUP BY f.film_id

-- 카테고리 별 영화 수
SELECT c.name, count(*)
FROM film f
JOIN film_category fc ON f.film_id = fc.film_id
JOIN category c ON fc.category_id = c.category_id
GROUP BY c.name

SELECT c.name, count(*)
FROM category c
JOIN film_category fc ON c.category_id = fc.category_id
JOIN film f ON fc.film_id = f.film_id
GROUP BY c.name

-- 배우가 출연한 영화를 카테고리 포함 조회
SELECT a.first_name, a.last_name, f.title, c.name
FROM actor a
JOIN film_actor fa ON a.actor_id = fa.actor_id
JOIN film f ON fa.film_id = f.film_id
JOIN film_category fc ON f.film_id = fc.film_id
JOIN category c ON fc.category_id = c.category_id