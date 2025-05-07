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

// let colors = ['green', 'blue', 'purple'];

// let c1 = colors[0];
// let c2 = colors[1];
// let c3 = colors[2];

// let [c1, c2, c3] = colors;

// let c1, c2, c3, c4; // 선언 분리 할당
// [c1, c2, c3, c4 = 'yellow'] = ['green', 'blue', 'purple'];

// console.log(c1);
// console.log(c2);
// console.log(c3);
// console.log(c4);

// let a = 10;
// let b = 5;
// let tmp;

// tmp = a;
// a = b;
// b = tmp;

// console.log(a, b);

// let a = 10;
// let b = 5;

// [a, b] = [b, a];

// console.log(a, b);

// let colors = {
//   c1: 'green',
//   c2: 'blue',
//   c3: 'purple',
// };

// let { c1, c2, c3 } = colors;

// let color1 = colors.c1;
// let color2 = colors.c2;
// let color3 = colors.c3;

// let { c1, c2, c3, c4 = 'yellow' } = colors;

// console.log(c1);
// console.log(c2);
// console.log(c3);
// console.log(c4);

///////////////////////////// 구조 분해 할당

// spread

// const toy = {
//   type: 'bear',
//   price: 15000,
// };

// const blueToy = {
//   ...toy,
//   color: 'blue',
// };

// const yellowToy = {
//   ...toy,
//   color: 'yellow',
// };

// console.log(blueToy);
// console.log(yellowToy);

// const color1 = ['red', 'orange', 'yellow'];
// const color2 = ['blue', 'navy', 'purple'];

// const rainbow = [...color1, 'green', ...color2];

// console.log(rainbow);

// rest
// 나머지 매개변수

// const blueToy = {
//   type: 'bear',
//   price: 15000,
//   color: 'blue',
// };

// const { type, ...rest } = blueToy;

// console.log(type);
// console.log(rest);

// const color = ['red', 'orange', 'yellow', 'green'];
// const [c1, c2, ...rest] = color;
// console.log(c1, c2);
// console.log(rest);

// const print = (a, b, ...rest) => {
//   console.log([a, b, rest]);
// };

// print(1, 2, 3, 4, 5, 6);

// const print = (...rest) => {
//   console.log(rest);
// };

// const numbers = [1, 2, 3, 4, 5, 6];
// print(...numbers);

///////////////////////////// spread 와 rest

// const workA = () => {
//   console.log('workA');
// };
// const workB = () => {
//   console.log('workB');
// };
// const workC = () => {
//   console.log('workC');
// };

// workA();
// workB();
// workC();

// const work = (callback) => {
//   setTimeout(() => {
//     console.log('비동기');
//     callback();
//   }, 3000);
// };

// work(() => {
//   console.log('종료');
// });

// const workA = () => {
//   setTimeout(() => {
//     console.log('workA');
//   }, 5000);
// };
// const workB = () => {
//   setTimeout(() => {
//     console.log('workB');
//   }, 3000);
// };
// const workC = () => {
//   setTimeout(() => {
//     console.log('workC');
//   }, 10000);
// };
// const workD = () => {
//   console.log('workD');
// };

// workA();
// workB();
// workC();
// workD();

///////////////////////////// 비동기

// const executor = (resolve, reject) => {
//   setTimeout(() => {
//     resolve('성공');
//     reject('실패');
//   }, 3000);
// };

// const promise = new Promise(executor);
// promise
//   .then((result) => {
//     console.log(result);
//   })
//   .catch((error) => {
//     console.log(error);
//   });

// const workA = (value) => {
//   const promise = new Promise((resolve) => {
//     setTimeout(() => {
//       callback(value + 5);
//     }, 5000);
//   });
//   return promise;
// };
// const workB = (value, callback) => {
//   const promise = new Promise((resolve) => {
//     setTimeout(() => {
//       callback(value - 5);
//     }, 5000);
//   });
//   return promise;
// };
// const workC = (value, callback) => {
//   const promise = new Promise((resolve) => {
//     setTimeout(() => {
//       callback(value + 10);
//     }, 5000);
//   });
//   return promise;
// };

// 프로미스 체이닝
// workA(10)
//   .then((resA) => {
//     console.log(`workA : ${resA}`);
//     return workB(resA);
//   })
//   .then((resB) => {
//     console.log(`workB : ${resB}`);
//     return workC(resB);
//   })
//   .then((resC) => {
//     console.log(`workC : ${resC}`);
//   });

// workA(10).then((resA) => {
//   console.log(`workA : ${resA}`);
//   workB(resA).then((resB) => {
//     console.log(`workB : ${resB}`);
//     workC(resB).then((resC) => {
//       console.log(`workC : ${resC}`);
//     });
//   });
// });

// workA(10, (resA) => {
//   console.log(`workA : ${resA}`);
//   workB(resA, (resB) => {
//     console.log(`workB : ${resB}`);
//     workC(resB, (resC) => {
//       console.log(`workC : ${resC}`);
//     });
//   });
// });
//////////////////////////// 프로미스 객체

// const delay = (ms) => {
//   return new Promise((resolve) => {
//     setTimeout(() => {
//       resolve(`3초가 지났습니다`);
//     }, ms);
//   });
// };

// const start = async () => {
//   try {
//     let result = await delay(3000);
//     console.log(result);
//   } catch (error) {
//     console.log(error);
//   }
// };

// start();

const workA = () => {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve('workA');
    }, 5000);
  });
};
const workB = () => {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve('workB');
    }, 3000);
  });
};
const workC = () => {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve('workC');
    }, 10000);
  });
};

const start = async () => {
  try {
    let results = await Promise.all([workA(), workB(), workC()]);
    results.forEach((res) => console.log(res));
  } catch (err) {
    console.log(err);
  }
};

start();
//////////////////////////// async와 await
