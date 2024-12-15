public class Problem57 {

    // Class 생성 후 2번째줄부터 아래 코드 복사 + 붙여넣기
    // 클래스 이름은 유지

    public static void main(String_practice[] args) {
        // 함수 실행
        //   Solution.solution();
    }

// ////////////////////////////////////////////////////////////////////////////////////
    // 이 부분에 daily algo의 템플릿 복사
    //    public (타입) solution 을
    //    public static (타입) solution 으로 변경
class Solution {
    public int[] solution(int[] numbers, int n) {
//        int[] answer = new int[numbers.length * n ];

//        int index = 0;
//        for (int i = 0; i < n; i++) {
//
//            for (int number : numbers) {
//                answer[index] = number;
//                index++;
//            }

            int[] answer2 = new int[numbers.length * n];

            for (int j = 0; j < n; j++) {
                for (int i = 0; i < numbers.length; i++) {
                    answer2[numbers.length * j + i] = numbers[i];
            }

            }
            // 여러개있던걸 위에 반복문으로 한것
//            for (int j = 0; j < numbers.length; j++) {
//                answer2[3 * 1+ j] = numbers[j];
//            }
//            for (int j = 0; j < numbers.length; j++) {
//                answer2[3 * 2+ j] = numbers[j];
//            }

            System.out.println(answer2);

        return answer2;
        }

    }
}
// ////////////////////////////////////////////////////////////////////////////////////
