import React from "react";
import { Link } from "react-router-dom";
Link;

export default function Header() {
  return (
    <header>
      <ul>
        <li>
          <Link to="/webs">웹툰</Link>
        </li>
        <li>
          <Link to="/fics">소설</Link>
        </li>
        
      </ul>
    </header>
  );
}
