
# 예약어(키워드)는 변수명 X
# int, float, str, boolean, true, false, if, for, ...
# sum, max, min, len, ...
# 대체 : list_, sum_

# list_ = [] # 빈 리스트
# list_ = list() # 빈 리스트

# Function Vs. Method
# 메서드(필드 함수)는 특정 객체(자료형)에 종속
# 함수는 특정 객체(자료형)에 종속 X, 오류는 발생
# int("asdf")


# 리스트의 기능(메서드)
# 값을 추가, 삭제, 정렬


# 리스트에 값을 추가
list_ = []
# 리스트 마지막에 값을 하나만 추가
list_.append(1)
# 한 번에 여러개를 추가 할 수 x
# list_.append(1,2,3,4) x

print(list_)

# 리스트의 특정 위치에 값을 하나만 추가
# insert(인덱스, 값)
list_.insert(0,0)
print(list_) # [0, 1]

list_.insert(1, 2)
print(list_) # [0, 2, 1]



# 리스트의 값 삭제
# 리스트 마지막의 값을 삭제
list_.pop()
print(list_) # [0, 2]

# 리스트 마지막의 값을 삭제하고, 반환(꺼낸다)
pop_item = list_.pop()
print(pop_item) # 2

# 리스트의 특정 위치의 값을 꺼내온다.
list_.append(1)
list_.append(2)
list_.append(3)
list_.append(4)
print(list_) # [0, 1, 2, 3, 4]
# 숫자 1, 두 번째 위치(인덱스 = 1)의 값을 꺼내오고 싶다.
pop_item = list_.pop(1)
print(pop_item) # 1

# 특정 위치에 값을 넣거나 / 특정 위치의 값을 빼오는건 느리다.

# 리스트의 슬라이싱
# 리스트의 일부분을 자르는 연산
# 리스트[시작:끝:간격]


###########################################슬라이싱 중요#############################################
# 시작부터 세번째까지 1의 간격으로 슬라이싱
# for(int i=0; i <3; i++)
print(list_) # [0, 2, 3, 4]
print(list_[0:3:1]) # [0, 2, 3]

# for(int i = 3; i>1; i--)
print(list_[3:1:-1]) # [4, 3]

# 시작, 간격은 생략할 수 있고,
# 생략하면 시작 = 0, 간격 = 1 이 기본값
print(list_[:3]) # [0, 2, 3]

# 끝, 간격은 생략할 수 있고,
# 생략하면 끝 = 마지막까지, 간격 = 1 이 기본값
print(list_[1:]) # [2, 3, 4]


# 레인지(range)
# 특정 범위의 정수 리스트 생성
# for(초기값; 조건식: 증감문)
# for(int i = 0; i < 10; i++)
range(0, 10, 1) # [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
print

# for(int i = 1; i < 11; i = i + 2)
range(1, 11, 2) # [1, 3, 5, 7, 9]

# 주의사항 : 실수는 x
# range(1, 11, 0.5) x

# 리스트 <-> 문자열 형변환
list_1 = ["1", "2", "3", "4"]
str_1 = "1234"

list_2 = list(str_1) # 문자열 -> 리스트 변환
str_2 = str(list_1) # 리스트 -> 문자열 변환

print(list_2) # 문자열 -> 리스트 변환 출력, ['1', '2', '3', '4']

print(str_2) # 리스트 -> 문자열 변환 출력, [1, 2, 3, 4]
# [1, 2, 3, 4] -> "1234"

# 첫 번째 방법. 반복문
# 두 번째 방법. join()
# str.join("구분자", 리스트)
str_3 = str.join("", list_1)
print(str_3) #1234

str_4 = str.join("+", list_1)
print(str_4) # 1+2+3+4


# 딕셔너리 -> JS 객체(object)

# 집합(set), 수학에서의 집합의 특징을 가진 자료형
# 리스트와 다른점 1.  중복된 값을 저장할 수 없다.
# 리스트와 다른점 2. 집합(set)은 순서가 없다.

s ={} # -> 빈 딕셔너리 의미

# 빈 set 생성
set_ = set()
# 값이 있는 set 생성
set_ = {1, 2, 2, 3}

print(set_) # {1, 2, 3}

list_ = [1,1,1,1,1,1,1,2,2,2,2,2,3,3,3,3,33,5,6,7]
# 문제. 리스트에서 중복을 제외한 수의 개수를 반환하세요.
print(set(list_))
print(len(set(list_)))


# 집합 자료형은 인덱싱 x, 0번째, 1번째 이런걸 찾을 수 없음. 순서없이 저장됨
print({1, 2, 3})


# python
if 10 == 10:
    print("10은 10이다.")
    
    
# java : if ~ else if
# python : if ~ elif
if 10 == 9:
    print("10은 9다.")
elif 10 == 8:
    print("10은 8이다.")
elif 10 == 10:
    print("10은 10이다.")     