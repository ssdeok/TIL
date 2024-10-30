// 과제 07

// 배열의 반복문 1
arr = [1, 2, 3, 4, 5];

for (let arr1 of arr) {
  console.log(arr1);
}

// 배열의 반복문 2
arr = [1, 2, 3, 4, 5];

for (let arr2 of arr) {
  console.log(arr2 * arr2);
}

// 배열의 반복문 3
arr = [0, 1, 2, 3, 4, 5];

for (let arr3 of arr) {
  if (arr3 % 2 === 0 && arr3 !== 0) {
    console.log(arr3);
  }
}

// 객체의 반복문 1
let person = {
  name: '홍길동',
  age: 30,
  job: '개발자',
};
for (let key in person) {
  console.log(`${key}, ${person[key]}`);
}
