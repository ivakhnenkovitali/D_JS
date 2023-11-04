import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library obj = new Library();
        Scanner in = new Scanner(System.in);
        int n;

        ///// ВВОД ПРОВЕРКА УСЛОВИЯЯ
        do {
            System.out.println("введите наутуральное n: ");
            n = Integer.parseInt((in.nextLine()));

        }
        while (obj.conditionVerify(n) == false);

        Person[] a = obj.generationaArray(n);
        System.out.println("исходная база данных:");


        obj.display(a);
        System.out.println("введите нижнюю границу возраста:");
        int minAge = Integer.parseInt(in.nextLine());
        System.out.println("введите верхнюю границу возраста:");
        int maxAge = Integer.parseInt(in.nextLine());
        in.close();

        System.out.println("результат выбора");
        Library.resultChoise(a, minAge, maxAge);

    }
}





/*  public class Main
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;

        ///ввод и проверка условия
        do{
            System.out.print("введите натуральное n: ");
            n = Integer.parseInt(in.nextLine());
        }
        while (Library.conditionVerify(n) == false);

        /// создание списка
        UserList list = new UserList(n);
        System.out.println("исходный список:");
        System.out.println(list.toString());
        System.out.print("введите пол для выборки: ");
        char gender = in.nextLine().charAt(0);
        System.out.println("результат выбора");
        System.out.println(list.resultChoise(gender));
    }

}


 */