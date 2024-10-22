// 배열의 반복문1
arr = [1, 2, 3, 4, 5];

for (let num of arr) {
  console.log(num);
}

// 배열의 반복문2
arr = [1, 2, 3, 4, 5];

for (let num1 of arr) {
  console.log(`${num1 ** 2}`);
}

//배열의 반복문3
arr = [0, 1, 2, 3, 4, 5];

for (let num2 of arr) {
  if (num2 % 2 == 0 && num2 != 0) {
    console.log(num2);
  }
}

// 객체의 반복문1
let person = {
  name: '홍길동',
  age: 30,
  job: '개발자',
};

for (let key in person) {
  console.log(`${key}, ${person[key]}`);
}
