-- Active: 1732690064755@@127.0.0.1@3306@world

-- 도시와 국가 정보 연결 world

-- 1. 도시의 입장에서 도시가 있는 국가를 함께 조회
SELECT ci.`Name`, co.`Name`, co.`Continent`
FROM city ci
JOIN country co ON ci.`CountryCode` = co.`Code`




--모든 국가와 수도 정보
-- 1:1 관계
