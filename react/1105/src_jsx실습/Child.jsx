import React from "react";
import styles from "./assets/styles/Child.module.css";
export default function Child() {
  const name = "haha";
  // return <div className={styles.container}>Child {name}</div>;
  return <div className="box">Child {name}</div>;
}
