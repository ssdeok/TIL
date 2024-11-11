// 우선 부모 컴포넌트에서 사용할 공통 컴포넌트인 Button 컴포넌트를 구성
function Button({ onClick, children }) {
  // 함수의 이름을 넘겨주는 방식으로, 부모로부터 이벤트 핸들러를 prop로 넘겨 받을 수 있음.
  return <button onClick={onClick}>{children}</button>;
}

// PlayButton 컴포넌트를 구성
function PlayButton({ movieName }) {
  function handlePlayClick() {
    alert(`Playing ${movieName}!`);
  }

  // 같은 Button 컴포넌트를 사용하지만 다른 이벤트 핸들러(handlePlayClick)를 연결하는 코드
  return <Button onClick={handlePlayClick}>Play "{movieName}"</Button>;
}

// UploadButton 컴포넌트를 구성
function UploadButton() {
  // 같은 Button 컴포넌트를 사용하지만 다른 이벤트 핸들러(익명 함수)를 연결하는 코드
  return <Button onClick={() => alert("Uploading!")}>Upload Image</Button>;
}

export default function Toolbar() {
  return (
    <div>
      <PlayButton movieName="Kiki's Delivery Service" />
      <UploadButton />
    </div>
  );
}
