import React from 'react';
import { mark, markColor } from '../../utils/staticImagePath';

export default function PoolListItem({ onClick, name, address, isMarked, onToggleMark }) {
  return (
    <>
      <article className="bg-blue02/10 w-[100%] h-27 rounded-xl cursor-pointer" onClick={onClick}>
        <div className="flex items-center justify-between mx-4 h-[100%]">
          <div>
            <h2 className="pretendard-semibold text-xl">{name}</h2>
            <p className="pretendard-normal text-sm text-body01 mt-1">{address}</p>
          </div>

          <img
            src={isMarked ? markColor : mark}
            alt=""
            className={`aspect-square h-7 cursor-pointer hover:contrast-160 ${isMarked && 'animate-scale-in-out'}`}
            onClick={(e) => {
              e.stopPropagation();
              onToggleMark();
            }}
          />
        </div>
      </article>
    </>
  );
}
