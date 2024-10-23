//1. 열들의 합의 값으로 리스트를 만드세요
// [1 + 4 + 7, 2 + 5 + 8, 3 + 6 + 9]

const nums = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];

const n = nums.length;
const m = nums[0].length;

result = [];
for (let j = 0; j < m; j++) {
  sum = 0;
  sum += nums[0][j];
  sum += nums[1][j];
  sum += nums[2][j];
  result.push(sum);
}
console.log(result);

console.log('-------------------------');

result = [];
for (let j = 0; j < m; j++) {
  sum = 0;
  for (let i = 0; i < n; i++) {
    sum += nums[i][j];
  }
  result.push(sum);
}
console.log(result);
