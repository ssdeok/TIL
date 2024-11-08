import React from "react";
import MenuCategoryItem from "./MenuCategoryItem";

//category와 beverages를 받아온다 그다음 리턴으로 뿌려준다
export default function MenuCategory({ category, beverages }) {
  const menuList = beverages.map((beverage) => {
    return <MenuCategoryItem {...beverage}></MenuCategoryItem>;
  });

  return (
    <section>
      <h2 className="text-center">{category}</h2>
      <ul>{menuList}</ul>
    </section>
  );
}
