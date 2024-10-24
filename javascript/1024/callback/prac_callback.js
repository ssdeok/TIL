let mat_1 = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];
let mat_2 = mat_1;
let mat_3 = [...mat_1];

mat_1[1] = 100;

console.log(mat_1); // 바뀜
console.log(mat_2); // 바뀜
console.log(mat_3); // 안 바뀜
