import { useSelector } from 'react-redux';
// 리덕스에 엑세스 토큰 확인용 코드
const CheckToken = () => {
  // 리덕스에서 액세스 토큰을 가져옵니다.
  const accessToken = useSelector((state) => state.auth.accessToken);

  // 액세스 토큰이 존재하는지 확인
  if (accessToken) {
    console.log('리덕스에 저장된 액세스 토큰:', accessToken);
  } else {
    console.log('리덕스에 액세스 토큰이 없습니다.');
  }

  return (
    <div>{accessToken ? '액세스 토큰이 리덕스에 저장되었습니다.' : '액세스 토큰이 없습니다.'}</div>
  );
};

export default CheckToken;
