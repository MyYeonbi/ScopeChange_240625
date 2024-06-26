public class Casting {
    //형변환 : 작은 범위에서 큰 범위로는 당연히 값을 넣을 수 ㅣㅇㅆ따.
    //        큰 범위에서 작은 범위는 다음과 같은 문제가 발생할 수 있다.
    //        소수점 버림, 오버플로우
    // "작은 범위에서 큰 범위로 대입은 허용한다. "
    // int < long < double
    public static void main(String[] args) {
        int intValue = 10;
        long longValue ;
        double doubleValue ;
        longValue = intValue;  //int -> long
        doubleValue = intValue; //int -> double
        System.out.println("longValue = " + longValue);
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 200000000000000L; //long -> double
        System.out.println("doubleValue2= " + doubleValue);
    }

}