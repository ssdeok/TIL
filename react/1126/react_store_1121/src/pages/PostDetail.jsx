import React, { useEffect, useState } from "react";
import { useSelector } from "react-redux";
import { useLocation, useParams } from "react-router-dom";

export default function PostDetail() {
  const { postId } = useParams();

  const posts = useSelector((state) => state.posts);
  // console.log(posts);
  // const location = useLocation();

  // const { post } = location.state;
  // const { title, content } = post;

  // post는 변수 할당이고, setPost는 변수의 값의 변화를 나타냄
  const [post, setPost] = useState({});

  // 유즈이펙트는 무조건 1번 실행, 의존성배열인 []이걸 줘서 1번만 실행
  useEffect(() => {
    // setPost로 각각의 id의 값을 할당한다
    setPost(posts.find((post) => post.id === parseInt(postId)));
  }, []);

  return (
    <div>
      detail
      {/* 화면에 출력하는 부분 */}
      {/* 위의 useState가 비어있으면 오류가 나는데 ?를 쓰면 오류가 나진않고,
      빈 상태로 출력. ?를 안쓰고 위에 useState에 빈배열을 넣으면 똑같음
      결국은 둘다 넣어주는게 좋음 */}
      <h3>{post?.title}</h3>
      <p>{post?.content}</p>
    </div>
  );
}
