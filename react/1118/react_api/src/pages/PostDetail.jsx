import axios from "axios";
import React, { useEffect, useState } from "react";
import { useSelector } from "react-redux";
import { useLocation, useNavigate, useParams } from "react-router-dom";
import postApi from "../api/postsApi";

export default function PostDetail() {
  const navigate = useNavigate();

  const { postId } = useParams();
  const [post, setPost] = useState();
  const [loading, setLoading] = useState(true);


  useEffect(() => {
    // const url = `http://localhost:3000/posts/${postId}`;
    async function fetchPost() {
      try {
        // const response = await axios.get(url);
        // const data = response.data;
        const data = await postApi.getPostById(postId)
        setPost(data);
      } catch (err) {
        // navigate("/posts");
        // TODO: 나중에 고칠 것
        navigate("/not-found", { replace: true });
      } finally {
        setLoading(false);
      }
    }
    fetchPost();
  }, []);

  if (loading) return <div>로딩중...</div>;

  return (
    <div>
      detail
      <h3>{post?.title}</h3>
      <p>{post?.content}</p>
    </div>
  );
}
