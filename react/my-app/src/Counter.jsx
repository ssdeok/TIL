import React, { useState } from 'react';

export default function Counter() {
  // let num = 0;
  const [num, setNum] = useState(0);
  return (
    <div>
      <div>{num}</div>
      <button
        onClick={() => {
          // setNum(num + 10);
          setNum((prev) => prev + 1);
        }}
      >
        클릭 +
      </button>
      <button onClick={() => console.log(num)}>출력 +</button>
    </div>
  );
}
