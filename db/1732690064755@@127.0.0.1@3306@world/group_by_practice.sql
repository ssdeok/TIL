-- Active: 1732690064755@@127.0.0.1@3306@world

-- 대륙별 총 인구수를 구하시오.
SELECT c.`Continent`, SUM(c.`Population`) FROM country c
GROUP BY c.`Continent`;
-- Region별로 GNP가 가장 높은 Region을 찾으시오
SELECT c.`Region`, MAX(`GNP`) FROM country c
GROUP BY c.`Region`;

-- 대륙별 평균 GNP와 평균 인구를 구하시오
SELECT c.`Continent`, AVG(c.`GNP`), AVG(c.`Population`) FROM country c
GROUP BY c.`Continent`;

-- 인구가 50만에서 100만 사이인 도시들에 대해, District별 도시 수를 구하시오
SELECT c.`District`, COUNT(*) FROM city c
WHERE c.`Population` BETWEEN 500000 AND 1000000
GROUP BY c.`District`;

-- 아시아 대륙 국가들의 Region별 총 GNP를 구하세요
SELECT c.`Region`, SUM(c.`GNP`) total_GNP FROM country c
WHERE c.`Continent` = 'asia'
GROUP BY c.`Region`;

--------------------------
SELECT Continent, COUNT(*) as country_count
FROM country
GROUP BY Continent
HAVING country_count > 20;


-- 각 국가별 도시가 10개 이상인 국가의 CountryCode, 도시 수를 조회하시오.
SELECT  `CountryCode`, count(*) total_City  FROM city
GROUP BY CountryCode
HAVING total_City >= 10;

-- District별 평균 인구가 100만 이상이면서 도시 수가 3개 이상인 District,  도시 수, 총 인구를 구하시오
SELECT `District`, count(*), sum(c.`Population`) FROM city c
GROUP BY District
HAVING AVG(`Population`) >= 1000000 AND count(*) >= 3;

-- 아시아 대륙의 국가들 중에서, Region별 평균 GNP가 1000 이상인 Region,  평균 GNP를 조회하시오
SELECT `Region`, AVG(`GNP`)  FROM country
WHERE `Continent` = 'asia'
GROUP BY `Region`
HAVING AVG(`GNP`) >= 1000;

-- 독립년도가 1900년 이후인 국가들 중에서, 대륙별 평균 기대수명이 70세 이상인 Continent, 평균 기대수명을 조회하시오.
SELECT `Continent`, AVG(`LifeExpectancy`) FROM country
WHERE `IndepYear` > 1900
GROUP BY `Continent`
HAVING AVG(`LifeExpectancy`) >= 70;

-- CountryCode별 도시 평균 인구가 100만 이상이고 도시 최소 인구가 50만 이상인 CountryCode, 총 도시수, 총 인구수를 조회하시오.
SELECT `CountryCode`, count(*) as `총 도시 수`, sum(`Population`) as `총 인구 수` FROM city
GROUP BY CountryCode
HAVING AVG(`Population`) >= 1000000 AND MIN(`Population`) >= 500000;

