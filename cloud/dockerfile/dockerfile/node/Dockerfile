# 베이스이미지 지정
FROM node:lts
WORKDIR /app
COPY ./package.json ./
RUN npm install

# [호스트] 파일 또는 폴더를 [컨테이너]로 복사
# [호스트 파일] [컨테이너 경로로]
# COPY ./app.js /app.js

# 컨테이너로만 사용하는 명령어. 이건 이미지 아님
# CMD ["node", "app.js"]

