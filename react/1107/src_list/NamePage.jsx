import React from "react";

export default function NamePage() {
  const names = ["김철수", "이영희", "박민수", "정지원", "최동욱"];

  const liNames = names.map((name) => {
    return <li>{name}</li>;
  });

  return (
    <>
      <h2>names page</h2>
      <ul>{liNames}</ul>
    </>
  );
}
