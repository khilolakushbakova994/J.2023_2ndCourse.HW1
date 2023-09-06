import org.jetbrains.annotations.NotNull;

public class Task8 {

    public static void main(String[] args) {
        Integer[] value = {3, 4};
        for (int i = 0; i < value.length; i++) {

        }
        changeValue(value);
        System.out.println(value[0]);
        System.out.println(value [1]) ;
    }
    public  static void  changeValue (@NotNull Integer[] value){
        value [0] = 99;

    }




    }

