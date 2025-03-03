import api from "./axios";
// 1118 생성

const postApi = {
  // 1. 리스트 GET
  getPosts: async () => {
    const response = await api.get("");
    return response.data;
  },
  // 2. 개별 GET
  getPostById: async (postId) => {
    const response = await api.get(`/${postId}`);
    return response.data;
  },
  // 3. POST
  createPost: async (formData) => {
    const response = await api.post("", formData);
    return response.data;
  },
};

//postList에 import
export default postApi;
