public class Problem22 {

    // Class 생성 후 2번째줄부터 아래 코드 복사 + 붙여넣기
    // 클래스 이름은 유지

    public static void main(String[] args) {
        // 함수 실행
         Solution.solution(10000);
    }

// ////////////////////////////////////////////////////////////////////////////////////
    // 이 부분에 daily algo의 템플릿 복사
    //    public (타입) solution 을
    //    public static (타입) solution 으로 변경
class Solution {
    public static int solution(long number) {
        int answer = 0;
        // number를 10으로 나눈다
        // 나눈 값을 다시 10으로 나눈다
        // 나눈 값을 다시 10으로 나눈다
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count += 1;
        }
        System.out.println(count);
        return count;
    }
}
// ////////////////////////////////////////////////////////////////////////////////////
}
