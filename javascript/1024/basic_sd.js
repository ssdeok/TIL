const greet = function (name) {
  return `안녕하세요, ${name}님!`;
};

console.log(greet('철수')); // 안녕하세요, 철수님!

//x*2가 리턴값. {}없어도 간단식은 리턴 생략가능
const double = (x) => x * 2;
