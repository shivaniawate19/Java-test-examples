package encap;

public class EncapsulationConcept {
	private int empno;
	private String name;
	private int age;
	
	private int weight;
	private int hight;
	
	public static void main(String[] args) {
		EncapsulationConcept obj = new EncapsulationConcept();
		obj.setEmpno(1234);
		obj.setAge(25);
		obj.setName("shivani");
		
		System.out.println(obj.getEmpno());
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

}
