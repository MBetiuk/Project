package pl.betiuk.project.model;

public class Filter {
    public Employee employee;
    public EmployeeTypeEnum employeeTypeEnum;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeTypeEnum getEmployeeTypeEnum() {
        return employeeTypeEnum;
    }

    public void setEmployeeTypeEnum(EmployeeTypeEnum employeeTypeEnum) {
        this.employeeTypeEnum = employeeTypeEnum;
    }
}