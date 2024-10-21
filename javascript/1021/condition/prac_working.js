const isWeekend = true;
const nowtime = 19;

// 주말이거나 일과시간 이후 = 휴식
// 주말의 일과시간 이후 = 자기개발
// 일과시간 = 일

// !일과시간 = 일과이후
// 주말 일과시간
// t      t       휴식
// t      f       자기개발
// f      t        일
// f      f       휴식

let isworking;

// 9~18시 workhour = true
// 아닐때는 workhour = false

if (9 <= nowtime && nowtime <= 18) {
  isworking = true;
} else {
  isworking = false;
}

let todo;

if (isWeekend) {
  if (isworking) {
    todo = '휴식';
    console.log(todo);
  } else {
    todo = '자기개발';
    console.log(todo);
  }
} else {
  if (isworking) {
    todo = '일';
    console.log(todo);
  } else {
    todo = '휴식';
    console.log(todo);
  }
}
