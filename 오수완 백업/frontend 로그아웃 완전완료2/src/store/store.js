import { configureStore } from '@reduxjs/toolkit';
import authSlice from './slices/authSlice';
import listBarSlice from './slices/listBarSlice';
import userSlice from './slices/userSlice';
import detailViewSlice from './slices/detailViewSlice';
import kakaoMapSlice from './slices/kakaoMapSlice';
import sideBarSlice from './slices/sideBarSlice'


const store = configureStore({
  reducer: {
    auth: authSlice,
    listBar: listBarSlice,
    detailView: detailViewSlice,
    kakaoMap: kakaoMapSlice,
    user: userSlice,
    sideBar: sideBarSlice
  },
});

export default store;
