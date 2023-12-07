package com.hibernates;
import java.lang.annotation.Native;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@NamedQueries({
	@NamedQuery(name="selectAllEmployee",query="from Employee")
})
@NamedNativeQueries({
	@NamedNativeQuery(name="FindAllEmployee",query="from Employee")
})
@Entity
@Table(name ="Employee")
	public class Employee {
		 @Id
		    @Column(name ="id")
		    private int id ;
		    
		    @Column(name ="name")
		    private String name;
		    
		    @Column(name ="department")
		    private String department;
		    
		    
		    public int getId() {
		        return id;
		    }
		    public void setId(int id) {
		        this.id = id;
		    }
		    public String getName() {
		        return name;
		    }
		    public void setName(String name) {
		        this.name = name;
		    }
			public String getDepartment() {
				return department;
			}
			public void setDepartment(String department) {
				this.department = department;
			}
			@Override
			public String toString() {
				return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
			}

		    }
