
public class Problem54 {

        // Class 생성 후 2번째줄부터 아래 코드 복사 + 붙여넣기
        // 클래스 이름은 유지

        public static void main(String[] args) {
            // 함수 실행
//            System.out.println(((-123) % 4 + 4)%4);
//            System.out.println(Solution.solution();

        }

// ////////////////////////////////////////////////////////////////////////////////////
        // 이 부분에 daily algo의 템플릿 복사
        //    public (타입) solution 을
        //    public static (타입) solution 으로 변경
class Solution {
    public int[] solution(int[] numbers, int direction) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            int newIndex = (i + direction + numbers.length) % numbers.length;
            answer[newIndex] = element;


        }

        return answer;
    }
}
// ////////////////////////////////////////////////////////////////////////////////////
    }
