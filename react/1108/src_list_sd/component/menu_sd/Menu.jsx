import React from "react";
import MenuControl from "./MenuControl";

export default function Menu() {
  return (
    <>
      <h1>Menu</h1>

      <div>
        COFFEE
        <div>
          아메리카노
          <div>5.0/5.5</div>
        </div>
        <div>
          카페라떼
          <div>6.0/6.5</div>
        </div>
        <div>
          바닐라라떼
          <div>6.0/6.5</div>
        </div>
      </div>

      <div>
        ADE
        <div>레몬에이드</div>
        <div>자몽에이드</div>
        <div>유자에이드</div>
      </div>
    </>
  );
}
