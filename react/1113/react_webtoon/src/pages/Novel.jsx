import React from "react";
import { Link, Outlet } from "react-router-dom";
import CommonHeader from "../components/CommonHeader";
export default function Novel() {
  const novelData = [
    { url: "action", name: "액션" },
    { url: "thriller", name: "스릴러" },
    { url: "romance", name: "로맨스" },
  ];

  return (
    <>
      <CommonHeader data={novelData}></CommonHeader>
      {/* <nav>
        <ul>
          {novelData.map((el) => {
            return (
              <li key={el.url}>
                <Link to={el.url}>{el.name}</Link>
              </li>
            );
          })}
        </ul>
      </nav> */}
      <Outlet></Outlet>
    </>
  );
}
