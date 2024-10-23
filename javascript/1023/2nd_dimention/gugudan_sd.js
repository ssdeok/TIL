let gugudan = [];

for (n = 1; n < 10; n++) {
  n_dan = [];
  for (let i = 1; i < 10; i++) {
    n_dan.push(n * i);
  }
  gugudan.push(n_dan);
}
console.log(gugudan);
