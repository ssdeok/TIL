// import { isNull } from "lodash";
import React, { useEffect, useState } from "react";
import { useSelector } from "react-redux";
import { useLocation, useParams } from "react-router-dom";
import axios from "axios";

export default function PostDetail() {
  const { postId } = useParams();
  const [post, setPost] = useState();

  // const posts = useSelector((state) => state.posts);

  useEffect(() => {
    // setPost(posts.find((post) => post.id === parseInt(postId)));
    const url = `http://localhost:3000/posts/${postId}`;
    async function fetchPost() {
      const response = await axios.get(url);
      const data = response.data;
      setPost(data);
    }
    fetchPost();
  }, []);

  return (
    <div>
      detail
      <h3>{post?.title}</h3>
      <p>{post?.content}</p>
    </div>
  );
}
