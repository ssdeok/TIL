//1번

names = ['jun', 'beemo', 'ken'];
ages = [18, 28, 37];

for (let index in names) {
  let age = ages[index];
  let name = names[index];

  console.log(`${age}살 ${name}`);
}

//2번

//3번
const nums = [1, 2, 3, 4, 5, 6, 7, 8, 9];

let total = 0;

for (const index in nums) {
  total = total + nums[index];
  console.log(total);
}
//4번
const nums1 = [10, 6, 8, 5, 4, 2, 3, 11];

for (const index in nums1) {
}
