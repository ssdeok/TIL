# java 기본 for문
"""
int[] arr = new int[]{1,2,3,4,5}
for(int i = 0; i < arr.length; i++){
    코드
}
"""

# java 향상된 for문
"""
for(int n: arr){
    코드
}
"""


list_ = [1, 2, 3, 4, 5]  # 컬렉션(컨테이너)
"""
for 반복문 내 변수 in 컬렉션:
    들여쓰기로 구분한 코드 블럭
"""
for number in list_:
    print(number)
    """
    1
    2
    3
    4
    5
    """


N = 10
# N번 만큼 반복을 하고 싶다.
"""java
for(int i = 0; i < N; i++) {
    
}
"""

for i in range(0, N, 1):
    print(i)
    """
    0
    1
    2
    3
    4
    5
    6
    7
    8
    9
    """


# for ~ else 문
# while ~ eles 문
# else문은 반복문이 break에 의해 종료가 안됐을 때 실행 되는 코드 블럭
"""
for 변수 in 컬렉션:
    코드
else:
    코드
"""
"""
while 반복 조건식:
    코드
else:
    코드
"""


list_ = [1, 3, 5, 7, 9, 2]

for number in list_:
    # number가 짝수면 반복문 종료
    if number % 2 == 0:
        break
else:
    print("리스트에 짝수가 없습니다.")


""" java
for(int i = 0; i < 10; i++) {
    for(int j = 0; j < 10; j++) {
    }
}
"""
""" python
for i in range(0, 10, 1):
    for j in range(0, 10, 1):
"""


list_2d = [[]]  # 1(세로, 행) X 0(가로, 열) 2차원 리스트
list_2d = [[], [], []]  # 3(세로, 행) X 0(가로, 열) 2차원 리스트
list_2d = [[1], [2], [3]]  # 3 X 1 2차원 리스트
list_2d = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9],
]  # 3 X 3 2차원 리스트
# 내부 리스트의 수 -> 세로, 행, row, r, y
# 내부 리스트가 가진 값의 수 -> 가로, 열, col, c, x

print(list_2d[1][0])
y = 1
x = 0

print(list_2d[y][x])
list_2d[1][2] = -6
print(list_2d)  # [[1, 2, 3], [4, 5, -6], [7, 8, 9]]

# 세로 길이
row = len(list_2d)
# 가로 길이
col = len(list_2d[0])
# 이차원 리스트 값 순회
for y in range(0, row, 1):
    for x in range(0, col, 1):
        print(list_2d[y][x])
