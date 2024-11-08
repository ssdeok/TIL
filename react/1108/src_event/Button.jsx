import React from "react";

export default function Button(props) {
  const { onSmash } = props;
  console.log(props);
  return <button onClick={onSmash}>클릭</button>;
}
