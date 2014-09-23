package Dog;

public abstract class Dog {
	protected String name;
	protected int age;
	protected int height;
	protected int weight;
	
	public Dog(){
		setName(null);
		setHeight(0);
		setWeight(0);
		setAge(0);
	}
	
	public void barking(){}
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
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}