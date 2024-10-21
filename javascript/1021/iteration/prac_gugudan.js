// 구구단
const nums = [1, 2, 3, 4, 5, 6, 7, 8, 9];

for (let index in nums) {
  console.log(`3*${nums[index]} = ${3 * nums[index]}`);
}

console.log('---------');

for (let num of nums) {
  console.log(`3* ${num} = ${3 * num}`);
}
