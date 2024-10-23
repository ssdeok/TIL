// 행들의 합의 값으로 리스트를 만드세요
// [6, 15, 24]
// 즉,  [1 + 2 + 3,  4 + 5 + 6, 7 + 8 + 9]

// const { result } = require('lodash');

const nums = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];

result = [];
for (let arr of nums) {
  sum = 0;
  for (let num of arr) {
    sum += num;
  }
  result.push(sum);
}
console.log(result);

console.log('--------------------');
