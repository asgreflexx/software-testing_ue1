import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SekretaryPostOfficeBonusTest {

    @Test
    public void noBonusForOverSeventyFiveYears() {
        Employee employee = new Employee(76, Department.SECRETARY, 1800.00);

        Double bonus = BonusCalculator.calculateBonus(employee);

        assertEquals(0.0, bonus);
    }

    @Test
    public void noBonusForUnderTwoYears() {
        Employee employee = new Employee(1, Department.POST_OFFICE, 2400.00);

        Double bonus = BonusCalculator.calculateBonus(employee);

        assertEquals(0.0, bonus);
    }

    @Test
    public void bonusForUnderSeventyFiveYears() {
        Employee employee = new Employee(74, Department.SECRETARY, 1800.00);

        Double bonus = BonusCalculator.calculateBonus(employee);

        assertNotNull(bonus);
        assertEquals(4320.00, bonus);
    }

    @Test
    public void bonusForOverTwoYears() {
        Employee employee = new Employee(3, Department.POST_OFFICE, 1800.00);

        Double bonus = BonusCalculator.calculateBonus(employee);

        assertNotNull(bonus);
        assertEquals(1800.00, bonus);
    }


    @Test
    public void bonusForOverFourYears() {
        Employee employee = new Employee(5, Department.SECRETARY, 1800.00);

        Double bonus = BonusCalculator.calculateBonus(employee);

        assertNotNull(bonus);
        assertEquals(2880.0, bonus);
    }

    @Test
    public void bonusForOverTenYears() {
        Employee employee = new Employee(11, Department.POST_OFFICE, 2400.00);

        Double bonus = BonusCalculator.calculateBonus(employee);

        assertNotNull(bonus);
        assertEquals(5760.00, bonus);
    }
}
