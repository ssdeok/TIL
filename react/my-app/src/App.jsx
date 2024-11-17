import React from 'react';
import Button from './Button';
import RedButton from './RedButton';
// import Counter from './Counter';

export default function App() {
  return (
    <>
      <RedButton></RedButton>
      {/* <div>App</div> */}
      {/* <Counter></Counter> */}
      <Button onClick={() => alert('실행!')} message="haha"></Button>
      <Button onClick={() => alert('취소!')}></Button>
    </>
  );
}
