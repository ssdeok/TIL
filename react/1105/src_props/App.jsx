import Profile from "./Profile";
import Article from "./Article";
function App() {
  return (
    <>
      <Profile
        person={{
          name: "Lin Lanying",
          imgUrl: "https://i.imgur.com/YfeOqp2.jpg",
        }}
        size={100}
      ></Profile>
      <div>
        <Article title={"제목1"} content={"내용1"}></Article>
        <Article title={"제목2"} content={"내용2"}></Article>
        <Article title={"제목3"} content={"내용3"}></Article>
      </div>
    </>
  );
}

export default App;
