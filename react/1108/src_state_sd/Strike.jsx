import React from "react";

export default function Strike() {
  function handleClick() {
    alert("확인");
  }
  return <button onClick={handleClick}>확인</button>;
}
