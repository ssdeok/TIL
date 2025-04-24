a = [1, 2, 3]
b= a

print(a)
print(b)

b[0] = 4
print(a)
print(b)

# 얕은 복사
from copy import copy

a = [1, 2, 3]
b = a[:]
b = list(a)
b = copy(a)

b[0] = 4
print(a)
print(b)

# 깊은 복사
a = [[1, 2, 3], [4, 5, 6]]
b = a[:]

b[0][0] = 9
print(a)
print(b)

from copy import deepcopy

a = [[1, 2, 3], [4, 5, 6]]
b = deepcopy(a)

b[0][0] = 9
print(a)
print(b)
