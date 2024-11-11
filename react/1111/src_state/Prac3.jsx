import React, { useState } from "react";

export default function Prac3() {
  const [inputColor, setInputColor] = useState("");
  return (
    <div>
      <input
        type="text"
        onChange={(e) => {
          setInputColor(e.target.value);
        }}
      />
      <div
        style={{ width: 100, height: 100, backgroundColor: inputColor }}
      ></div>
    </div>
  );
}
