// 과제06

// 숫자 크기 비교 1
let number_1 = 10;
console.log(number_1);
if (number_1 < 10) {
  console.log('number_1은 10보다 작다.');
}

// 짝수
let number1_11 = 2;
console.log(number1_11);
if (number1_11 % 2 === 0) {
  console.log('짝수');
}

// 자료형 확인
let variable = '서울';
console.log(variable);
if (typeof variable === 'number') {
  console.log('숫자형');
}

// 숫자 크기 비교 2
let number11_1 = 15;
console.log(number11_1);
if (number11_1 < 10) {
  console.log('number11_1은 10보다 작다');
} else if (number11_1 > 10) {
  console.log('number11_1은 10보다 크다');
}

// 합격/불합격
let score = 20;
console.log(score);
if (score >= 60) {
  console.log('합격');
} else if (score < 60) {
  console.log('불합격');
}

// 숫자 크기 비교 3
let number1_12 = 11;
console.log(number1_12);
if (number1_12 < 10) {
  console.log('number1_12은 10보다 작다.');
} else if (number1_12 > 10) {
  console.log('number1_12은 10보다 크다.');
} else {
  console.log('number1_12는 10이다');
}

// 숫자 크기 비교 4
let num_1 = '25';
console.log(num_1);
if (typeof num_1 === 'number') {
  if (num_1 < 10) {
    console.log('num_1은 10보다 작다.');
  } else if (num_1 > 10) {
    console.log('num_1은 10보다 크다.');
  } else {
    console.log('num_1은 10이다');
  }
} else if (typeof num_1 !== 'number') {
  console.log('숫자가 아니다.');
}

// 짝수/홀수
let num_11 = 11;
console.log(num_11);
if (num_11 === 0) {
  console.log('영');
} else if (num_11 !== 0) {
  if (num_11 % 2 === 0) {
    console.log('짝수');
  } else if (num_11 % 2 === 1) {
    console.log('홀수');
  }
}

// 아이디/비밀번호 확인
let username = 'sesac';
let password = 'sesac1234';
console.log(username);
console.log(password);
if (username === 'sesac' && password === 'sesac1234') {
  console.log('로그인 성공');
} else if (username !== 'sesac') {
  console.log('로그인 실패');
}

// 두 수 비교
let num_12 = 30;
let num_22 = 30;
console.log(num_12);
console.log(num_22);
if (num_12 > num_22) {
  console.log(num_12);
} else if (num_12 < num_22) {
  console.log('num_22');
} else {
  console.log('같다');
}

// 2와 3의 배수
let nums_1 = 1;
console.log(nums_1);
if (nums_1 % 2 === 0 && nums_1 % 3 === 0) {
  console.log('6의 배수');
} else if (nums_1 % 2 === 0 && nums_1 % 3 !== 0) {
  console.log('2의 배수');
} else if (nums_1 % 2 !== 0 && nums_1 % 3 === 0) {
  console.log('3의 배수');
} else {
  console.log('2의 배수도 아니고, 3의 배수도 아니다.');
}
