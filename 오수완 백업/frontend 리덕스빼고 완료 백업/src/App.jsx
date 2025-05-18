import React from 'react';
import { RouterProvider } from 'react-router-dom';
import router from './router/index.jsx';
import { Provider } from 'react-redux';
import store from './store/store.js';
import CheckToken from './pages/CheckToken';

function App() {
  return (
    <Provider store={store}>
      <div className="main-container">
        <RouterProvider router={router}></RouterProvider>
        <CheckToken />
      </div>
    </Provider>
  );
}

export default App;
