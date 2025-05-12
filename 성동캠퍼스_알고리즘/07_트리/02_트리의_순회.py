# 트리의 전위, 중위, 후위 순회

"""
13
1 2 1 3 2 4 3 5 3 6 4 7 5 8 5 9 6 10 6 11 7 12 11 13
"""
def preorder(center):
    if center == -1:
        return

    print(center, end=" ")     # C
    preorder(tree[center][0])  # L
    preorder(tree[center][1])  # R

def inorder(center):
    if center == -1:
        return

    inorder(tree[center][0])   # L
    print(center, end=" ")     # C
    inorder(tree[center][1])   # R

def postorder(center):
    if center == -1:
        return

    postorder(tree[center][0])  # L
    postorder(tree[center][1])  # R
    print(center, end=" ")      # C

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

preorder(1)
print()
inorder(1)
print()
postorder(1)