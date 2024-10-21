const nums = [10, 6, 8, 5, 4, 2, 3, 11];

let min = nums[0];

for (num of nums) {
  if (min > num) {
    min = num;
  }
}

console.log(min);
