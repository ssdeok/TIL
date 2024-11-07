import React from "react";
import Second from "./second";
import Third from "./Third";
import Force from "./Force";
import ButtonContainer from "./ButtonContainer";
import Button2 from "./Button2";
import SuccessButton from "./SuccessButton";
import ButtonTag from "./ButtonTag";

export default function App() {
  const names = ["김철수", "이영희", "박민수", "정지원", "최동욱"];
  const arry1 = names.map((el) => <div>{el}</div>);
  return (
    <>
      {arry1}
      <Second></Second>
      <Third></Third>
      <Force></Force>
      <ButtonContainer></ButtonContainer>
      <Button2 backgroundColor="blue" text="확인"></Button2>
      <Button2 backgroundColor="tomato" text="취소"></Button2>
      <Button2 backgroundColor="gray" text="보류"></Button2>
      <Button2 backgroundColor="violet" text="1억년"></Button2>

      <SuccessButton text="취소"></SuccessButton>
      <SuccessButton text="금지"></SuccessButton>
      <SuccessButton text="완료"></SuccessButton>

      <ButtonTag></ButtonTag>
    </>
  );
}
