import React from "react";

export default function Force() {
  const imgUrls = [
    "https://images.dog.ceo/breeds/gaddi-indian/Gaddi.jpg",
    "https://images.dog.ceo/breeds/terrier-westhighland/n02098286_3154.jpg",
    "https://images.dog.ceo/breeds/malamute/n02110063_16752.jpg",
    "https://images.dog.ceo/breeds/bulldog-english/jager-2.jpg",
  ];

  const imgTag = imgUrls.map((el) => (
    <>
      <img
        src={el}
        style={{
          width: 300,
          height: 300,
        }}
      />
    </>
  ));
  return <>{imgTag}</>;
}
