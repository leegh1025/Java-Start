package casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        intValue = (int)doubleValue;//컴파일 오류 발생
        System.out.println(intValue);

        System.out.println(10.5);
    }
}
