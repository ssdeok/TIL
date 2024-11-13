import React from "react";
import { Link } from "react-router-dom";

export default function WebtoonHeader() {
  const weekData = [
    { url: "mon", name: "월" },
    { url: "tue", name: "화" },
    { url: "wed", name: "수" },
    { url: "thu", name: "목" },
    { url: "fri", name: "금" },
    { url: "sat", name: "토" },
    { url: "sun", name: "일" },
  ];
  return (
    <nav>
      <ul>
        {weekData.map((el) => {
          return (
            <li key={el.url}>
              <Link to={`/webtoon/${el.url}`}>{el.name}요 웹툰</Link>
            </li>
          );
        })}
      </ul>
    </nav>
  );
}
