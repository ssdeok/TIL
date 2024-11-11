import React from "react";

export default function Prac1Button({ onNulum, children, className }) {
  return (
    <button onClick={onNulum} className={className}>
      {children}
    </button>
  );
}
