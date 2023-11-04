import java.util.Scanner;

public class UserList implements Applicable {
    ///// адрес начала односвязного списка

    private NodePerson begin;

    public NodePerson getBegin() {
        return begin;
    }

    /////котструкцииия иницифлизирующий список из n   записей
    public UserList(int n) {
        System.out.println("ввод 1-ой записи:");
        begin = new NodePerson(initNode());
        NodePerson current = begin;
        for (int i = 1; i < n; i++) {
            System.out.println("ввод" + (i + 1) +
                    " -ой записи:");
            current.getNext(new NodePerson(initNode()));
            current = current.getNext();
        }
    }

    ////приватный экземпляр метод заполнени одного узла списка
    private Penson initNode() {
        Scanner in = new Scanner(System.in);
        System.out.println("\tфамилия: ");
        System.out.print("\t ");
        String lastName = in.nextLine();
        System.out.println("\tимя: ");
        System.out.print("\t ");
        String firstName = in.nextLine();
        System.out.println("\tотчество: ");
        System.out.print("\t ");
        String secondName = in.nextLine();
        System.out.println("\tвозраст: ");
        System.out.print("\t   ");
        int age = Integer.parseInt(in.nextLine());
        System.out.println("\tпол: ");
        System.out.print("\t ");
        char gender = in.nextLine().charAt(0);
        return new Penrson(firstName, secondName, lastName, age, gender);

    }

    /////экземпляр метод, выбора по критерию
    public String resultChoise(char gender) {
        String result = "";
        NodePerson current = begin;
        while (current != null) {
            if (current.getPerson().getGender() == gender) {
                result = result + current.toString() + "\n";
            }
            current = current.getNext();
        }
        return result;
    }

    ///метод вывода списка на экран
    @Override
    public String toString() {
        String result = " ";
        NodePerson current = this.begin;
        while (current != null) {
            result = result + current.toString() + "\n";
            current = current.getNext();
        }
        return result;
    }

}

////

