public class Problem32 {

    // Class 생성 후 2번째줄부터 아래 코드 복사 + 붙여넣기
    // 클래스 이름은 유지

    public static void main(String[] args) {
        // 함수 실행
        //   Solution.solution();
    }

// ////////////////////////////////////////////////////////////////////////////////////
    // 이 부분에 daily algo의 템플릿 복사
    //    public (타입) solution 을
    //    public static (타입) solution 으로 변경
class Solution {
    public int solution(String word, String c) {
       // 문자열 word가 주어질때,
        // 문자열에서 특정 문자열 c의 개수를 구하는 함수

        char target = c.charAt(0);
        int count = 0;

        char[] charArray = word.toCharArray();

        for (char charItem : charArray) {
            if (charItem == target) {
                count++;
            }
        }

        return count;
    }
}
// ////////////////////////////////////////////////////////////////////////////////////
}
