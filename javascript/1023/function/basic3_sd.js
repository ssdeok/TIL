console.log(add(1, 2));

function add(x, y) {
  return x + y;
}

const add2 = function (x, y) {
  return x + y;
};
console.log(add2(1, 2));

const add3 = (x, y) => {
  return x + y;
};
console.log(add2(1, 2));

const person = {
  name: '승덕',
  greet: function () {
    console.log('안녕하세요, 반갑습니다.');
  },
  greet() {
    console.log('안녕하세요, 반갑습니다');
    console.log(`${this.name}`);
  },
};

console.log(person.name);
person.greet();
