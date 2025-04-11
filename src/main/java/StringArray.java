import java.util.Random;

public class StringArray {

    Random random = new Random();
    int stringNumber = random.nextInt(3);

    public String printRandomString(String[] array){
        return array[stringNumber];
    }

    public String printUpperCase(String[] array, int index){
        return array[index].toUpperCase();
    }

    public String printLowerCase(String[] array, int index){
        return array[index].toLowerCase();
    }

    public String arrayManipulations(String[] array){
        String a = "Слов с второй буквой О нет в массиве";
        for (int i = 0; i < array.length; i++) {
            if(array[i].indexOf("О") == 1){
                String start = array[i].substring(0, 3);
                String end = array[i].substring(3);
                a = start + " " + end;
            }
        }
        return a;
    }
}
