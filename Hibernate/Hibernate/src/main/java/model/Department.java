package model;

import jakarta.persistence.*;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "department-name")
    private String departmentName;

    public Department() {
    }

   public long getId(){
        return id;
   }

   public void setId(long id){
        this.id = id;
   }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
