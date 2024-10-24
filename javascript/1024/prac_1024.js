console.log('A');

setTimeout(() => {
    console.log('B'); // 함수 실행 후 1초 후에 실행된다.
}, 1000);

console.log('C');

/*
A
C
B
*/