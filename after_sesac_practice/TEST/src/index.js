// let print = function () {
//   console.log('hello world');
// };
// print();

// const print = () => {
//   console.log('hello world');
// };

// print();

// function start(name, callback) {
//   console.log(`안녕하세요 ${name} 입니다. `);
//   callback();
// }

// function finish() {
//   console.log('감사합니다.');
// }

// start('hyobin', finish);

///////////////////////////////////////// 함수

// let obj = {};

// console.log(obj);

// let book = {
//   title: '자바스크립트 첫걸음',
//   author: '서승덕',
//   category: '자바스크립트',
//   year: undefined,
//   color: function () {
//     console.log('orange');
//   },
// };

// let car = {
//   name: '붕붕',
//   model: 'morning',
//   color: 'black',
// };

// console.log(car.name);
// console.log(car.color);

// console.log(car['name']);
// console.log(car['model']);
// console.log(car['color']);

// const getValue = (key) => {
//   console.log(car[key]);
// };

// getValue('color');

// const cat = {
//   age: 2,
//   name: '야옹이',
//   color: 'white',
// };

// delete cat.color;
// delete cat['age'];

// console.log(cat);

// const person = {
//   name: '홍길동',
//   age: 20,
//   print: function () {
//     console.log(`제 이름은 ${this.name} 입니다.`);
//   },
// };

// person.print();
// person['print']();

//////////////////////////////////// 객체

// let arr1 = new Array(1, 2, 3);
// let arr2 = new Array(3);

// console.log(arr1);
// console.log(arr2);

// let arr1 = [1, 2, 3];
// let arr2 = [3];

// console.log(arr1);
// console.log(arr2);

// let arr = [
//   { name: '홍길동' },
//   1,
//   'array',
//   function () {
//     console.log('hello world!');
//   },
//   null,
//   undefined,
// ];

// console.log(arr);

// let array = [1, 'hello', null];

// console.log(array[0]);
// console.log(array[1]);
// console.log(array[2]);

// let fruits = ['apple', 'orange', 'peach'];
// fruits.push('grape');

// console.log(fruits);

// let fruits = ['apple', 'orange', 'peach'];
// fruits.unshift('grape');

// console.log(fruits);

///////////////////////////// 배열

// function Person(name, age, job) {
//   this.name = name;
//   this.age = age;
//   this.job = job;
//   this.sayHi = function () {
//     console.log('안녕하세요!' + this.name + '입니다');
//   };
// }

// const person1 = new Person('홍길동', 30, 'Manager');
// const person2 = new Person('김철수', 25, 'Designer');

// console.log(person1.name);
// console.log(person2.age);
// person1.sayHi();
// person2.sayHi();

///////////////////////////////// 생성자 함수

// for (let i = 5; i > 0; i--) {
//   console.log(i);
// }

// let i = 1;
// while (i < 6) {
//   console.log(i);
//   i++;
// }

// let arr = [1, 2, 3, 4, 5];

// for (let i = 0; i < arr.length; i++) {
//   console.log(arr[i]);
// }

// let person = {
//   name: '홍길동',
//   age: 25,
//   height: 180,
// };

// let newArray = Object.keys(person);

// for (let i = 0; i < newArray.length; i++) {
//   let nowKey = newArray[i];
//   console.log(`key: ${nowKey}, value: ${person[nowKey]}`);
// }

// let newArray = Object.values(person);

// for (let i = 0; i < newArray.length; i++) {
//   console.log(`value: ${newArray[i]}`);
// }

// let newArray = Object.entries(person);

// for (let i = 0; i < newArray.length; i++) {
//   console.log(`key: ${newArray[i][0]}, value: ${newArray[i][1]}`);
// }
// console.log(Object.entries(person));

// let arr = [1, 2, 3, 4, 5];

// for (let i of arr) {
//   console.log(i);
// }

// let person = {
//   name: '홍길동',
//   age: 35,
//   height: 180,
// };

// for (let key in person) {
//   console.log(`key ${key}, value : ${person[key]}`);
// }

////////////////////////////// 반복문

// let arr = [1, 2, 3, 4, 5];

// arr.forEach((elm, idx, array) => {
//   console.log(`${idx}번째 요소는 ${elm}입니다.`);
//   console.log(array);
// });

// let newArray = arr.map((elm) => {
//   return elm * 10;
// });

// for (let i = 0; i < arr.length; i++) {
//   newArray.push(arr[i] * 10);
// }

// console.log(newArray);

// let colors = ['green', 'blue', 'purple'];
// console.log(colors.at(-1));

// console.log(colors.includes('blue', 2));
// console.log(colors.includes('blue', 1));

// let colors = [
//   { id: 1, color: 'green' },
//   { id: 2, color: 'blue' },
//   { id: 3, color: 'purple' },
//   { id: 4, color: 'yellow' },
// ];
// console.log(colors.indexOf('blue', 1));

// let idx = colors.findIndex((elm) => elm.color === 'purple');

// console.log(idx);

// colors.findIndex((elm, idx, array) =>
//   console.log(`${idx} 번째 값은 id: ${elm.id}, color: ${elm.color}`)
// );
// colors.findIndex((elm, idx, array) => console.log(array));

// let idx = colors.find((elm) => elm.color === 'purple');

// console.log(idx);

// let filterArray = colors.filter((elm, idx, array) => elm.id > 1);

// console.log(filterArray);

// let sliceArray = colors.slice(1, 3);

// console.log(sliceArray);

///////////////////////////// 배열 메서드-1

// let array1 = ['green', 'blue'];
// let array2 = ['purple', 'yellow'];

// console.log(array1.concat(array2))

// let array1 = ['green', 'blue', 'purple', 'yellow'];
// console.log(array1.join());
// console.log(array1.join(' '));

// const compare = (a, b) => {
//   if (a > b) return -1;
//   else if (a < b) return 1;
//   else return 0;
// };

// let colors = ['green', 'blue', 'purple'];
// colors.sort(compare);

// console.log(colors);

// const compare = (a, b) => {
//   return b - a;
// };
// let numbers = [1, 100, 25, 50, 120, 3];
// numbers.sort(compare);
// console.log(numbers);

// let numbers = [1, 100, 25, 50];
// let sum = 0;

// numbers.forEach((elm) => {
//   sum += elm;
// });

// console.log(sum);

// let numbers = [1, 100, 25, 50];
// let sum = numbers.reduce((acc, cur, idx) => {
//   console.log(acc, cur, idx);
//   return acc + cur;
// }, 0);

// console.log(sum);

// let a = Array.isArray([1, 100, 50]);
// let b = Array.isArray({ id: 1, color: 'green' });
// let c = Array.isArray('string');
// let d = Array.isArray(undefined);

// console.log(a, b, c, d);

///////////////////////////// 배열 메서드-2
