import { createBrowserRouter } from "react-router-dom";
import RootLayout from "../RootLayout";
import { Router } from "react-router-dom";
import WebToon from "../pages/WebToon";
import Novel from "../pages/Novel";
import WebtoonDetail from "../components/WebtoonDetail";
const router = createBrowserRouter([
  {
    path: "/",
    element: <RootLayout></RootLayout>,
    children: [
      {
        path: "/webtoon",
        element: <WebToon></WebToon>,
        children: [
          {
            path: "/webtoon/:day",
            element: <WebtoonDetail></WebtoonDetail>,
          },
        ],
      },
    ],
  },
  {
    path: "/novel",
    element: <Novel></Novel>,
  },
]);

export default router;
