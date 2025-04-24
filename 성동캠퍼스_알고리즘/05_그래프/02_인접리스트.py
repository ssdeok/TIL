# 인접리스트
"""
0 1
0 2
0 5
0 6
3 4
3 5
4 5
4 6
"""

# 무방향 그래프
n = 7 # 정점의 개수
m = 8 # 간선의 개수

graph = [[] for _ in range(n)]

for _ in range(m):
    v1, v2 = map(int, input().split())
    graph[v1].append(v2)
    graph[v2].append(v1)

for line in graph:
    print(line)

# 유방향 그래프
n = 7 # 정점의 개수
m = 8 # 간선의 개수

graph = [[] for _ in range(n)]

for _ in range(m):
    v1, v2 = map(int, input().split())
    graph[v1].append(v2)

for line in graph:
    print(line)










