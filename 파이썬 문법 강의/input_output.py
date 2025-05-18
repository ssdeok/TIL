# 파이썬 입력
# input() 함수
# number = input()
# print(number)

# 모든 입력은 문자열로 입력된다.
# type(값) : 값의 자료형을 반환하는 함수
# print(type(number))

# 숫자형이 필요하면 형 변환한다.
# number2 = int(number)
# print(number2, type(number2))

# 백준 문제 풀이용 빠른 입력 방법 코드
# import sys

# input() : 느리다.
# sys.stdin.readline()  # 빠르다.
# sys.stdin.readline() 문제점
# 개행 문자(\n)가 같이 입력된다.
# 일반적으로 입력값이 양쪽 공백을 지워서(strip) 사용한다.
# number = sys.stdin.readline().strip()

# 출력 print() 함수
# print() 함수의 end 인자
# 출력 문자열의 마지막 문자열을 결정하는 인자
# 기본값은 개행 문자(\n)
print("a", end="++++++")
print("a", end="\n")
