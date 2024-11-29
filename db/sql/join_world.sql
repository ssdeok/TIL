-- Active: 1732694339715@@127.0.0.1@3306@world

-- 도시와 국가 정보 연결 world
-- 1. 도시의 입장에서 도시가 있는 국가를 함께 조회
-- 2. 국가의 입장에서 국가가 가지고 있는 도시를 함께 조회

SELECT city.Name as CityName, 
       country.Name as CountryName,
       country.Continent
FROM city
INNER JOIN country ON city.CountryCode = country.Code

-- 2. 국가의 입장에서 국가가 가지고 있는 도시를 함께 조회
SELECT country.`Name`, city.`Name`
FROM country
INNER JOIN city ON country.`Code` = city.`CountryCode`
-- WHERE country.`Code` = 'KOR'
-- ORDER BY city.`Name`

SELECT country.`Name`, city.`Name`
FROM country
INNER JOIN city ON country.`Code` = city.`CountryCode`
WHERE city.`Population` > 1000000;
-- ORDER BY city.`Name`
-- 도시의 인구수가 특정 인구수 이상


SELECT co.`Name`, ci.`Name`
FROM country co
INNER JOIN city ci ON co.`Code` = ci.`CountryCode`
WHERE co.`Code` = 'KOR'
ORDER BY ci.`Name`