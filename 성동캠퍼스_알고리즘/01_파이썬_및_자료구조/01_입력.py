
# n = int(input())
# print(n)

# 3. 한 줄 리스트 입력
# import sys
#
# input = sys.stdin.readline

# numbers = list(map(int, input().split()))
# print(numbers)

# a, b = list(map(int, input().split()))
# print(a+b)

# a = int(input())
# b = int(input())
#
# print(a + b)

# import sys
#
# input = sys.stdin.readline
#
# t = int(input())
#
# for i in range(t):
#     a, b = map(int, input().split())
#     print(a + b)

import sys

input = sys.stdin.readline

t = int(input())

for i in range(t):
    a, b = map(int, input().split(","))
    print(a + b)