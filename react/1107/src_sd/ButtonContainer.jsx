import React from "react";
import Button from "./Button";

export default function ButtonContainer() {
  // const buttonTag = [text, backgroundColor, color];
  // const buttonColor = ["blue", "red", "yello"];
  // const buttonText = ["확인", "취소", "보류", "1억년"];

  const buttonData = [
    { backgroundColor: "blue", text: "확인" },
    { backgroundColor: "tomato", text: "취소" },
    { backgroundColor: "gray", text: "보류" },
    { backgroundColor: "violet", text: "1억년" },
  ];

  const buttonAray = buttonData.map((el) => {
    const { backgroundColor, text, color } = el;
    return (
      <Button color={color} backgroundColor={backgroundColor}>
        {text}
      </Button>
    );
  });
  return <>{buttonAray}</>;
}

// 버튼을 묶어서 1개만 써도 4개가 나오도록
//버튼을 하나 생성
//반복을 통해 3개 더 생성
//각각 다른 스타일
