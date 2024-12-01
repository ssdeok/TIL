import React from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { Link } from 'react-router-dom';
import { login, logout } from '../store/slices/authSlice';

export default function Header() {
  const { isLoggedIn } = useSelector((state) => state.auth);
  // console.log(isLoggedIn);
  const dispatch = useDispatch();

  return (
    <header>
      <div>
        <button onClick={() => console.log(isLoggedIn)}>출력</button>
        {isLoggedIn ? (
          // 로그아웃 해와 로그인 해는 리듀서. 그렇기때문에 디스패치가 필요함
          // <button onClick={() => {로그아웃 해}}>로그아웃</button> :
          // <button onClick={() => {로그인 해}}>로그인</button>}
          <button
            onClick={() => {
              dispatch(logout());
              // 홈으로 보내
            }}
          >
            로그아웃
          </button>
        ) : (
          <button
            onClick={() => {
              dispatch(login());
            }}
          >
            로그인
          </button>
        )}
      </div>
      <ul>
        <li>
          <Link to="/">Home으로</Link>
        </li>
        <li>
          <Link to="/posts">게시글로</Link>
        </li>

        {/* 로그인을 한 경우에만 보여주고 싶어요
        삼항연산자보다 &&가 낫다 
        &&은 원래 공식. isLoggedIn가 트루일때 &&의 뒤에있는게 보임*/}
        {/* 근데, 보여주는게 좋을 수도 있음 */}
        {isLoggedIn && (
          <li>
            <Link to="/posts/create">게시글 생성</Link>
          </li>
        )}
      </ul>
    </header>
  );
}
