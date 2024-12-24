import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class StringUntTest {
    private StringUt StringU;
    @BeforeEach
    void setUp() {
        StringU = new StringUt();
        System.out.println("Инициализация калькулятора перед тестом");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Тест: Найти слово с максимальным количеством 'И'")
    void testFindWordWithMostI() {
        assertEquals("пирог,", StringUt.findWordWithMostI("Я люблю пирог, мороженое и йогурт"));
        assertEquals("мир", StringUt.findWordWithMostI("И мир и радость и грусть"));
    }

    @Test
    @DisplayName("Тест: Максимальная сумма диагоналей")
    void testMaxDiagonalSum() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(15, StringUt.maxDiagonalSum(matrix1));

        int[][] matrix2 = {{1, 2}, {3, 4}};
        assertEquals(5, StringUt.maxDiagonalSum(matrix2));
    }

    @ParameterizedTest
    @CsvSource({
            "Привет мир, ПМ",
            "Java Programming Language, JPL",
            "JUnit Testing Framework, JTF"
    })
    @DisplayName("Тест: Получить инициалы из строки")
    void testGetInitials(String input, String expected) {
        assertEquals(expected, StringUt.getInitials(input));
    }

    @Test
    @Disabled("Этот тест временно отключен")
    void disabledTest() {
    }

    @Test
    void testException() {
        assertThrows(NullPointerException.class, () -> {
            StringUt.findWordWithMostI(null);
        });
    }

    @Test
    void testTimeout() {
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(50);
        });
    }
}