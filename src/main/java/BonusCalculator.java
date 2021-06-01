public class BonusCalculator {
    public static void main (String[] args) {
        System.out.println("Hello Tester");
        calculateBonus(new Employee(70, Department.OTHER, 2500.00));
    }

    public static Double calculateBonus(Employee employee) {
        double calculatedBonus = 0.0;

        if(employee.getYearInOffice() <= 75){
            if(Department.POST_OFFICE.equals(employee.getDepartment()) || Department.SECRETARY.equals(employee.getDepartment())){
                calculatedBonus = getCalculatedBonus(
                        employee,
                        calculatedBonus,
                        100,
                        160,
                        240
                );
            } else {
                calculatedBonus = getCalculatedBonus(
                        employee,
                        calculatedBonus,
                        50,
                        80,
                        120
                );
            }
        } else {
            return calculatedBonus;
        }
        return calculatedBonus;
    }

    private static double getCalculatedBonus(
            Employee employee,
            double calculatedBonus,
            int over2YearsPercentage,
            int over4YearsPercentage,
            int over10YearsPercentage) {
        if (employee.getYearInOffice() > 2) {
            calculatedBonus = doCalculation(employee, over2YearsPercentage);
        }
        if (employee.getYearInOffice() > 4) {
            calculatedBonus = doCalculation(employee, over4YearsPercentage);
        }
        if (employee.getYearInOffice() > 10) {
            calculatedBonus = doCalculation(employee, over10YearsPercentage);
        }
        return calculatedBonus;
    }

    public static double doCalculation(Employee employee, int percent) {
        return employee.getLoan() / 100 * percent;
    }
}
