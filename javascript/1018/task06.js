let number_1 = 9;
console.log(number_1);

if (number_1 < 10) {
  console.log('number_1은 10보다 작다');
}

let number_2 = 1;
console.log(number_2);

if (number_2 % 2 === 0) {
  console.log('짝수');
}

let variable = 2;
console.log(variable);

if (typeof variable === 'number') {
  console.log('숫자형');
}

let number_11 = 5;
console.log(number_11);

if (number_11 < 10) {
  console.log('number_1은 10보다 작다.');
} else if (number_11 > 10) {
  console.log('number_1은 10보다 크다.');
}

let score = 70;
console.log(score);

if (score >= 60) {
  console.log('합격');
} else if (score < 60) {
  console.log('불합격');
}

let number_111 = 77;
console.log(number_111);

if (number_111 < 10) {
  console.log('number_1은 10보다 작다.');
} else if (number_111 > 10) {
  console.log('number_1은 10보다 크다.');
} else if (number_111 === 10) {
  console.log('number_1은 10이다');
}

let number_1111 = 'nike';
console.log(number_1111);

if (typeof number_1111 === 'number') {
  if (number_1111 < 10) {
    console.log('number_1은 10보다 작다.');
  } else if (number_1111 > 10) {
    console.log('number_1은 10보다 크다.');
  } else if (number_1111 === 10) {
    console.log('number_1은 10이다');
  }
} else if (typeof number_1111 != 'number') {
  console.log('숫자가 아니다.');
}

let number_11111 = 0;
console.log(number_11111);

if (number_11111 === 0) {
  console.log('영');
} else if (number_11111 != 0) {
  if (number_11111 % 2 === 0) {
    console.log('짝수');
  } else if (number_11111 % 2 === 1) {
    console.log('홀수');
  }
}

let username = 'sesac';
let password = 100;
console.log(username);
console.log(password);

if (username === 'sesac' && password === 'sesac1234') {
  console.log('로그인 성공');
} else if (username === 'sesac' && password != 'sesac1234') {
  console.log('로그인 실패');
}

let number_22 = 200;
let number_33 = 200;
console.log(number_22);
console.log(number_33);

if (number_22 < number_33) {
  console.log(number_33);
} else if (number_22 == number_33) {
  console.log('같다');
}

let number_222 = 5;
console.log(number_222);

if (number_222 % 2 === 0 && number_222 % 3 === 0) {
  console.log('6의 배수');
} else if (number_222 % 2 === 0) {
  console.log('2의 배수');
} else if (number_222 % 3 === 0) {
  console.log('3의 배수');
} else if (number_222 % 2 !== 0 && number_222 % 3 !== 0) {
  console.log('2의 배수도 아니고, 3의 배수도 아니다.');
}
