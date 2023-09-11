public class Multiples {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0){
                sum++;
            }
            else if (i % 5 == 0){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
