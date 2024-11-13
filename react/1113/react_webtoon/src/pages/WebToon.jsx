import React from "react";
import { Link, Outlet } from "react-router-dom";
import WebtoonHeader from "../components/WebtoonHeader";
import CommonHeader from "../components/CommonHeader";

export default function WebToon() {
  const weekData = [
    { url: "mon", name: "월요 웹툰" },
    { url: "tue", name: "화요 웹툰" },
    { url: "wed", name: "수요 웹툰" },
    { url: "thu", name: "목요 웹툰" },
    { url: "fri", name: "금요 웹툰" },
    { url: "sat", name: "토요 웹툰" },
    { url: "sun", name: "일요 웹툰" },
  ];
  return (
    <>
      <CommonHeader data={weekData}></CommonHeader>
      {/* <WebtoonHeader></WebtoonHeader> */}
      <Outlet></Outlet>
    </>
  );
}
