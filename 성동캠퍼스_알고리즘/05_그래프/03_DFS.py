# 깊이우선탐색

# 1. 그래프 구현 (인접리스트)
"""
7 7
0 1
0 2
1 3
1 4
2 4
2 5
4 6
"""
n, m = map(int, input().split()) # 정점, 간선 개수
graph = [[] for _ in range(n)]

for _ in range(m):
    v1, v2 = map(int, input().split())
    graph[v1].append(v2)
    graph[v2].append(v1)

for line in graph:
    print(line)
# 2. 방문 리스트
visited = [False] * n

# 3. 깊이우선탐색 진행
def dfs(node):
    print(node) # 현재 방문 정점 출력

    # 인접한 정점으로 이동
    for next_node in graph[node]:
        if not visited[next_node]:
            visited[next_node] = True # 다음 정점 방문처리
            dfs(next_node) # 실제로 다음 정점으로 이동


visited[0] = True # 출발정점 방문처리
dfs(0) # 출발정점에서 DFS 시작