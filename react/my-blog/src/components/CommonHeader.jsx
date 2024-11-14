import React from "react";
import { Link } from "react-router-dom";
export default function CommonHeader({ data }) {
  return (
    <nav>
      <ul>
        {data.map((el) => {
          return (
            <li key={el.url}>
              <Link to={el.url}>{el.name}</Link>
            </li>
          );
        })}
      </ul>
    </nav>
  );
}
