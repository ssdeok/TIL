// global 환경에 변수 선언 -> 블럭 안에서 사용
// global 환경에 변수 선언 -> 블럭 안에서 변경
// global 환경에 변수 선언 -> 블럭 안에서 변경 -> global에서 사용

// global 환경에 변수 선언 -> 함수 안에서 사용
// global 환경에 변수 선언 -> 함수 안에서 변경
// global 환경에 변수 선언 -> 함수 안에서 변경 -> global에서 사용

var silver = '실버';

function printSilver() {
  console.log(silver);
}
printSilver();
