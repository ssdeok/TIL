// const nums = [1, 2, 3, 4, 5, 6, 7];

const numbers = [5, 8, 2, 5, 1, 4];
// minValue를 reduce를 통해 계산하시오.

// let minus = Infinity;
// let minNum = nums[0];

// for (num of nums) {
//   if (minNum > num) {
//     minNum = num;
//   }
// }

const min = numbers.reduce((acc, cur) => {
  if (acc > cur) {
    acc = cur;
  }
  return acc;
}, Infinity);

console.log(min);

console.log('----------');

const min2 = numbers.reduce((acc, cur) => (acc > cur ? cur : acc), Infinity);

console.log(min2);
