package task1;

public class Main { //мой класс main
    public static void main(String[]args) {
        // Проверяем, что переданы два аргумента, если не 2 числа будет сообщение ошибки
        if (args.length != 2) {
            System.out.println("Пожалуйста, укажите два числа: n и m");
            return; //завершим програму если не 2 числа
        }
        int n = 0; // это будет n
        int m = 0; // это соответственно m

        n = Integer.parseInt(args[0]);
        m = Integer.parseInt(args[1]);

        System.out.println(n);
        System.out.println(m);
    }
}