import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exceptions {

    @Test
    void exception() {
        try {
            System.out.println((char[]) null);
            Assertions.assertTrue(false);
        } catch (AssertionError e) {
            System.err.println("Ошибка сравнения: " + e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("Ошибка вывода: вывод null как char[]");
            e.printStackTrace();
        }
    }
}