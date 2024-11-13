import { createBrowserRouter } from "react-router-dom";
import RootLayout from "../RootLayout";
import WebToon from "../pages/WebToon";
import Novel from "../pages/Novel";
import WebtoonDetail from "../components/WebtoonDetail";
import WebtoonMain from "../components/WebtoonMain";
import MainPage from "../components/MainPage";
import NovelDatil from "../components/NovelDatil";
const router = createBrowserRouter([
  {
    path: "/",
    element: <RootLayout></RootLayout>,
    children: [
      {
        index: true,
        element: <MainPage></MainPage>,
      },
      {
        path: "/webtoon",
        element: <WebToon></WebToon>,
        children: [
          { index: true, element: <WebtoonMain></WebtoonMain> },

          {
            path: "/webtoon/:day",
            element: <WebtoonDetail></WebtoonDetail>,
            // loader: () => {},
          },
        ],
      },
      {
        path: "/novel",
        element: <Novel></Novel>,
        children: [{ path: ":genre", element: <NovelDatil></NovelDatil> }],
      },
    ],
  },
]);

export default router;
