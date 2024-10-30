import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Все операции выполняются соответствующими знаками");
        System.out.println("После ввода числа или операции нажимать на Enter");
        Scanner scanner = new Scanner(System.in);

        boolean key = true;
        while (key) {

            int a = scanner.nextInt();
            char c = scanner.next().charAt(0);

            switch (c) {

                case '+':
                    int b = scanner.nextInt();
                    System.out.println("Результат: " + sum(a, b));
                    break;

            }

            System.out.print("Закончить?(y/не y - чтобы продолжить): ");
            char stop = scanner.next().charAt(0);
            if (stop == 'y') {
                key = false;
            }
        }
    }
    public static int sum(int a, int b){
        return a + b;
    }

}