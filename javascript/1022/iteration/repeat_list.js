const names = ['jun', 'beemo', 'ken'];
const ages = [18, 28, 37];

let index = 0;

while (index < names.length) {
  let age = ages[index];
  let name = names[index];
  console.log(`${age}살 ${name}`);
  index++;
}
