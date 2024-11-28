-- Active: 1732690064755@@127.0.0.1@3306@practice

CREATE Table student (
student_id VARCHAR(7) PRIMARY KEY,
name VARCHAR(10),
grade INT,
major VARCHAR(20)
);

CREATE TABLE attendance (
    attendance_id INT AUTO_INCREMENT PRIMARY KEY,
    student_id VARCHAR(7) REFERENCES student(student_id),
    date DATE,
    status VARCHAR(10)
);

ALTER TABLE student
ADD phone VARCHAR(20);


ALTER TABLE student 
MODIFY name VARCHAR(100) NOT NULL;

ALTER TABLE student 
DROP COLUMN phone;

TRUNCATE TABLE student ;

INSERT INTO student (student_id, name, grade, major)
VALUES('2004001', '김철수', 1, '컴퓨터공학');

INSERT INTO student VALUES 
    ('2024002', '이영희', 2, '경영학'),
    ('2024003', '박민수', 3, '물리학');


SELECT * FROM student;

--학생의 이름을 조회하자.

SELECT name from student;

SELECT s.name from student s;

--grade가 1인 학생의 모든 정보를 출력하자

SELECT * FROM student WHERE grade = 1;

UPDATE student SET grade = 2, major = '경제학'
WHERE student_id = '2004001';

DELETE FROM student
WHERE student_id = '2024002';