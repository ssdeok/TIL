let name = '서승덕';
console.log('안녕 나는 서승덕이야');
console.log(`안녕 나는 ${name}이야`);
console.log('안녕 나는 ' + name + '이야');

let number = 20;

let added_number = number + 1;

number++;

let num1 = 1;
let num2 = '1';
console.log(num1 !== num2);

//and에 대한 상황
let money = 100;
let hungry = 100;

// 돈이 1000원 보다 많으면 돈이 충분
console.log(money > 1000);

// 배고픔이 50보다 많으면 배고픈 것
console.log(hungry > 50);

// && and 연산자 => 돈이 충분하고 배가 고픔
console.log(money > 1000 && hungry > 50);

// ||(or) 연산자
console.log(money > 50);
console.log(hungry > 1000);
console.log(money > 50 || hungry > 50);

// !(not) 연산자
console.log(money > 50);
console.log(hungry > 1000);
console.log(!(money > 50 || hungry > 1000));
console.log(!(money > 50 && hungry > 1000));

let a = 8;
let b = 7;

console.log(a + b);
console.log(a - b);
console.log(a * b);
console.log(a / b);

console.log(10 % 4);
console.log(2 ** 4);

let count = 7;
count++;
console.log(count);

let count1 = 8;
++count1;
console.log(count1);

console.log(10 / 5);
console.log(8 % 3);
console.log(Math.floor(7 / 2));

let x = 10;
console.log(x);

x += 5;
console.log(x);

x *= 2;
console.log(x);

//and에 대한 상황
let money2 = 100;
let hungry2 = 100;

// 돈이 1000원 보다 많으면 돈이 충분
console.log(money2 > 1000);

// 배고픔이 50보다 많으면 배고픈 것
console.log(hungry2 > 50);

// && and 연산자 => 돈이 충분하고 배가 고픔
console.log(money2 > 1000 && hungry2 > 50);
