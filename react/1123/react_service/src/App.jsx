import React from "react";
import { RouterProvider } from "react-router-dom";
import router from "./router";
import Hello from "./pages/Hello";
export default function App() {
  return (
    <>
      <RouterProvider router={router}></RouterProvider>
    </>
  );
}
