// let money = true;
let money = true;
let car = true;
// let car = false;

// money  car 조합해서 False가 나오도록.
// money   car   result
// T       T     F
// T       F     T
// F       T     T
// F       F     F

// XOR 라는 것은, OR는 OR인데, T - T 쌍인 경우를 제외한 것.

console.log((money || car) && !(money && car));
// console.log((money 또는 car가 둘 중 하나가 true) && !(money && car));
// console.log((money || car) && !(money , car가 둘다 true));

// if (money == true && car == true){
//   result = false
// } else if (money == true && car == false){
//   result = true
// }
