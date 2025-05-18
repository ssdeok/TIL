# 파이썬의 변수 생성

# 자바의 변수 생성
# 자료형 변수 이름
# int number;

# 파이썬의 변수 생성
# 자료형(X) 변수 이름 = 할당할 값

a = 0 # 정수형(int) 변수

a = 1.1 # 실수형(float) 변수


# 자바와 파이썬 문자열 비교
# 자바
# 'a' -> 문자(char)
# "abcd" -> 문자열(String)

# 파이썬
# 'a' -> 문자열(String)
# "a" -> 문자열(String)
# 주의사항 : 혼용은 안된다
# '" -> X / "' -> X


# 파이썬 문자열 포맷팅 f-string
print(f"1 + 1 = {1 + 1}") # 표현식을 삽입한 문자열
name = "서승덕"
print(f"이름은 {name} 입니다.")


# boolean형
# True / False
# 어떤 경우에 False 인가?
# 정수형(int) -> 0
# 실수형(float) -> 0.0
# 문자열(str) -> "" 빈 문자열
# 리스트(list) -> [] 빈 리스트
# 딕셔너리(dict) -> {} 빈 딕셔너리

# 기본 자료형 간 형 변환
# 정수 -> 실수
number1 = 1
number2 = float(number1)

# 실수 -> 정수
number3 = 1.9
number4 = int(number3)
print(number1, number2)
print(number3, number4)

# 반올림?
number5 = 1.1
number6 = int(1.1 + 0.5)
print(number5, number6)

# 문자열 -> 숫자형 변환
# 주의사항 : 숫자형 형태의 문자열이 아니면 변환 x
str1 = "a"
# int(str1) 오류 -> ValueError: invalid literal for int() with base 10: 'a'

str2 = "1"
int(str2)

str3 = "1.1"
float