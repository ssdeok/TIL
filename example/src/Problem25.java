public class Problem25 {

    // Class 생성 후 2번째줄부터 아래 코드 복사 + 붙여넣기
    // 클래스 이름은 유지

    public static void main(String[] args) {
        // 함수 실행
        Solution.solution(10);
    }

// ////////////////////////////////////////////////////////////////////////////////////
    // 이 부분에 daily algo의 템플릿 복사
    //    public (타입) solution 을
    //    public static (타입) solution 으로 변경
class Solution {
    public static int solution(int number) {
        int answer = 0;

        for (int num =1; num <= number; num++) {
            for (int i = 1; i <= num; i++) {
                if(num % i == 0) {
                    answer += i;
                }
             }
        }
        return answer;
    }
}
// ////////////////////////////////////////////////////////////////////////////////////
}
