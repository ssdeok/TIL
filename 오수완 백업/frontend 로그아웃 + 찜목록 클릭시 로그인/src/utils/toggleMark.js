import { markPoolApi } from '../api/markPoolApi';
import { useNavigate } from 'react-router'; // 로그인 페이지 이동을 위해 추가
import { useSelector } from 'react-redux'; // 로그인 여부 확인

export const toggleMark = async (index, pools, setPools, navigate, token) => {
  if (!token) {
    // 로그인 안 했을 경우 로그인 페이지로 이동할지 확인
    const confirmLogin = window.confirm('로그인이 필요합니다. 로그인하시겠습니까?');
    if (confirmLogin) {
      navigate('/login'); // 로그인 페이지로 이동
    }
    return; // 함수 종료
  }

  const isMarked = pools[index].mark;

  setPools((prev) => {
    const updatedPools = [...prev];
    updatedPools[index] = {
      ...updatedPools[index],
      mark: !isMarked,
    };

    return updatedPools;
  });

  try {
    if (isMarked) {
      await markPoolApi.deleteMyMarkedPools(pools[index].id);
    } else {
      await markPoolApi.createMarkedPools(pools[index].id);
    }
  } catch (error) {
    console.log(error);
  }
};
