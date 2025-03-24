public class Car {

    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void makeBeBe(){
        if (year < 2005) {
            System.out.println("Эта рухлядь вряд ли издаст хоть звук...");
        } else if (year < 2025 && model.startsWith("A")){
            System.out.println("Клаксон, что надо!!!");
        } else if (year < 2025){
            System.out.println("Вроде новая машина... А че так крякает то?");
        } else {
            System.out.println("Что это за модель? Не знаю такую...");
        }
    }
}
