package chapter9;

public class Employee extends Person {
    private int employeeId;
    private String Title;

    public Employee() {
        super("karim");
        System.out.println("In Employee constructor");

    }
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
