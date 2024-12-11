public class Problem39 {

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
    public boolean solution(String word) {

        StringBuilder sb = new StringBuilder(word);
        String reversedWord = sb.reverse().toString();
        return word.equals(reversedWord);


    }

    public boolean solution2(String word) {
        int left = 0;
        int right = word.length() - 1;
        boolean isPal = true;
//        word를 반복을 돌 예정이야.
//        왼쪽이랑 오른쪽이랑 같이 비교를 하면서 돌꺼야.
//
//        left랑 right랑 비교를 할꺼에요.
//            달라? 그럼 false임
//            같아? 그럼 다음꺼 보자.
//                left는 1 오른쪽
//                right는 1 왼쪽
        while (left < right){
            if (word.charAt(left) != word.charAt(right)){
                isPal = false;
                break;
            }
            left++;
            right--;
        }
//        for (int left = 0; left < word.length()/2; left++) {
//            int right = word.length() - 1 - left;
//        }

        return isPal;
    }
}
// ////////////////////////////////////////////////////////////////////////////////////
    }
