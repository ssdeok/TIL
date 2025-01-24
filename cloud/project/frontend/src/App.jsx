import { useEffect, useState } from "react";
import axios from "axios";

export default function App() {
  const [posts, setPosts] = useState([]);

  useEffect(() => {
    axios
      .post(`/api/articles`, {
        title: "제목",
        content: "내용",
      })
      .then((res) => {});

    axios.get(`/api/articles`).then((res) => {
      setPosts(res.data);
    });
  }, []);

  // 1. 이게 처음 시작된다, 빈 값
  return (
    <div>
      {posts.map((post) => {
        return (
          <div>
            <h3>{post.title}</h3>
            <p>{post.content}</p>
          </div>
        );
      })}
    </div>
  );
}
