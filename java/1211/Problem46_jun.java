public class Problem46 {

        // Class 생성 후 2번째줄부터 아래 코드 복사 + 붙여넣기
        // 클래스 이름은 유지

        public static void main(String[] args) {
            // 함수 실행
//            System.out.println(Solution.solution());

        }

// ////////////////////////////////////////////////////////////////////////////////////
        // 이 부분에 daily algo의 템플릿 복사
        //    public (타입) solution 을
        //    public static (타입) solution 으로 변경
class Solution {
    public int solution(int[] numbers) {
//        int minValue = Integer.MAX_VALUE;
        int minValue = numbers[0];

        for (int number : numbers) {
            if (number < minValue){
                minValue = number;
            }
        }
        return minValue;
    }
}
// ////////////////////////////////////////////////////////////////////////////////////
    }
