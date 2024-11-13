import React, { useEffect } from "react";
import { Navigate, useParams } from "react-router-dom";

export default function WebtoonDetail() {
  const { day } = useParams();
  const weekData = new Set(["mon", "tue", "wed", "thu", "fri", "sat", "sun"]);

  if (!weekData.has(day)) {
    console.log("실패");

    return <Navigate to="/webtoon" replace></Navigate>;
    // return <div>잘못된 페이지야!</div>;
  } else {
    // day를 가지고 fetch(`localhost/webtoon/${day}`) 의 data를 보여줌
    return <div>{day} - WebtoonDetail</div>;
  }
}
