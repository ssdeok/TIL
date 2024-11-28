-- Active: 1732690064755@@127.0.0.1@3306@world

SELECT Name, IndepYear FROM country 
ORDER BY IndepYear IS NULL DESC, IndepYear DESC;

-- country 테이블에서 대륙별로 정렬하고, 같은 대륙 내에서는 GNP가 높은 순으로 정렬하여 Name, Continent, GNP을 조회하시오
SELECT c.`Name`, c.`Continent`, c.`GNP` FROM country c
ORDER BY `Continent`, `GNP` DESC;

-- country 테이블에서 기대수명이 짧은 순으로 정렬하되, NULL값은 마지막에 나오도록 정렬하여 Name, LifeExpectancy을 조회하시오
SELECT c.`Name`, c.`LifeExpectancy` FROM country c
ORDER BY `LifeExpectancy` IS NULL, `LifeExpectancy`;

-- 대륙 별 국가 수가 많은 순서대로 Continent, 국가 수를 조회하시오.
SELECT c.`Continent`, COUNT(*) total_na FROM country c
GROUP BY Continent
ORDER BY total_na DESC;

-- 독립년도가 있는 국가들의 대륙 별 평균 기대수명이 높은 순서대로 Continent, 평균 기대수명을 조회하시
SELECT c.`Continent`, AVG(`LifeExpectancy`) avg_heart  FROM country c
WHERE IndepYear IS NOT NULL
GROUP BY `Continent`
ORDER BY avg_heart DESC;

SELECT * FROM city LIMIT 5;


SELECT * FROM city 
LIMIT 10 OFFSET 10
ORDER BY `Population` desc;