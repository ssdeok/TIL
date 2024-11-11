const numbers = [1, 2, 3, 4];

const console_log = function (el) {
  console.log(el);
};

numbers.forEach(console_log);

// ///////////////////////////

numbers.forEach((num) => {
  console.log(num);
});
