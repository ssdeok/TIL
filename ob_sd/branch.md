하나의 프로젝트에 대한 개별 작업 공간

현재 가지고 있는 branch 확인
+ git branch
새로운 branch 생성
+ git branch {브랜치 이름}
다른 branch로 이동
+ git switch branch
모든 브랜치의 로그를 그림으로 확인하고 싶을 떼
+ git log --oneline --graph --all
브랜치를 합치고 싶을 때
+ 주체가 되는 branch에서
+ git merge {합칠 브랜치}
+ vim 에디터
	+ git 설치를 할 때 변경 가능
	+ :wq
		+ 저장 후 종료
브랜치 삭제
+ git branch -d {삭제할 브랜치}