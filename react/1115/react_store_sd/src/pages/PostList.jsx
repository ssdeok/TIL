import React, { useEffect, useState } from "react";
// import { useSelector } from "react-redux";
import { Link, useNavigate } from "react-router-dom";
import axios from "axios";

export default function PostList() {
  const navigate = useNavigate();

  //posts를 쓰는 것은 return으로 보여주기 위해
  const [posts, setPosts] = useState([]);

  useEffect(() => {
    // const posts = useSelector((state) => state.posts);
    async function fetchPosts() {
      const url = "http://localhost:3000/posts/";
      const response = await axios.get(url);
      // const response = await axios({url: url});

      const data = response.data;
      setPosts(data);
    }
    fetchPosts();
  }, []);

  return (
    <div>
      <h2>posts</h2>
      <ul>
        {posts.map((post) => {
          const { id, title, content } = post;
          return (
            <li key={id}>
              <Link to={`/posts/${id}`} state={{ post }}>
                <h3>{title}</h3>
              </Link>
              <h3
                onClick={() => {
                  // 이동을 하고 싶다
                  navigate(`/posts/${id}`);
                }}
              >
                {title}
              </h3>
            </li>
          );
        })}
      </ul>
    </div>
  );
}
