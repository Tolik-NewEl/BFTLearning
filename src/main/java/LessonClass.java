public class LessonClass {

    public int age;
    public String name;
    static String jobTitle;

    public void printJob() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Должность: " + jobTitle);
    }

    public static void main(String[] args) {
        //создаем первый объект класса
        LessonClass lessonClass = new LessonClass();
        //инициализируем публичные переменные для первого объекта
        lessonClass.age = 40;
        lessonClass.name = "Анатолий";
        //инициализируем статичную переменную (обращение по имени объекта сделано намеренно)
        lessonClass.jobTitle = "Тестировщик";
        lessonClass.printJob();
        System.out.println();
        //инициализируем второй объект класса
        LessonClass lessonClass1 = new LessonClass();
        //инициализируем публичные переменные для второго объекта
        lessonClass1.age = 41;
        lessonClass1.name = "Сергей";
        //инициализируем статичную переменную (обращение по имени объекта сделано намеренно)
        lessonClass1.jobTitle = "QA";
        lessonClass1.printJob();
        System.out.println();
        //вызываем метод для первого объекта. Статичная переменная переопределилась, т.к. это переменная класса
        lessonClass.printJob();
    }
}
