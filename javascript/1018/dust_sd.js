let dust = 30;

if (dust > 251) {
  console.log('빨강');
} else if (251 > dust > 101) {
  console.log('노랑');
} else if (101 > dust > 51) {
  console.log('초록');
} else if (51 > dust > 0) {
  console.log('파랑');
}

//미세먼지는 좋은데, 초미세가 나쁨
// 나쁨으로 출력되게