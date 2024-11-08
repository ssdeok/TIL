import React from "react";

export default function ColoredButton({
  color = "white",
  backgroundColor,
  children,
  onButtonClick,
}) {
  return (
    <button onClick={onButtonClick} style={{ color, backgroundColor }}>
      {children}
    </button>
  );
}
