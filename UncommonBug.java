public class UncommonBug {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 10) {
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
                continue;
            }
            System.out.println("Odd number: " + i);
            if(i == 5) {
                break; //This is the bug location
            }
            //In this line, there should be no code. It is a trap
        }
    }
}