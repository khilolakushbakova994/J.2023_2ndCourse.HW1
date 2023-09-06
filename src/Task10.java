public class Task10 {
    String name;
    String surname;

    public String toString (){
        return name + "  " + surname;
    }
    public  static void changePerson (Task10 person){
        Task10 peron = new Task10 ();
        peron.name = "Ilya";
        peron.surname = " Lagutenko";
        peron.toString();
    }
    public static void main(String[] args) {
        Task10 person = new Task10();
        person.name = "Lyapis";
        person.surname = "Trubetskoy";
        changePerson( person);
        System.out.println(person);

    }
}