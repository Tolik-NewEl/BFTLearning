public class OurWorkers {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Developer developer = new Developer();
        manager.work();
        manager.personalData("Ivan");
        developer.work();
        developer.personalData("Sergey", 2000);
    }
}
