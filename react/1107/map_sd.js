const arr1 = [1, 2, 3, 4, 5];
// 를 활용하여
const newArr1 = [1, 4, 9, 16, 25];
// 를 만들어보자.

const doubled = arr1.map((arrs) => {
  //인덱스 0에는 1, 1에는 2, 2에는 3, 3에는 4, 4에는 5를 곱한다
  return arrs * arrs;
});
console.log(doubled);

let num;
const myArr1 = [];
for (let num of arr1) {
  myArr1.push(num * num);
}
console.log(myArr1);
///////////////////////////////////////////////////////////////////////////////////////

const arr2 = ['1', '2', '3', '4', '5'];
// 를 활용하여
const newArr2 = [1, 2, 3, 4, 5];
// 를 만들어보자.

let numbers = arr2.map((num) => parseInt(num));
console.log(numbers);

///////////////////////////////////////////////////////////////////////////////////////

const arr3 = [
  {
    name: 'jun',
    age: 18,
  },
  {
    name: 'alex',
    age: 28,
  },
  {
    name: 'ken',
    age: 38,
  },
];
// 를 활용하여
const newArr3 = [18, 28, 38];
// 를 만들어보자.

const newArry5 = [];
for (let nums of arr3) {
  newArry5.push(nums.age);
}
console.log(newArry5);

const newMaped = arr3.map((el) => el.age);
console.log(newMaped);
///////////////////////////////////////////////////////////////////////////////////////

const arr4 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
// 를 활용하여
// 짝수만 들어있는 array를 만들어보자.

const seo = [];
for (arrss of arr4) {
  if (arrss % 2 === 0) {
    seo.push(arrss);
  }
}
console.log(seo);

// 짝수이면서 5이상인 숫자만 들어있는 array를 만들어보자.

const seo1 = [];
for (arrss1 of arr4) {
  if (arrss1 % 2 === 0 && arrss1 >= 5) {
    seo1.push(arrss1);
  }
}
console.log(seo1);

const newFilters = arr4.filter((el) => {
  return el % 2 === 0 && el >= 5;
});
console.log(newFilters);

const newFilter2 = arr4
.filter((el) => el % 2 === 0)
.filter((el) => el >= 5);
console.log(arr4);
///////////////////////////////////////////////////////////////////////////////////////

const arr5 = [
  {
    name: 'jun',
    age: 18,
  },
  {
    name: 'alex',
    age: 28,
  },
  {
    name: 'ken',
    age: 38,
  },
  {
    name: 'beemo',
    age: 48,
  },
  {
    name: 'lynda',
    age: 8,
  },
];
// 를 활용하여
// age가 30 이하인 사람들의 정보가 담긴 array를 만들어보자.

// 를 활용하여
// age가 30 이하인 사람들의 이름이 담긴 array를 만들어보자.
