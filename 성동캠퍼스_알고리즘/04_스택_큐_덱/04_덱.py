from collections import deque

queue = deque()

# enqueue (앞, 뒤)
queue.appendleft(1)
queue.appendleft(2)
queue.append(3)
queue.append(4)
print(queue)

# dequeue (앞, 뒤)
print(queue.popleft())
print(queue.pop())

# peek (앞, 뒤)
print(queue[0])
print(queue[-1])