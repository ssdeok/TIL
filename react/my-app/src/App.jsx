import React from "react";
import Profile from "../Profile";
import Avatar from "./Avatar";

export default function App() {
  return (
    <Profile>
      <Card>
        <Avatar
          size={100}
          person={{
            name: "Katsuko Saruhashi",
            imageId: "YfeOqp2",
          }}
        />
      </Card>
    </Profile>
  );
}
