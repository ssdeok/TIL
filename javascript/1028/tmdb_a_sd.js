async function getNowPlayingMovies() {
  try {
    const baseURL = 'https://api.themoviedb.org/3/movie';
    const path = '/now_playing';
    const params = new URLSearchParams({
      api_key: 'eab8c9893e725b2e167187cef66bae3d',
      language: 'ko',
    });

    const URL = `${baseURL}${path}?${params}`;

    const response = await fetch(URL);
    const data = await response.json();

    const movies = data.results;

    // 평점이 가장 높은 영화를 찾기 위해
    // maxVoteAverage이라는 최고 평점 변수를 0으로 잡아놓고
    let maxVoteAverage = 0;
    // maxVoteMovie는 아직 모르니까 null로 잡는다.
    let maxVoteMovie = null;

    // movies의 데이터를 나열한다
    for (let movie of movies) {
      // voteAverage는 데이터들의 평점이다
      let voteAverage = movie.vote_average;

      // 데이터 평점이 0보다 크면
      if (voteAverage > maxVoteAverage) {
        // 최고평점이 그 데이터평점이 된다
        maxVoteAverage = voteAverage;
        // 최고평점영화는 그 데이터가 된다.
        maxVoteMovie = movie;
      }
    }
    // 최고평점이 출력된다
    console.log(maxVoteAverage);
    // 최고평점 영화가 출력된다
    console.log(maxVoteMovie.title);

    // ///////////////////////////////

    // 영화데이터를 reduce하고 maxVoteMovie2에 저장
    const maxVoteMovie2 = movies.reduce((acc, cur) => {
      // accVoteAverage는 평점의 누적값
      const accVoteAverage = acc.vote_average;
      // curVoteAverage는 평점의 배열
      const curVoteAverage = cur.vote_average;

      // 누적값이 배열보다 크면
      if (accVoteAverage > curVoteAverage) {
        // 누적값이 리턴
        return acc;
        // 배열값이 누적값보다 크면
      } else if (accVoteAverage < curVoteAverage) {
        // 배열값을 리턴
        return cur;
        // 그게 아니면 ???
      } else {
        // 같을 때
        const accVoteAverage = acc.vote_count;
        const curVoteAverage = cur.vote_count;
        // 생략
      }
    });
    console.log(maxVoteMovie2.title);
    // ////////////////////////
  } catch (error) {
    console.error('Error:', error);
  }
}

getNowPlayingMovies();
