// a번 : 전국, 서울, 부산, 대구, 인천, 광주, 대전, 울산, 경기, 강원, 충북, 충남, 전북, 전남, 경북, 경남, 제주, 세종

// b번

async function mircro() {
  const URL =
    'https://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty?serviceKey=zXAnlcLfBM8J037KAsOrdgcXN80AB%2FK9ceEb4JBLhH5paDFpN03PxN09ZwukF3l%2Fa%2BJpNmYkGocCPneDKA%2BhJw%3D%3D&returnType=json&numOfRows=100&pageNo=1&sidoName=%EC%84%9C%EC%9A%B8&ver=1.0';
  const response = await fetch(URL);
  let data = await response.json();

  data = data.response.body.items;
  // console.log(data);

  data = filterNetworkError(data);

  let minPm25Value = Infinity;
  let minPm25StationName = '';

  for (let datum of data) {
    const pm25Value = datum.pm25Value;

    if (pm25Value < minPm25Value) {
      minPm25Value = pm25Value;
      minPm25StationName = datum.stationName;
    }
  }
  console.log(minPm25Value);
  console.log(minPm25StationName);
}
mircro();
