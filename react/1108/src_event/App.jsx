import EventPractice from "./EventPractice";
import Button from "./Button";
import ColoredButton from "./ColoredButton";
function App() {
  function onCancel() {
    console.log("취소 완료");
  }

  function onpanding() {
    console.log("보류 완료");
  }
  return (
    <>
      <div>App</div>
      <ColoredButton
        onButtonClick={() => console.log("확인 완료")}
        backgroundColor="blue"
      >
        확인
      </ColoredButton>
      <ColoredButton onButtonClick={onCancel} backgroundColor="red">
        취소
      </ColoredButton>
      <ColoredButton onButtonClick={onpanding} backgroundColor="gray">
        보류
      </ColoredButton>
      <ColoredButton
        onButtonClick={() => {
          console.log("1억원 받음");
        }}
        backgroundColor="pink"
      >
        1억년
      </ColoredButton>
      <Button onSmash={() => alert("실행!")} message="haha"></Button>
      <Button onSmash={() => alert("취소!")}></Button>
      {/* <EventPractice></EventPractice> */}
    </>
  );
}

export default App;
