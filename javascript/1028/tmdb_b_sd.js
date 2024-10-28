async function getNowPlayingMovies() {
  try {
    const baseURL = 'https://api.themoviedb.org/3/movie';
    const path = '/now_playing';
    const params = new URLSearchParams({
      api_key: 'eab8c9893e725b2e167187cef66bae3d',
      language: 'ko',
    });
    // url에 위의 정보를 대입한다.(now_playing을 불러온다)
    let URL = `${baseURL}${path}?${params}`;

    // 패치를 해서 response를 만든다
    const response = await fetch(URL);
    // response를 json화 해서 data에 저장한다.
    const data = await response.json();

    // data에 있는 결과물들을 movies에 저장한다.
    const movies = data.results;

    // movies를 reduce해서 maxVoteMovie에 저장한다.
    const maxVoteMovie = movies.reduce((acc, cur) => {
      // accVoteAverage는 누적값의 평점
      const accVoteAverage = acc.vote_average;
      // curVoteAverage는 평점들의 배열
      const curVoteAverage = cur.vote_average;

      // 누적평점이 배열보다 크면
      if (accVoteAverage > curVoteAverage) {
        // 누적평점을 리턴한다
        return acc;
        // 배열이 더 크면
      } else if (accVoteAverage < curVoteAverage) {
        // 배열을 리턴한다
        return cur;
      }
    });

    // 평점이 제일높은 값을 구한 maxVoteMovie의 id를 movieId로 저장
    const movieId = maxVoteMovie.id;
    // movieId를 출력한다
    console.log(movieId);
    // URL에 평점이 제일 높은 영화를 저장한다
    URL = `${baseURL}${movieId}?${params}`;

    // 제일 높은 평점의 영화의 URL을 패치한다
    const response2 = await fetch(URL);
    // 그 URL을 json화 한다
    const data2 = await response2.json();
    // json화 한 영화를 출력한다
    console.log(data2);
    // 그 영화의 revenue를 저장한다
    const revenue = data2.revenue;
    // revenue를 출력한다.
    console.log(revenue);
    // ////////////////////////
  } catch (error) {
    console.error('Error:', error);
  }
}

getNowPlayingMovies();
