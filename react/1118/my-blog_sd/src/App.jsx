import React from "react";
import { RouterProvider } from "react-router-dom";
import router from "./router";

import { Provider } from "react-redux";
import store from "./store/store";

export default function App() {
  // .env에 만든것을 import. 상수라서 대문자.
  const value = import.meta.env.VITE_SECRET_VALUE;
  console.log(value);
  return (
    <>
      <Provider store={store}>
        <RouterProvider router={router}></RouterProvider>
      </Provider>
    </>
  );
}
