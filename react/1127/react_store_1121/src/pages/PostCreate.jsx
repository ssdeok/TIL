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
      <form action="">
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
