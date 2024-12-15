public class Problem40_sd {

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
    public int solution(String word, String target) {

        int answer = 0;

        for (int i = 0; i <= word.length() - target.length(); i++) {
            String subWord = word.substring(i, i + target.length());
            if (subWord.equals(target)) {
                answer++;
            }
        }
        return answer;
//        word.substring(0, target.length());
//        word.substring(1, target.length() + 1);
//        word.substring(0, target.length());
//        word.substring(0, word.length() - target.length());



        /// //////////////////////////////////////////////////////////////////////////////////
//        int answer1 = 0;
//        for (int i = 0; i <= word.length() - target.length(); i++) {
//            boolean isSame = true;
//
//            for (int j = 0; j < target.length(); j++) {
//                if (word.charAt(i + j) != target.charAt(j)) {
//                    isSame = false;
//                    break;
//                }
//            }
//            if(isSame) {
//                answer1++;
//            }
//        }
//        return answer1;
    }
}

// ////////////////////////////////////////////////////////////////////////////////////
}
