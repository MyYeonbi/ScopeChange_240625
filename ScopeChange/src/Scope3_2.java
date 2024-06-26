public class Scope3_2 {
    public static void main(String[] args) {
        //스코프 존재 이유는?
        int m = 10;

        if (m > 0){
            int temp = m * 2;
            System.out.println("temp = " + temp);
        };
        System.out.println("m = " + m);
    }
}//temp는 if안에서만 사는데 밖에서 선언하면 비효율적.
//왜?? 불필요한 메모리가 낭비될 수 있음.
//코드 복잡성이 증가될 수 있음. 좋은 코드는 단순한것.
