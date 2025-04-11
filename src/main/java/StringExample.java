public class StringExample {

    public static void main(String[] args) {

        String[] myArray = new String[]{"привет", "ПОКА", "гипербола"};

        StringArray stringArray = new StringArray();
        System.out.println(stringArray.printUpperCase(myArray, 0));
        System.out.println(stringArray.printLowerCase(myArray, 1));
        System.out.println(stringArray.arrayManipulations(myArray));
        System.out.println(stringArray.printRandomString(myArray));
    }
}
