import React, { useState } from "react";

export default function Counter() {
  // 숫자가 있음
  // 버튼을 누르면 숫자가 1 증가함
  // 또 다른 버튼을 누르면 숫자가 출력이 됨.
  // let num = 0;

  const [num, setNum] = useState(0);
  
  // let num = 0;
  const arr = [1, 2, 3];
  arr.push;
  return (
    <div>
      <div>{num}</div>
      <button
        onClick={() => {
          // num++;
          // setNum(num + 1);
          setNum((prev) => prev + 1);
        }}
      >
        클릭 +
      </button>
      <button onClick={() => console.log(num)}>출력</button>
    </div>
  );
}
