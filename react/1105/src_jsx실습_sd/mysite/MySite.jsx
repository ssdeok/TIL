import React from "react";
import MySiteHeader from "./MySiteHeader";
import MySiteNav from "./MySiteNav";

export default function MySite() {
  return (
    <>
      <MySiteHeader></MySiteHeader>
      <MySiteNav></MySiteNav>
      <div>
        <main>
          <article></article>
          <article></article>
        </main>
        <sidebar></sidebar>
      </div>
      <footer></footer>
    </>
  );
}
