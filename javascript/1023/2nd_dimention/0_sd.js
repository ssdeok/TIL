const nums = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];

// 1~9를 순서대로 출력해보자

// nums[0] = [1, 2, 3];
// nums[1] = [4, 5, 6];
// nums[2] = [7, 8, 9];

// let arr;

for (let arr of nums) {
  for (let num of arr) {
    console.log(num);
  }
}

console.log('-------');

for (let i in nums) {
  let arr = nums[i];
  for (let j in arr) {
    let num = arr[j];
    // console.log(num);
    // console.log(arr[j]);
    console.log(nums[i][j]);
  }
}

console.log('-------');

const n = nums.length;
const m = nums[0].length;
for (let i = 0; i < n; i++) {
  for (let j = 0; j < m; j++) {
    console.log(nums[i][j]);
  }
}
