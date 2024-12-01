import React, { useEffect, useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { addPost } from '../store/slices/postsSlice';
import { Navigate, useNavigate } from 'react-router-dom';

export default function PostCreate() {
  const { isLoggedIn } = useSelector((state) => state.auth);
  const [formData, setFormData] = useState({ title: '', content: '' });
  // reducer를 실행시키는 함수, 반드시 디스패치로 실행해야함
  const dispatch = useDispatch();
  // 제출 눌렀을때 게시글로 이동 시킴
  const navigate = useNavigate();

  // 최초 한번, 또는 dependency가 바뀌었을 때
  useEffect(() => {
    if (!isLoggedIn) {
      navigate('/');
      // 로그인 페이지로 이동 시키면 더 좋을 듯
    }
  }, [isLoggedIn]);
  // if (!isLoggedIn) {
  //   return <div>어딜 들어와</div>;
  // }
  // Navigate
  // useNavigate()

  // 로그인을 했는지 여부에 따라서
  // 했으면 그냥 보여주기
  // 안했으면 딴거 보여주기 아니면 다른데로 보내기

  function handleFormInput(e) {
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
    // console.log(formData);

    // payload는 절단하고자하는 데이터,
    // dispatch(addPost(payload))
    // store에 변수 실행은 useSelecter, store에 있는 setter실행은 dispatch
    // reducer는 이 데이터를 받아다가 푸쉬해준다
    dispatch(addPost({ ...formData, id: Date.now() }));
    // 제출 눌렀을때 게시글로 이동 시킴
    navigate('/posts');
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
          onChange={handleFormInput}
        />

        <label>
          내용 :{' '}
          <textarea name="content" id="" onChange={handleFormInput}></textarea>
        </label>
        <button>제출</button>
      </form>
    </>
  );
}
