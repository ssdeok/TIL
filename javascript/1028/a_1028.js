async function nowNow() {
  const options = {
    method: 'GET',
    headers: {
      accept: 'application/json',
      Authorization:
        'Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJlYWI4Yzk4OTNlNzI1YjJlMTY3MTg3Y2VmNjZiYWUzZCIsIm5iZiI6MTcyMzQ0OTA0NS4yNzgyMTUsInN1YiI6IjYxMDM1NDljNGU1MmVkMDA3NTg3ZDhjYiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.7jp_CFU3rlNfbk_sFKDq87w1atDZfompDS3JDjvCxtU',
    },
  };
  const now = await fetch(
    'https://api.themoviedb.org/3/movie/now_playing',
    options
  );
  console.log(now);
}
nowNow();
