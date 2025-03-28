public class StringArray {

    public static void main(String[] args) {

        String[] myArray = new String[]{"привет", "ПОКА", "гипербола"};

        System.out.println(myArray[0].toUpperCase());
        System.out.println(myArray[1].toLowerCase());

        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i].indexOf("О") == 1){
                String start = myArray[i].substring(0, 3);
                String end = myArray[i].substring(3);
                System.out.println(start + " " + end);
            }
        }
    }
}
