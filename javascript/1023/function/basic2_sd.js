function add(a, b) {
  return a + b;
}
console.log(add(1, 2));
console.log(add(4, 10));

function greet(name = 'Guest') {
  console.log(`안녕하세요, ${name}님!`);
}

greet('서승덕');
greet();

function sum(...nums) {
  let total = 0;
  console.log(nums);
  return;
}
sum(1, 2, 3, 4, 5, 6, 7);

function greet(...names) {
  for (name of names) {
    console.log(`안녕하세요, ${name}님!`);
  }
}
greet('철수', '영희');
