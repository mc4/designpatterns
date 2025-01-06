package designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class EngineeringDepartment {

	private int id;
	private String name;

	private List<Department> childDepartments;

	public EngineeringDepartment(final int id, final String name) {
		this.id = id;
		this.name = name;
		this.childDepartments = new ArrayList<>();
	}

	public void printDepartmentName() {
		childDepartments.forEach(Department::printDepartmentName);
	}

	public void addDepartment(final Department department) {
		childDepartments.add(department);
	}

	public void removeDepartment(final Department department) {
		childDepartments.remove(department);
	}

}
