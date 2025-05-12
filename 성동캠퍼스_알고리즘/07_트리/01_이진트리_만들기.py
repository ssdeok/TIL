# 이진트리 만들기

"""
13
1 2 1 3 2 4 3 5 3 6 4 7 5 8 5 9 6 10 6 11 7 12 11 13
"""

n = int(input())
nodes = list(map(int, input().split()))
tree = [[-1, -1] for _ in range(n + 1)]

for i in range(0, len(nodes), 2):
    parent = nodes[i]
    child = nodes[i + 1]

    if tree[parent][0] == -1:
        tree[parent][0] = child
    else:
        tree[parent][1] = child

for line in tree:
    print(line)