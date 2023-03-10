package test2;

public class Student {

	private String code;
	private String name;
	private String tel;
	private int age;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student() {
		super();
	}

	public Student(String code, String name, int age) {
		super();
		this.code = code;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + ", tel=" + tel + ", age=" + age + "]";
	}
	
}
