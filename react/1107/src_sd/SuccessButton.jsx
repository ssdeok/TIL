import React from "react";
import Button2 from "./Button2";
// 버튼은 버튼인데, 색이 빨간색인 버튼
// 대신 텍스트는 변경 가능
export default function SuccessButton({ text }) {
  return <Button2 backgroundColor="blue" text={text}></Button2>;
}
