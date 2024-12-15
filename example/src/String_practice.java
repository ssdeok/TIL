import java.util.Arrays;

public class String_practice {
    public static void main(String[] args) {

        String name = "jun";
        System.out.println("name =" + name);
        int age = 17;
        System.out.println("age = " + age);
        System.out.println("안녕, 나는 jun이고, 17살이야");
        System.out.printf("안녕, 나는 %s이고, %d살이야 \n", name, age);

        // 포맷을 하면서 프린트
        System.out.println("안녕, 나는 " + name + "이고 " + age +"살이야");

        // 포맷을 한 후 프린트
        String formattedString = String.format("안녕, 나는 %s이고, %d살이야 \n", name, age);
        System.out.println(formattedString);



    }
}
