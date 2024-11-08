import React from "react";

export default function EventPractice() {
  // 1번 문제
  // 버튼을 클릭하면 => 버튼 클릭이라는 alert가 나온다.

  function handleClick() {
    alert("버튼 클릭!");
  }

  // div가 필요함, 100사이즈 border가 있음

  // 2번 문제
  function changeBackgroundColor(target, color) {
    target.style.backgroundColor = color;
  }

  function checkEvent(e) {
    console.log(e.target);
  }
  return (
    <>
      <button onClick={checkEvent}>이벤트 확인</button>
      {/* 1번문제 */}
      <button
        onClick={() => {
          alert("버튼 클릭!");
        }}
      >
        클릭
      </button>
      <button onClick={handleClick}>클릭</button>

      {/* 2번 문제 */}
      <div
        style={{ width: 100, height: 100, border: "1px solid black" }}
        onMouseEnter={(e) => {
          changeBackgroundColor(e.target, "black");
        }}
        onMouseLeave={(e) => {
          e.target.style.backgroundColor = "white";
        }}
      ></div>

      {/* 3번 문제 */}
      {/* <input type="text" onInput={}/> */}
      <input
        type="text"
        onChange={(e) => {
          console.log("c", e.target.value);
        }}
        onInput={(e) => {
          console.log("i", e.target.value);
        }}
      />
    </>
  );
}
