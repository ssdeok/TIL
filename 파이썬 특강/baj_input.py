# 입력
# 1
# 입력 코드
# n = int(input())

# # 입력
# # "a"
# # 입력 코드
# c = input()

# # 입력
# # spring flower
# # 입력 코드
# a, b = input().split()

# # 입력
# # spring flower warm
# a, b, c = input().split()

# 입력
# "1 2"
# int(input().split()) 오류
# split()은 list 자료형을 반환한다.
# list 자료형은 int() 함수를 적용할 수 없다.
# [1] -> 숫자 모양 x
# 리스트에 저장된 값 하나하나에 int() 함수를 적용해야한다.

# map(리스트에 저장된 값에 적용할 함수, 리스트)
# n1, n2 = map(int, input().split())

# print(n1, n2)


# 2차원 리스트의 입력
# 입력
# 2(세로) 3(가로)
# 1 2 3
# 4 5 6
n, m = map(int, input().split())
list_2d = []
for i in range(0, n, 1):
    list_1d = list(map(int, input().split())) # [1, 2, 3]
    list_2d.append(list_1d)
print(list_2d) # [[1, 2, 3], [4, 5, 6]]