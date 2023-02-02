import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.SQR.SQRService;

public class SqrServiceTest {
    package ru.Netology.SQR;

    public class SqrServiceTest {


        @Test
        public void countSquares() {
            SQRService service = new SQRService();
            int expected = 0;
            int actual = service.countSquares(200, 300);
            Assertions.assertEquals(expected, actual);
        }

        @Test
        void countSquaresOverLimit() {
            SQRService service = new SQRService();
            int expected = 0;
            int actual = service.countSquares(100, 400);
            Assertions.assertEquals(expected, actual);
        }

        @Test
        void countSquaresUnderLimit() {
            SQRService service = new SQRService();
            int expected = 0;
            int actual = service.countSquares(201, 299);
            Assertions.assertEquals(expected, actual);
        }


    }
}
