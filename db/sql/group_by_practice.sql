-- Active: 1732694339715@@127.0.0.1@3306@world
SELECT Continent, COUNT(*) as country_count
FROM country
GROUP BY Continent;



-- - 대륙별 총 인구수를 구하시오. - country

SELECT c.`Continent`, SUM(c.`Population`) total_pop FROM country c
GROUP BY c.`Continent`

-- - Region별로 GNP가 가장 높은 Region를 찾으시오 - country
SELECT c.`Region`, MAX(`GNP`) FROM country c
GROUP BY c.`Region`

-- - 대륙별 평균 GNP와 평균 인구를 구하시오 - counyry
SELECT c.`Continent`, AVG(c.`GNP`), AVG(c.`Population`) FROM country  c
GROUP BY c.`Continent`

-- - 인구가 50만에서 100만 사이인 도시들에 대해, District별 도시 수를 구하시오 - city
SELECT c.`District`, COUNT(*) FROM city c
WHERE c.`Population` BETWEEN 500000 AND 1000000
GROUP BY c.`District`

-- - 아시아 대륙 국가들의 Region별 총 GNP를 구하세요 - country
SELECT c.`Region`, SUM(c.`GNP`) total_GNP FROM country c
WHERE c.`Continent` = 'asia'
GROUP BY c.`Region`


-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- 
-- HAVING
SELECT Continent, COUNT(*) as country_count
FROM country
GROUP BY Continent
HAVING COUNT(*) > 20;

-- - 각 국가별 도시가 10개 이상인 국가의 CountryCode, 도시 수를 조회하시오. - city

SELECT c.`CountryCode`, COUNT(*) FROM city c
GROUP BY c.`CountryCode`
HAVING count(*) >= 10;

-- - District별 평균 인구가 100만 이상이면서 도시 수가 3개 이상인 District,  도시 수, 총 인구를 구하시오 - city

SELECT c.`District`, count(*) 도시수, SUM(c.`Population`) 총인구수 FROM city c
GROUP BY c.`District`
HAVING AVG(c.`Population`) >= 1000000
  AND COUNT(*) >= 3;
-- - 아시아 대륙의 국가들 중에서, Region별 평균 GNP가 1000 이상인 Region,  평균 GNP를 조회하시오 - country

-- - 아시아 대륙의 국가들 중에서,           : continent = asia / where, having 중 where : country의 field이기 때문에
-- Region별                               : group by region
-- 평균 GNP가 1000 이상인                  : having avg(gnp) >= 1000
-- Region,  평균 GNP를 조회하시오           : select region, avg(gnp)
SELECT c.`Region`, AVG(c.`GNP`) FROM country c
WHERE c.`Continent` = 'asia'
GROUP BY c.`Region`
HAVING AVG(c.`GNP`) >= 1000;

-- - 독립년도가 1900년 이후인 국가들 중에서, 대륙별 평균 기대수명이 70세 이상인 Continent, 평균 기대수명을 조회하시오. - country

-- - 독립년도가 1900년 이후인                              indepyear >= 1900
-- 국가들 중에서,                                          from country
--  대륙별                                                group by continent
-- 평균 기대수명이 70세 이상인                             avg(liefExpectancy) >= 70
--  Continent, 평균 기대수명을 조회하시오. - country       continent, avg(liefExpectancy)
SELECT c.`Continent`, AVG(`LifeExpectancy`) FROM country c
WHERE c.`IndepYear` >= 1900
GROUP BY c.`Continent`
HAVING AVG(`LifeExpectancy`) >= 70;


-- - CountryCode별 도시 평균 인구가 100만 이상이고 CountryCode별 도시 최소 인구가 50만 이상인 CountryCode, 총 도시수, 총 인구수를 조회하시오. - city

-- - CountryCode별                                       groupby countrycode
-- 도시 평균 인구가 100만 이상이고                        avg(pop) > 100만
-- 도시 최소 인구가 50만 이상인                           min(pop) > 50만
-- CountryCode, 총 도시수, 총 인구수를 조회하시오. - city   cc, count(), sum(pop)

SELECT c.`CountryCode`, COUNT(*) `총 도시 수`, SUM(c.`Population`) `총 인구 수` FROM city c
GROUP BY c.`CountryCode`
HAVING AVG(c.`Population`) >= 1000000 and MIN(c.`Population`) >= 500000

-- - 인구가 50만 이상인 city 중 CountryCode별 도시 평균 인구가 100만 이상 인 국가의 CountryCode, 총 도시수, 총 인구수를 조회하시오. - city

SELECT c.`CountryCode`, COUNT(*) `총 도시 수`, SUM(c.`Population`) `총 인구 수` FROM city c
WHERE c.`Population` >= 500000
GROUP BY c.`CountryCode`
HAVING AVG(c.`Population`) >= 1000000 