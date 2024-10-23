// 모든 원소들의 합을 구하시오
//     - 1 + 2 + 3 + 4 ... + 9
const nums = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];

let total = 0;
for (let num of nums) {
  for (let arr of num) {
    total += arr;
  }
}
console.log(total);

console.log('------------------------------');

total = 0;

total += nums[0][0];
total += nums[0][1];
total += nums[0][2];

total += nums[1][0];
total += nums[1][1];
total += nums[1][2];

total += nums[2][0];
total += nums[2][1];
total += nums[2][2];

console.log('------------------------------');

