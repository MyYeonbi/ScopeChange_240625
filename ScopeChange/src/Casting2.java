public class Casting2 {
    //큰것을 작은것을 넣을때는 개발자가 형변환을 해야 한다.
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; 컴파일 오류 발생!!
        intValue = (int)doubleValue;
        System.out.println(intValue);

        System.out.println((int)10.5);
    }
}
