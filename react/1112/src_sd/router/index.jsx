import { createBrowserRouter } from "react-router-dom";
// import Home from "../pages/Webtoon";
import WebList from "../pages/WebList";
import RootLayout from "../RootLayout";
// import Webtoon from "../pages/Webtoon";
// import Fiction from "../pages/Fiction";
import FicList from "../pages/FicList";
import WebMain from "../pages/WebMain";
import FicMain from "../pages/FicMain";

const router = createBrowserRouter([
  {
    path: "/",
    element: <RootLayout />,
    children: [
      {
        path: "/webs",
        element: <WebList />,
      },
      {
        path: "/fics",
        element: <FicList />,
      },
      {
        path: "/webmain",
        element: <WebMain />,
      },
      {
        path: "/ficmain",
        element: <FicMain />,
      },
    ],
  },
]);

export default router;
