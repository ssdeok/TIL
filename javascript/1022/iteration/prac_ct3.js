// 원소가  1, 4, 5, 7인 경우를 제외하고 출력하세요
const arr = [1, 2, 4, 3, 3, 5, 5, 6, 9, 7];

for (let num of arr) {
  if (num === 1 || num === 4 || num === 5 || num === 7) {
    continue;
  }
  console.log(num);
}

const notLogSet = new Set([1, 4, 5, 7]);

for (let num1 of arr) {
  if (notLogSet.has(num1)) continue;

  console.log(num1);
}
