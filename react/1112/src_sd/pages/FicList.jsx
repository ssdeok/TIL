import React, { useState } from "react";
import { Link } from "react-router-dom";
Link;

export default function FicList() {
  const [fics, setFics] = useState([
    {
      id: 1,
      title: "장편",
      content: "소설",
    },
    {
      id: 2,
      title: "단편",
      content: "소설",
    },
    {
      id: 3,
      title: "공상",
      content: "과학",
    },
  ]);

  return (
    <div>
      <h2>
        <Link to="/ficmain">메인페이지</Link>
      </h2>

      <ul>
        {fics.map((fic) => {
          const { id, title, content } = fic;
          return (
            <li key={id}>
              <h3>{title}</h3>

              <p>{content}</p>
            </li>
          );
        })}
      </ul>
    </div>
  );
}
