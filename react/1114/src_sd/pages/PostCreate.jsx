import React, { useState } from "react";

export default function PostCreate() {
  const [formData, setFormData] = useState({ title: "", content: "" });
  const dispatch = useDispatch();
  const navigate = use;
  function handleChange(e) {
    // 우리의 state를 변경하고 싶어.
    // input의 value를 우리의 state에 넣고 싶어.
    const inputValue = e.target.value;
    const key = e.target.name;

    setFormData({
      ...formData,
      [key]: inputValue,
    });
  }
  // function handleChange(e) {}
  // function handleSubmit(e) {
  //   e.preventDefault();
  //   console.log(formData);
  // }
  return (
    <>
      <h3>PostCreate</h3>
      <form onSubmit={handleSubmit}></form>
      <form action="">
        <label htmlFor="title">제목 : </label>
        <input
          type="text"
          name="title"
          id="title"
          // 인풋에 입력이 되었을 때 우리의 state를 변경하고 싶어.
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
