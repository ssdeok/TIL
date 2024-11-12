import React, { useState } from "react";
import { Link } from "react-router-dom";
Link;

export default function WebList() {
  const [webs, setWebs] = useState([
    {
      id: 1,
      title: "월",
      content: "월요일 웹툰",
    },
    {
      id: 2,
      title: "화",
      content: "화요일 웹툰",
    },
    {
      id: 3,
      title: "수",
      content: "수요일 웹툰",
    },
  ]);

  return (
    <div>
      <h2>
        <Link to="/webmain">메인페이지</Link>
      </h2>

      <ul>
        {webs.map((web) => {
          const { id, title, content } = web;
          return (
            <li key={id}>
              <Link to="/mon">
                <h3>{title}</h3>
              </Link>

              <p>{content}</p>
            </li>
          );
        })}
      </ul>
    </div>
  );
}
