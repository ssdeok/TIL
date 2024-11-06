import React from "react";
import Child from "./Child";
export default function Parent() {
  return (
    <div className="box">
      <Child></Child>
      <Child></Child>
      <div>child</div>
    </div>
  );
}
