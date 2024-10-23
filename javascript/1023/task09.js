// 더하기 함수
function add(x1, x2) {
  return x1 + x2;
}
let num1 = 1;
let num2 = 2;
console.log(num1);
console.log(num2);

let result = add(num1, num2);
console.log(result);

console.log('-------');

// 크기 비교 함수
function compare(x1, x2) {
  if (x1 > x2) {
    return x1;
  } else if (x1 < x2) {
    return x2;
  } else {
    return null;
  }
}

let i = 1;
let j = 2;
console.log(i);
console.log(j);

let bigger = compare(i, j);
console.log(bigger);

bigger = compare(i, j);
console.log(bigger);

console.log('-------');

// 양수, 음수, 0
function determine(x) {
  if (x > 0) {
    return 1;
  } else if (x < 0) {
    return -1;
  } else {
    return 0;
  }
}

let i2 = 10;
console.log(i2);
console.log(determine(i2));

let i3 = -1;
console.log(i3);
console.log(determine(i3));

let i4 = 0;
console.log(i4);
console.log(determine(i4));

console.log('-------');

// 가장 큰 값
function maxNumber(arr) {
  let max = -Infinity;
  for (const num of arr) {
    if (num > max) {
      max = num;
    }
  }
  return max;
}

let numbers = [10, 25, 36, 99, 58];
console.log(numbers);
console.log(maxNumber(numbers));

console.log('-------');

// 가장 작은 값
function minNumber(arr) {
  let min = Infinity;
  for (const num of arr) {
    if (num < min) {
      min = num;
    }
  }
  return min;
}
let numbers2 = [10, 25, 36, 99, 58];
console.log(numbers2);
console.log(minNumber(numbers2));

console.log('-------');

// 짝수
function evenNumber(arr) {
  let new_arr = [];
  for (const nums of arr) {
    if (nums % 2 === 0) {
      new_arr.push(nums);
    }
  }
  return new_arr;
}
let numbers3 = [10, 25, 36, 99, 58];
console.log(numbers3);
console.log(evenNumber(numbers3));
