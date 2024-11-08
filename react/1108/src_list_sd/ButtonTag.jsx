import React from "react";
import Button2 from "./Button2";

export default function ButtonTag() {
  const buttonData = [
    { backgroundColor: "green", text: "확인" },
    { backgroundColor: "yellow", text: "취소" },
    { backgroundColor: "pink", text: "보류" },
    { backgroundColor: "brown", text: "1억년" },
  ];

  const buttonAray = buttonData.map((el) => {
    const { backgroundColor, text, color } = el;
    return (
      <Button2 color={color} backgroundColor={backgroundColor}>
        {text}
      </Button2>
    );
  });
  return <>{buttonAray}</>;
}
