import React from 'react';
import RedButton from './RedButton';

export default function ColorButton({
  color = 'white',
  backgroundColor,
  children,
  onButtonClick,
}) {
  return (
    <button onClick={onButtonClick} style={{ color, backgroundColor }}>
      {children}
    </button>
  );
}
