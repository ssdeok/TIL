import React, { useEffect, useState } from 'react';
import { useNavigate, useParams } from 'react-router-dom';
import postApi from '../api/postsApi';
import CommentForm from '../components/CommentForm';

export default function PostDetail() {
  const [post, setPost] = useState({});
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState('');

  const { postId } = useParams();

  useEffect(() => {
    async function fetchPost() {
      try {
        const response = await postApi.getPostById(postId);
        setPost(response.data.data);
      } catch (err) {
        setError(err.message);
        console.error(err.response);
      } finally {
        setLoading(false);
      }
    }
    fetchPost();
  }, []);

  if (loading) return <div>로딩중...</div>;

  if (error.status == 404) {
    return <h3>존재하지 않는 게시글입니다.</h3>;
  }
  return (
    <div>
      <h3>{post?.title}</h3>
      <p>{post?.content}</p>
      <hr />
      {/* <CommentForm></CommentForm> */}
      <CommentForm setPost={setPost} postId={postId}></CommentForm>
      <div>
        tags :
        {post?.tags?.map((tag) => {
          return <span key={tag}>#{tag} </span>;
        })}
      </div>
      <hr />

      {post?.comments?.length ? (
        <ol>
          {post?.comments?.map((comment) => {
            return <li key={`comment-${comment.id}`}>{comment.content}</li>;
          })}
        </ol>
      ) : (
        <div>댓글이 없습니다.</div>
      )}
    </div>
  );
}

// import React, { useEffect, useState } from 'react';
// import { useNavigate, useParams } from 'react-router-dom';
// import postApi from '../api/postsApi';

// export default function PostDetail() {
//   const [post, setPost] = useState({});
//   const [loading, setLoading] = useState(true);
//   const [error, setError] = useState('');

//   const { postId } = useParams();

//   useEffect(() => {
//     async function fetchPost() {
//       // 게시글 조회 로직
//       const response = await postApi.getPostById(postId);
//       const data = response.data;
//       console.log(data);
//       setPost(data.data);
//     }
//     fetchPost();
//   }, []);

//   // if (loading) return <div>로딩중...</div>;

//   return <div>Post Detail
//     <div>{post.title}</div>
//     <div>{post.content}</div>
//   </div>;
// }
