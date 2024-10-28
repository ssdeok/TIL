// 시도 이름(전국, 서울, 부산, 대구, 인천, 광주, 대전, 울산, 경기, 강원, 충북, 충남, 전북, 전남, 경북, 경남, 제주, 세종)
async function microDusk() {
  try {
    const baseURL = 'http://apis.data.go.kr/';
    const path = 'B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty';
    const params = new URLSearchParams({
      serviceKey:
        'zXAnlcLfBM8J037KAsOrdgcXN80AB%2FK9ceEb4JBLhH5paDFpN03PxN09ZwukF3l%2Fa%2BJpNmYkGocCPneDKA%2BhJw%3D%3D',
      sidoName: '서울',
      returnType: 'json',
    });

    const URL = `${baseURL}${path}?${params}`;
    console.log(URL);

    const response = await fetch(
      'https://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty?serviceKey=zXAnlcLfBM8J037KAsOrdgcXN80AB%2FK9ceEb4JBLhH5paDFpN03PxN09ZwukF3l%2Fa%2BJpNmYkGocCPneDKA%2BhJw%3D%3D&returnType=json&numOfRows=100&pageNo=1&sidoName=%EC%84%9C%EC%9A%B8&ver=1.0'
    );
    const data = await response.json();

    // const movies = data.results;
    // console.log(data.response.body.items);
  } catch (error) {
    console.error('Error:', error);
  }
}

microDusk();
