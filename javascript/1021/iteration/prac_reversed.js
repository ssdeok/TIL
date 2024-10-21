const nums = [10, 6, 8, 5, 4];

//시나리오
// 인덱스 나온다
// 이 인덱스로 반대편 인덱스를 구한다

// 5. 푸쉬된 값이 정렬된다.
const reversednum = [];

// 1. nums의 인덱스값을 순서대로 나열한다.
for (let index in nums) {
  //   4
  //0

  // 2. nums배열의 길이에서 1을뺀 인덱스값4를 가지고
  // nums의 인덱스를 빼서 새로운 인덱스를 생성한다.
  let newindex = nums.length - 1 - index; //0

  // 3. 새로 생성된 인덱스값을 nums의 배열에 넣어
  // 새로운값을 newvalue 값에 저장한다.
  let newvalue = nums[newindex]; //10

  // 4. newvalue값을 reversednum에 푸쉬한다.
  reversednum.push(newvalue);
}

// 6. 출력
console.log(reversednum);
