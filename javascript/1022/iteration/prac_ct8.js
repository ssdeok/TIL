//마지막문제로 const로 나열하여 해보기

// 주어진 테이블의 데이터를 people 변수 저장
let people = [
  {
    name: 'jun',
    age: 15,
    gender: 'M',
  },
  {
    name: 'ken',
    age: 36,
    gender: 'F',
  },
  {
    name: 'alex',
    age: 37,
    gender: null,
  },
];
console.log(people);

// 사람에 대한 정보를 각각 출력
for (let person of people) {
  for (let key in person) {
    let value = person[key];
    console.log(key, value);
  }
  console.log();
}

console.log();

//이름이 alex인 사람에 대한 정보 출력
for (let person1 of people) {
  const name = person1.name;
  if (name === 'alex') {
    console.log(person1);
  }
}
//   alex인 사람의 나이 출력
for (let person1 of people) {
  const name = person1.name;
  if (name === 'alex') {
    const age = person1.age;
    console.log(age);
  }
}
//이름을 활용하여 데이터 쉽게
