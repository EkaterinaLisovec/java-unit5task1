import static org.junit.jupiter.api.Assertions.*;

class BonusServiseTest {

    @org.junit.jupiter.api.Test
    void shoudCalculateForRegistradetAndUnderLimited() {
        BonusServise service = new BonusServise();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shoudCalculateNotRegistradetAndUnderLimited() {
        BonusServise service = new BonusServise();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shoudCalculateForRegistradetAndOverLimited() {
        BonusServise service = new BonusServise();

        // подготавливаем данные:
        long amount = 1000000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shoudCalculateNotRegistradetAndOverLimited() {
        BonusServise service = new BonusServise();

        // подготавливаем данные:
        long amount = 1000000_60;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}