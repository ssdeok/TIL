import React, { useState } from "react";
import Prac1Button from "./Prac1Button";

export default function Prac1() {
  const [counter, setCounter] = useState(0);

  return (
    <>
      <Prac1Button
        onNulum={() => {
          setCounter(counter + 1);
        }}
        value="haha"
      >
        +
      </Prac1Button>
      <Prac1Button
        onNulum={() => {
          setCounter((prevCounter) => prevCounter - 1);
        }}
        value="haha"
      >
        -
      </Prac1Button>
      {/* <button
        onClick={() => {
          setCounter(counter + 1);
        }}
      >
        +
      </button> */}
      {/* <button
        onClick={() => {
          setCounter((prevCounter) => prevCounter - 1);
        }}
      >
        -
      </button> */}
      <div>{counter}</div>
    </>
  );
}
