package tests.entities;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {

    @Test
    public void constructorShouldCreateObjectWhenValidData() {

        Financing f = new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(100000.0, f.getTotalAmount());
        Assertions.assertEquals(2000.0, f.getIncome());
        Assertions.assertEquals(80, f.getMonths());

    }

    @Test
    public void constructorShouldThrowIllegalArgumentExceptionWhenValidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.0, 2000.0, 20);

        });

    }

    @Test
    public void setTotalAmountShouldSetDataWhenValidData() {

        Financing f = new Financing(100000.0, 2000.0, 80);

        f.setTotalAmount(90000.0);

        Assertions.assertEquals(90000.0, f.getTotalAmount());


    }

    @Test
    public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenValidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.0, 2000.0, 80);
            f.setTotalAmount(150000.0);

        });
    }

    @Test
    public void setIncomeShouldSetDataWhenValidData() {

        Financing f = new Financing(100000.0, 2000.0, 80);

        f.setIncome(2100.0);

        Assertions.assertEquals(2100.0, f.getIncome());

    }


    @Test
    public void setIncomeShouldThrowIllegalArgumentExceptionWhenValidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.0, 2000.0, 80);
            f.setIncome(1900.0);

        });

    }

    @Test
    public void setMonthsShouldSetDataWhenValidData() {

        Financing f = new Financing(100000.0, 2000.0, 80);

        f.setMonths(81);

        Assertions.assertEquals(81, f.getMonths());

    }
    @Test
    public void setMonthsShouldThrowIllegalArgumentExceptionWhenValidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.0, 2000.0, 80);
            f.setMonths(23);

        });
    }
    @Test
    public void entryShouldCalculateEntryCorrectly() {

        Financing f = new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(20000.0, f.entry());

        }

    @Test
    public void quotaShouldCalculateEntryCorrectly() {

        Financing f = new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(1000.0, f.quota());

    }









}
