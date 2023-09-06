public class Task9 {
    String name;
    String surname;

    public String toString (){
            return name + surname;
    }
    public  static void changePerson (Task9 person){
        Task9 peron = new Task9 ();
        String name = "Ilya";
        String surname = "Lagutenko";
        peron.toString();
    }
    public static void main(String[] args) {
        Task9 person = new Task9();
        String name = "Lyapis";
        String surname = "Trubetskoy";
        changePerson( person);
        System.out.println(person);

    }
}

