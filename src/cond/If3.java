package cond;

public class If3 {

    public static void main(String[] args) {
        int age = 10;

        if (age >= 20){
            System.out.println("성인");
        }
        if (age <=19 && age >=17) {
            System.out.println("고등학생");
        }
        if (age <=16 && age >=14) {
            System.out.println("중학생");
        }
        if (age <=13 && age >=8) {
            System.out.println("초등학생");
        }
        if (age <=7) {
            System.out.println("미취학");
        }

    }
}
