import React from "react";
import { useParams } from "react-router-dom";

export default function NovelDatil() {
  const { genre } = useParams();

  return <div>{genre} - novel detail</div>;
}
