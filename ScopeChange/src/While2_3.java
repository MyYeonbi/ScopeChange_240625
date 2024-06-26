public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        //i=4, endNum=3;
        while(i <= endNum) {
            sum = sum +i;
            System.out.println("i = " + i + " sum = " +sum);
            i++;
        }
    }
}
//변수는 꼭 필요한 범위로 한정해서 사용하는 것이 좋다.
//적절한 제약이 있는 프로그램이 좋다.