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
