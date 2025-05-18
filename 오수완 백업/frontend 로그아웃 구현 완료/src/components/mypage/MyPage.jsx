import React from 'react';

export default function MyPage() {
  const handleLogout = async () => {
    const accessToken = localStorage.getItem('accessToken'); // ✅ 토큰 가져오기
    try {
      const response = await fetch(`${import.meta.env.VITE_DOMAIN}/logout`, {
        method: 'POST',
        headers: {
          Authorization: `Bearer ${localStorage.getItem('accessToken')}`,
          'Content-Type': 'application/json',
        },
        credentials: 'include', // 쿠키 포함 (Refresh Token 사용 시 필요)
      });

      // ✅ 401이라면 이미 로그아웃된 상태이므로 정상 처리
      if (response.status === 401) {
        console.warn('⚠️ 이미 로그아웃된 상태! 강제 로그아웃 진행');
      } else if (!response.ok) {
        throw new Error('로그아웃 실패');
      }

      console.log('✅ 로그아웃 성공! 이제 액세스 토큰을 삭제합니다.');

      // ✅ 1. 액세스 토큰 삭제
      localStorage.removeItem('accessToken');
      console.log(
        '🗑️ 액세스 토큰 삭제 완료! 현재 localStorage:',
        localStorage.getItem('accessToken'),
      );

      const responseBody = await response.json();
      console.log('로그아웃 API 응답:', responseBody);

      // ✅ 2. 리다이렉트
      window.location.href = '/';
    } catch (error) {
      console.error('🚨 로그아웃 중 오류 발생:', error);
    }
  };

  return (
    <div className="flex flex-col items-center justify-center h-screen">
      <h1 className="text-2xl font-bold mb-4">MyPage</h1>
      <button
        onClick={handleLogout}
        className="px-4 py-2 bg-red-500 text-white rounded-md hover:bg-red-600 transition"
      >
        로그아웃
      </button>
    </div>
  );
}
