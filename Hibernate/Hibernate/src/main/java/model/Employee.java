package model;


import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "first-name")
    private String firstName;

    @Column(name = "salary")
    private double salary;
    //reference to department
    @JoinColumn(name = "department")
    @ManyToOne
    private Department department;

    public Employee() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
