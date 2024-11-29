-- Active: 1732694339715@@127.0.0.1@3306@world

-- country에 있는 모든 필드 조회

SELECT * FROM country

SELECT `Name`, `Population` FROM country;

SELECT country.`Name`, country.`Population` FROM country;

SELECT c.`Name`, c.`Population` FROM country c;

SELECT c.`Name` AS 국가명, c.`Population` AS 인구수 FROM country c;
SELECT c.`Name` 국가명, c.`Population` 인구수 FROM country AS c;

SELECT  DISTINCT c.`Continent`, c.`Region` FROM country c


--  name이 s로 시작하는 국가 중 인구가 1000000 이상인 나라 선택
SELECT `Name`, `Population` FROM country
WHERE `Population` > 1000000
  AND `Name` LIKE 's%;'




-- - 인구가 800만 이상인 도시의 Name, Population을 조회하시오
SELECT c.`Name` 도시이름, c.`Population` 인구수 FROM city c
WHERE c.`Population` >= 8000000

-- - 한국(KOR)에 있는 도시의 Name, CountryCode를 조회하시오
SELECT c.`Name`, c.`CountryCode` FROM city c
WHERE c.`CountryCode` = 'KOR';

SELECT `Name`, `CountryCode` FROM city
WHERE `CountryCode` = 'KOR';

-- - 이름이 'San'으로 시작하는 도시의 Name을 조회하시오
SELECT c.`Name` FROM city c
WHERE c.`Name` LIKE 'San %'

-- - 인구가 100만에서 200만 사이인 한국 도시의 Name을 조회하시오
SELECT c.`Name`, c.`Population`, c.`CountryCode` FROM city c
WHERE c.`Population` BETWEEN 1000000 AND 2000000
  AND c.`CountryCode` = 'KOR'

-- - 인구가 500만 이상인 한국, 일본, 중국의 도시의 Name, CountryCode, Population 을 조회하시오
SELECT c.`Name`, c.`CountryCode`, c.`Population` FROM city c
WHERE c.`Population` >=5000000
  AND (c.`CountryCode` = 'KOR' OR c.`CountryCode` = 'JPN' OR c.`CountryCode`="CHN")

SELECT c.`Name`, c.`CountryCode`, c.`Population` FROM city c
WHERE c.`Population` >=5000000
  AND c.`CountryCode` IN ('KOR', 'JPN', "CHN");

-- SELECT * FROM country c
-- WHERE c.`Continent` = 'asia'

-- - 오세아니아 대륙에서 예상 수명의 데이터가 없는 나라의 Name, LifeExpectancy, Continent를 조회하시오.

SELECT c.`Name`, c.`LifeExpectancy`, c.`Continent` FROM country c
WHERE c.`Continent` = 'Oceania'
  AND c.`LifeExpectancy` IS NULL;