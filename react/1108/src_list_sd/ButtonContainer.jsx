import React from "react";
import Button from "./Button";
export default function ButtonContainer() {
  const buttonColor = ["blue", "red", "yello"];
  const buttonText = ["확인", "취소", "뭐시기"];

  const buttonData = [
    { backgroundColor: "blue", text: "확인", color: "black" },
    { backgroundColor: "tomato", text: "취소" },
    { backgroundColor: "gray", text: "보류" },
    { backgroundColor: "violet", text: "1억년" },
  ];

  const buttons = buttonData.map((button) => {
    const { backgroundColor, text, color } = button;
    return (
      <Button color={color} backgroundColor={backgroundColor}>
        {text}
      </Button>
    );
  });

  return (
    <div>
      {/* <Button backgroundColor="blue">확인</Button>
      <Button backgroundColor="blue">확인</Button>
      <Button backgroundColor="blue">확인</Button> */}
      {buttons}
    </div>
  );
}
