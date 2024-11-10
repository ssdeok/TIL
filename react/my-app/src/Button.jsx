import React from 'react';

export default function Button(props) {
  const { onClick } = props;
  console.log(props);
  return <button onClick={onClick}>클릭</button>;
}
