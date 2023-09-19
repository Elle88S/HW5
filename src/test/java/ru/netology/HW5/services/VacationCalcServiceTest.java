package ru.netology.HW5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.HW5.services.VacationCalcService;

public class VacationCalcServiceTest {
    @ParameterizedTest
    // @CsvSource({
    //         "10000, 3000, 20000",
    //         "100000, 60000, 150000"
    // })
    @CsvFileSource(files = "src/test/resources/value.csv")
    public void shouldCalcExact(int income, int expenses, int thereshold, int expected) {

        VacationCalcService service = new VacationCalcService();

        //int income = 10_000;
        //int expenses = 3_000;
        //int thereshold = 20_000;
        //int expected = 3;
        int actual = service.calculate(income, expenses, thereshold);
        Assertions.assertEquals(expected, actual);
    }


    //  @Test
    //  public void shouldCalcExactSecondCase() {

    //     VacationCalcService service = new VacationCalcService();

    //     int income = 100_000;
    //     int expenses = 60_000;
    //     int thereshold = 150_000;
    //     int expected = 2;
    //     int actual = service.calculate(income, expenses, thereshold);
    //     Assertions.assertEquals(expected, actual);

    //  }
}

