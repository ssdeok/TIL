import React, { useEffect, useState } from 'react';
import { useNavigate } from 'react-router';
import { useDispatch } from 'react-redux';

// 쿠키 가져오기 헬퍼 함수
const getCookie = (name) => {
  const value = `; ${document.cookie}`;
  const parts = value.split(`; ${name}=`);
  if (parts.length === 2) return parts.pop().split(';').shift();
  return null;
};

export default function NaverRedirect() {
  const navigate = useNavigate();
  const [error, setError] = useState(false);
  const [isLoading, setIsLoading] = useState(true);
  const dispatch = useDispatch();

  useEffect(() => {
    setIsLoading(true);
    try {
      // 현재 url에서 토큰 가져오기
      const urlParams = new URLSearchParams(window.location.search);
      const token = urlParams.get('token');
      const provider = urlParams.get('provider'); // provider 값 추가

      if (!token) {
        setError(true);
        navigate('/');
        return;
      }

      // provider에 따라 다른 로그인 액션 호출
      if (provider === 'naver') {
        dispatch(loginWithNaver(token));
      } else if (provider === 'kakao') {
        dispatch(loginWithKakao(token));
      } else {
        setError(true);
        navigate('/');
        return;
      }

      // 사용자 인증 상태를 콘솔에 기록 (디버깅용)
      console.log('인증 성공: 액세스 토큰 저장됨');
      console.log('로컬 스토리지 토큰:', localStorage.getItem('accessToken'));

      // 로그인 후 리프레시 토큰을 쿠키에서 확인
      const refreshToken = getCookie('refreshToken'); // 쿠키에서 리프레시 토큰 가져오기
      if (!refreshToken) {
        setError(true);
        navigate('/');
        return;
      }

      navigate('/mypage');
    } catch (error) {
      console.error('OAuth 처리 중 에러 발생:', error);
      setError(true);
      navigate('/');
    } finally {
      setIsLoading(false);
    }
  }, [navigate, dispatch]);

  return <div>로그인 중입니다.</div>;
}
// const getCookie = (name) => {
//   const value = `; ${document.cookie}`;
//   const parts = value.split(`; ${name}=`);
//   if (parts.length === 2) return parts.pop().split(';').shift();
//   return null;
// };

//     dispatch(login(token));
//     navigate('/mypage');
//   } catch (error) {
//     console.log('error 발생', error);
//     setError(true);
//     navigate('/'); // 토큰 없으면 home으로 이동
//   } finally {
//     setIsLoading(false);
//   }
// }, [navigate, dispatch]);

// 쿠키에서 값을 가져오는 함수
