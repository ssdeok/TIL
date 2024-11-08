import React from "react";

export default function Button2({ color = "white", backgroundColor, text }) {
  // const backgroundColor = "blue";
  // const text = "확인";
  return <button style={{ backgroundColor, color }}>{text}</button>;
}
