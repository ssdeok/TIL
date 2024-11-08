import React from "react";

// name과 price를 받아온다
export default function MenuCategoryItem({ name, price }) {
  return (
    <li className="flex justify-between">
      <div>{name}</div>
      <div>{price}</div>
    </li>
  );
}
