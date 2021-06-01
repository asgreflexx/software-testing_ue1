public class Employee {

    private int yearInOffice;

    private Department department;

    private Double loan;

    public Employee(int yearInOffice, Department department, Double loan) {
        this.yearInOffice = yearInOffice;
        this.department = department;
        this.loan = loan;
    }

    public int getYearInOffice() {
        return yearInOffice;
    }

    public void setYearInOffice(int yearInOffice) {
        this.yearInOffice = yearInOffice;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Double getLoan() {
        return loan;
    }

    public void setLoan(Double loan) {
        this.loan = loan;
    }
}
