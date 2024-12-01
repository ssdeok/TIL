import { createSlice } from '@reduxjs/toolkit';
import { useState } from 'react';

// data에 해당하는게 initialState
// setData가 reducers
// const [data, setData] = useState();
const initialState = {
  isLoggedIn: false,
  // isAdmin : false,
  // user : {
  //   name: 'anonimoususer'
  // }
};
// const [value, setValue] = useState(기본값);
// data의 이름이 value
// 기본값 해당하는게 initialState
// setData가 reducers
const authSlice = createSlice({
  name: 'auth',
  initialState,
  reducers: {
    login: (state, action) => {
      state.isLoggedIn = true;
    },
    logout: (state, action) => {
      state.isLoggedIn = false;
    },
  },
});

// 로그인과 로그아웃을 어디서든 쓸 수 있다.
export const { login, logout } = authSlice.actions;
export default authSlice.reducer;

// 이걸 store에 등록해야함
