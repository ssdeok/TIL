import React, { useState } from "react";
import Prac1Button from "./Prac1Button";
export default function Prac4() {
  // const [text, setText] = useState("좋아요");
  const [isLiked, setIsLiked] = useState(false);
  return (
    <div>
      <Prac1Button
        // style={{
        //   backgroundColor: isLiked ? "gray" : "red  ",
        // }}
        className={`${isLiked ? "gray" : "red"} ${
          isLiked ? "text-red" : "text-gray"
        }`}
        onNulum={() => {
          // 좋아요야? => text가 좋아요 취소로 변하게 해
          // 좋아요 취소야? => text가 좋아요로 변하게 해
          setIsLiked((prevIsLiked) => !prevIsLiked);
        }}
      >
        {isLiked ? "좋아요 취소" : "좋아요"}
      </Prac1Button>

      {/* <button
        // style={{
        //   backgroundColor: isLiked ? "gray" : "red  ",
        // }}
        className={`${isLiked ? "gray" : "red"} ${
          isLiked ? "text-red" : "text-gray"
        }`}
        onClick={() => {
          // 좋아요야? => text가 좋아요 취소로 변하게 해
          // 좋아요 취소야? => text가 좋아요로 변하게 해
          setIsLiked((prevIsLiked) => !prevIsLiked);
        }}
      >
        {isLiked ? "좋아요 취소" : "좋아요"}
      </button> */}
    </div>
  );
}
