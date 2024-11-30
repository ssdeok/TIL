import React, { useState } from "react";

export default function PostCreate() {
  const [formData, setFormData] = useState({ title: "", content: "" });

  function handleChange(e) {
    // 우리의 state를 변경하고 싶어.
    // input의 value를 우리의 state에 넣고 싶어.
    const inputValue = e.target.value;
    const key = e.target.name;

    setFormData({
      // value는 입력값
      // content가 여러개일때 ...을 쓰고, 바뀌는것만 표시
      ...formData,
      // 이렇게 해주면 title과 content 둘다 inputValue값이 바뀜
      [key]: inputValue,
      // content: formData.content,
    });
  }
  function handleSubmit(e) {
    // form을 실행하면 새로고침되는데 그걸 막아주기위해 사용/출력 버튼 아래 form
    e.preventDefault();
    console.log(formData);
  }
  return (
    <>
      <h3>PostCreate</h3>
      <button
        onClick={() => {
          console.log(formData);
        }}
      >
        출력
      </button>
      {/* form action에서 action은 url로 요청을 보내고, 응답을 받는다.
      나의 브라우저는 새로운 응답을 렌더링 한다. */}
      {/* 그런데 여기서 사용하지않는 이유는 사용자 경험때문에 */}
      <form onSubmit={handleSubmit}>
        <label htmlFor="title">제목</label>
        <input
          type="text"
          name="title"
          // 인풋에 입력이 되었을 때 우리의 state를 변경하고 싶어
          // 여기가 인풋에 입력이 되었을 때 입니다.
          onChange={handleChange}
        />

        <label>
          내용 :{" "}
          <textarea name="content" id="" onChange={handleChange}></textarea>
        </label>
        <button>제출</button>
      </form>
    </>
  );
}
