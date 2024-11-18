import React from "react";
import { useParams } from "react-router-dom";

export default function WebtoonDetail() {
  const { day } = useParams();
  // day를 가지고 fetch(`localhost/webtoon/${day}`) 의 data를 보여줌
  return <div> {day} - WebtoonDetail</div>;
}
