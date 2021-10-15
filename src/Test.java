

public class Test {

    public static void main(String[] args) {

        String[][] chs = new String[5][2];
        chs[0] = new String[2];
        chs[1] = new String[5];

        for (String[] ch : chs) {
            for (String s : ch) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

    }
}
