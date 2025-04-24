# print("1")
#
# print("1", "2", "3")
#
# print("hello", end="$")
# print("python")
#
# print("1", "2", "3", sep="$")
# print("1", "2", "3", sep="\n")
#
# name = "sten"
# print("안녕하세요! " + name)
# print(f"안녕하세요! {name}")
#
# age = 36
# print(f"안녕하세요! {name}, 나이는 {age + 10}입니다.")

# import sys
#
# input = sys.stdin.readline
#
# t = int(input())
#
# for i in range(t):
#     a, b = map(int, input().split())
#     print(f"Case #{i + 1}: {a + b}")


import sys

input = sys.stdin.readline

t = int(input())

for i in range(t):
    a, b = map(int, input().split())
    print(f"Case #{i + 1}: {a} + {b} = {a + b}")