import React, { useState } from "react";

export default function Prac2() {
  const [inputText, setInputText] = useState("");

  return (
    <div>
      <input
        type="text"
        value={inputText}
        onChange={(e) => {
          // 무엇을 입력 받았니?
          // input태그에 입력한 값 => 입력값
          // input태그는 뭔데? => 이벤트가 발생된 element.
          const inputTag = e.target;
          const value = inputTag.value;
          setInputText(value);
        }}
      />
      {/* {!inputText && <div>여기에 동기화 됨!</div>}
      <div>{inputText}</div> */}
      <div>{inputText ? inputText : "여기에 동기화 됨!"}</div>
    </div>
  );
}
