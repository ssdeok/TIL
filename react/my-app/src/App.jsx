import React from 'react';
import Button from './Button';
import RedButton from './RedButton';
// import Counter from './Counter';

function Profile() {
  return <img src="https://i.imgur.com/MK3eW3Am.jpg" alt="Katherine Johnson" />;
}

export default function App() {
  return (
    <>
      <RedButton></RedButton>
      {/* <div>App</div> */}
      {/* <Counter></Counter> */}
      {/* <Button onClick={() => alert('실행!')} message="haha"></Button>
      <Button onClick={() => alert('취소!')}></Button> */}
      <Profile></Profile>
      <Profile></Profile>
      <Profile></Profile>
    </>
  );
}
