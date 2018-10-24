
public class Test {
    public static void main(String [] args) {
        long total = 600851475143L; //600851475143


        for (long i = 2; i <= total/2;) {
            if (total % i == 0) {
                total = total / i;
                System.out.println(i);
            }
            else {
                i++;
            }
        }
        System.out.println(total);
    }
}
