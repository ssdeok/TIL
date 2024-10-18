// if (condition) {
//   condition이 true일 때 실행
// }

// if (condition) {
//   conditiond; true일 때 실행
// } else {
//   condition이 false일 때 실행
// }

let money = 10000;

if (money > 1000) {
  console.log('충분한 돈이 있어');
}

let money2 = 100;
if (money2 > 1000) {
  console.log('충분한 돈이 있어');
} else {
  console.log('나는 충분한 돈이 없어');
}

// 지금 온도가 20도 정도 되는데

// 22도보다 작으면 좀 춥더라고
// 보일러좀 틀어줘

// 22도보다 크면 좀 덥더라고
// 에어컨좀 틀어줘

temp = 20;

if (temp < 22) {
  console.log('보일러 on');
} else {
  console.log('에어컨 on');
}

// 돈이 10000원보다 많으면 치킨
// 돈이 5000원보다 많으면 라면
// 돈이 1000원보다 많으면 과자
// 돈이 100원보다 많으면 사탕

money3 = 10000;

if (money3 > 10000) {
  console.log('치킨');
} else {
  // if money <= 10000 라는 의미가 내포됩니다.
  if (money3 > 5000) {
    console.log('라면');
  } else {
    // if money <= 10000
    // if money <= 5000
    // 라는 의미가 내포됩니다.
    if (money3 > 1000) {
      console.log('과자');
    }
  }
}

let money4 = 10000;
if (money4 > 10000) {
  console.log('치킨');
} else if (money4 > 5000) {
  console.log('라면');
} else if (money4 > 1000) {
  console.log('과자');
}

let dust = 30;

if (dust > 251) {
  console.log('빨강');
} else if (dust > 101) {
  console.log('노랑');
} else if (dust > 51) {
  console.log('초록');
} else if (dust > 0) {
  console.log('파랑');
}

//미세먼지는 좋은데, 초미세가 나쁨
// 나쁨으로 출력되게
