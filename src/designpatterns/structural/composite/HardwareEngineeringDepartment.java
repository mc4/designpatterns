package designpatterns.structural.composite;

public class HardwareEngineeringDepartment implements Department {

	private int id;
	private String name;

	public HardwareEngineeringDepartment(final int id, final String name) {
		this.id = id;
		this.name = name;
	}

	public void printDepartmentName() {
		System.out.println(getClass().getSimpleName());
	}

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

}
