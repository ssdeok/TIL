// CheckToken.jsx
import { useSelector } from 'react-redux';

const CheckToken = () => {
  // 리덕스에서 액세스 토큰을 가져옵니다.
  const token = useSelector((state) => state.auth.token);

  // 액세스 토큰이 존재하는지 확인
  if (token) {
    console.log('리덕스에 저장된 액세스 토큰:', token);
  } else {
    console.log('리덕스에 액세스 토큰이 없습니다.');
  }

  return <div>{token ? '액세스 토큰이 리덕스에 저장되었습니다.' : '액세스 토큰이 없습니다.'}</div>;
};

export default CheckToken;
