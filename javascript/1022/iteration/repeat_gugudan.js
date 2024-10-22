// 구구단
const nums = [1, 2, 3, 4, 5, 6, 7, 8, 9];

while (nums.length) {
  el = nums.shift();
  console.log(`3*${el} = ${el * 3}`);
}
