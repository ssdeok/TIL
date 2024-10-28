async function getPopularMovies() {
  try {
    // now_playing에 대한 api주소 중 앞부분
    const baseURL = 'https://api.themoviedb.org/3/movie';
    // 엔드포인트
    const path = '/now_playing';
    // api키를 params라는 변수로 저장 (new 다음꺼???)
    const params = new URLSearchParams({
      api_key: 'eab8c9893e725b2e167187cef66bae3d',
      language: 'ko',
    });
    // const params = 'api_key=eab8c9893e725b2e167187cef66bae3d&language=ko';

    // 매번 다른 주소를 위한 템플릿 리터럴
    const URL = `${baseURL}${path}?${params}`;
    // const URL =
    // 'https://api.themoviedb.org/3/movie/popular?api_key=eab8c9893e725b2e167187cef66bae3d';

    // URL을 비동기처리하고 response에 저장
    const reponse = await fetch(URL);
    // 비동기처리한 response를 json화 하고 data에 저장
    const data = await reponse.json();

    // data의 결과들을 movies에 저장
    const movies = data.results;
    // movies의 첫번째 data를 movie에 저장
    const movie = movies[0];

    // 첫번째 data의 제목을 출력
    console.log(movie.title);
  } catch (error) {
    console.error('Error:', error);
  }
}
// 어싱크 함수로 출력
getPopularMovies();
