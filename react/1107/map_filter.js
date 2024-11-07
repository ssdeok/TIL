const arr1 = [1, 2, 3, 4, 5];
// 를 활용하여
const newArr1 = [1, 4, 9, 16, 25];
// 를 만들어보자.

let num;
const myArr1 = [];
for (let num of arr1) {
  myArr1.push(num * num);
}

// const myMapArr1 = arr1.map((num) => {
//   return num * num;
// });

// const myMapArr1 = arr1.map((num) => num * num);

function square(num) {
  return num ** 2;
}
const myMapArr1 = arr1.map(square);
// const myMapArr1 = arr1.map(square()); 함수가 아닌 함수의 결과값을 넣을 수는 없다.

console.log(myMapArr1);
// num = 1;
// num = num * num;
// myArr1.push(num);

// num = 2;
// num = num * num;
// myArr1.push(num);

// num = 3;
// num = num * num;
// myArr1.push(num);

console.log(myArr1);
console.log(
  "-------------------------------------------------------------------"
);

const arr2 = ["1", "2", "3", "4", "5"];
// 를 활용하여
// const newArr2 = [1, 2, 3, 4, 5];
// 를 만들어보자.

const newMapArr2 = arr2.map((num) => parseInt(num));
// const newMapArr2 = arr2.map(parseInt);
// const newMapArr2 = arr2.map((el, index, array) => {parseInt(el, index, array)});
// 로 인식이 되어서 작동 X

console.log(newMapArr2);

// ///////////////////////////////////////////////////////////////////////////////////////
console.log(
  "-------------------------------------------------------------------"
);

const arr3 = [
  {
    name: "jun",
    age: 18,
  },
  {
    name: "alex",
    age: 28,
  },
  {
    name: "ken",
    age: 38,
  },
];
// // 를 활용하여
// const newArr3 = [18, 28, 38];
// // 를 만들어보자.
const newArr3 = [];
for (let el of arr3) {
  newArr3.push(el.age);
}
console.log(newArr3);

const newMappedArr3 = arr3.map((el) => el.age);
console.log(newMappedArr3);
console.log(
  "-------------------------------------------------------------------"
);

const arr4 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
// // 를 활용하여
// // 짝수만 들어있는 array를 만들어보자.
const newArr4 = [];
for (let num of arr4) {
  if (!(num % 2)) {
    newArr4.push(num);
  }
}
console.log(newArr4);

const newFilteredArr4 = arr4.filter((el) => {
  return !(el % 2);
});
console.log(newFilteredArr4);
// // 짝수이면서 5이상인 숫자만 들어있는 array를 만들어보자.

const newFilteredArr4_2 = arr4.filter((el) => {
  return !(el % 2) && el >= 5;
});
console.log(newFilteredArr4_2);

const newFilteredArr4_3 = arr4
  .filter((el) => !(el % 2))
  .filter((el) => el >= 5);
console.log(newFilteredArr4_3);

console.log(
  "-------------------------------------------------------------------"
);

const arr5 = [
  {
    name: "jun",
    age: 18,
  },
  {
    name: "alex",
    age: 28,
  },
  {
    name: "ken",
    age: 38,
  },
  {
    name: "beemo",
    age: 48,
  },
  {
    name: "lynda",
    age: 8,
  },
];
// // 를 활용하여
// // age가 30 이하인 사람들의 정보가 담긴 array를 만들어보자.

console.log(arr5.filter((el) => el.age <= 30));

// // 를 활용하여
// // age가 30 이하인 사람들의 이름이 담긴 array를 만들어보자.

arr5.filter((el) => el.age <= 30).map((el) => el.name);
// arr5.map().filter()
const arr = [];

for (let el of arr5) {
  if (el.age <= 30) {
    arr.push(el.name);
  }
}
