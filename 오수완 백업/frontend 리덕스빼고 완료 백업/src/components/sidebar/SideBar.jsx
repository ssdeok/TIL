import React, { useState } from 'react';
import { useDispatch } from 'react-redux';
import { logout } from '../../store/slices/authSlice';

import {
  mypage,
  markPool,
  mypageColor,
  markPoolColor,
  home,
  logo,
} from '../../utils/staticImagePath';
import SideBarItem from './SideBarItem';
import { useNavigate } from 'react-router';
import { initCenterHandler, map } from '../kakaomap/KakaoMapService';

export default function SideBar() {
  const [selectedIndex, setSelectedIndex] = useState();
  const [logoutSuccess, setLogoutSuccess] = useState(false);
  const navigate = useNavigate();
  const dispatch = useDispatch();

  const sideBarItems = [
    {
      image: mypage,
      selectedImage: mypageColor,
      title: '마이페이지',
    },
    {
      image: markPool,
      selectedImage: markPoolColor,
      title: '내가 찜한 수영장',
    },
  ];

  const handleClickItem = (index) => {
    setSelectedIndex(index);
    if (index === 0) {
      navigate('/mypage');
    } else {
      navigate('/mark-pools');
    }
  };

  const handleToMain = () => {
    navigate('/');
    setSelectedIndex(null);
    initCenterHandler(map);
  };

  ////////////////////////
  const handleLogout = async () => {
    console.log('로그아웃 버튼 클릭됨'); // ✅ 추가
    try {
      const response = await fetch('http://localhost:8080/logout', {
        method: 'POST',
        credentials: 'include', // 쿠키 포함
        headers: {
          'Content-Type': 'application/json',
          Authorization: `Bearer ${localStorage.getItem('accessToken')}`, // JWT 토큰 전달
        },
      });

      console.log('서버 응답:', response.status); // ✅ 추가

      if (!response.ok) {
        throw new Error('서버에서 로그아웃 실패');
      }

      // 로컬 스토리지/쿠키에서 토큰 삭제
      localStorage.removeItem('accessToken');
      document.cookie = 'refreshToken=; expires=Thu, 01 Jan 1970 00:00:00 UTC; path=/;';

      // 서버에서 "로그아웃 성공" 응답을 받으면 상태 업데이트
      const message = await response.text();
      console.log('서버에서 받은 메시지:', message); // 서버 응답 메시지 확인

      // Redux 상태 초기화
      dispatch(logout());

      console.log('로그아웃 처리 완료');
      // 로그인 페이지로 리다이렉트
      window.location.href = '/';
    } catch (error) {
      console.error('로그아웃 실패:', error);
    }
  };
  ////////////////////////

  return (
    <>
      <div className="border-gray03 border-[0.5px] w-30 flex flex-col items-center h-full">
        <img
          src={logo}
          alt=""
          className="w-2/3 mt-5 cursor-pointer select-none"
          draggable={false}
          onClick={handleToMain}
        />
        <div className="h-[0.5px] w-full bg-gray03 mt-[20px]"></div>

        {sideBarItems.map((item, index) => {
          return (
            <SideBarItem
              key={index}
              image={item.image}
              selectedImage={item.selectedImage}
              title="마이페이지"
              isSelected={selectedIndex === index}
              onClick={() => handleClickItem(index)}
            ></SideBarItem>
          );
        })}

        <img
          src={home}
          alt=""
          className="h-12 aspect-square absolute bottom-10 cursor-pointer select-none"
          draggable={false}
          onClick={handleToMain}
        />
        {/*  */}
        <button
          onClick={handleLogout}
          className="absolute bottom-50 bg-red-500 text-white px-4 py-2 rounded-md text-sm hover:bg-red-600 transition"
        >
          로그아웃
        </button>
        {logoutSuccess && <p>로그아웃이 성공적으로 완료되었습니다!</p>}
        {/*  */}
      </div>
    </>
  );
}
