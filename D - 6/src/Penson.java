public class Penson {
    /////свойства
    private String firstName, secondName, lastName;
    private int age;
    private char gender;
    ///// методы
    public Penson(String firstName, String secondName,
                  String lastName, int age, char gender){
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    public String getFirst() {return firstName;}
    public String getSecond(){return secondName;}
    public String getLast()  {return lastName;}
    public int getAge()      {return age;}
    public char getGender()  {return gender;}
    @Override                                ////   ===== переопределение сообщение------
    public String toString(){
        return " Ф И О " + this.getLast() + " " + this.getFirst().charAt(0) + "." +
                this.getSecond().charAt(0)+ "." +
                "возраст: " + this.getAge() + ", пол: " + this.getGender();
    }
}
