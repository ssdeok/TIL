import sys
from collections import Counter

input = sys.stdin.readline

n = int(input())
cards = list(map(int, input().split()))
m = int(input())
numbers = list(map(int, input().split()))

counter = Counter(cards)

# counter = {}
#
# for card in cards:
#     if card in counter:
#         counter[card] += 1
#     else:
#         counter[card] = 1

for number in numbers:
    counts = counter.get(number, 0)
    print(counts, end=" ")




