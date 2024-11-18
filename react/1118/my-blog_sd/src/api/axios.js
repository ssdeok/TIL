import axios from "axios";

const instance = axios.create({
  baseURL: "http://localhost:3000/posts",
  // .env를 활용해서 위랑 똑같은 연결가능. 깃허브에 올라가지않아서 보안성
  // baseURL: import.meta.env.VITE_API_URL + "/posts",
});

// axios.get("http://localhost:3000/posts");
// axios.get(`http://localhost:3000/posts/${postId}`);
// 위의 코드를 아래처럼 사용할 수 있다.
// instance.get("");
// instance.get(`/${postId}`);

// 익스포트를 디폴트로 했기때문에 import 할때 이름이 상관없음
export default instance;
