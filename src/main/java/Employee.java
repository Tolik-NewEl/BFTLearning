public class Employee {

    void work() {
        System.out.println("Любой работник должен работать!");
    }

    void personalData (String name, int salary){
        System.out.println("Его зовут: " + name);
        System.out.println("Его зарплата: " + salary + " USD");
    }

    void personalData (String name){
        System.out.println("Его зовут: " + name);
        System.out.println("Его зарплата: коммерческая тайна!");
    }
}
