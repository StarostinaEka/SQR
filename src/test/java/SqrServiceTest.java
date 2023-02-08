import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.SQR.sqrservice;

public class SqrServiceTest {



        @Test
        public void countSquares() {
            sqrservice service = new sqrservice();
            int expected = 3;
            int actual = service.countSquares(200, 300);
            Assertions.assertEquals(expected, actual);
        }

        @Test
        void countSquaresOverLimit() {
            sqrservice service = new sqrservice();
            int expected = 90;
            int actual = service.countSquares(100, 100_000);
            Assertions.assertEquals(expected, actual);
        }

        @Test
        void countSquaresUnderLimit() {
            sqrservice service = new sqrservice();
            int expected = 0;
            int actual = service.countSquares(10, 99);
            Assertions.assertEquals(expected, actual);
        }


    }
