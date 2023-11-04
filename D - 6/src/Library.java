public class Library {
    //////метод проводящий корректность  ввода колчества узлов в списке
    public static boolean conditionVerify(int n){
        if (n <= 0){
            System.out.println("\n n должен быть больше 0."+"\n попробуйте ещё раз!\n");
            return false;
        }
        return true;
    }
}
