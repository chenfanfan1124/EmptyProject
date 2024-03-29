package demo.reflect;

@MyAnnotation(value = "atguigu")
public class Person extends Creature<String> implements Comparable,MyInterface{
	public String name;
	private int age;
	int id;
	protected static final String addr ="555";
	//创建类时，尽量保留一个空参的构造器。
	public Person() {
		super();
//		System.out.println("今天天气很闷热");
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	private Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", id=" + id +
				", addr='" + addr + '\'' +
				'}';
	}

	@MyAnnotation(value = "abc123")
	public void show(){
		System.out.println("我是一个人！");
	}

	private Integer display(String nation,Integer i) throws Exception{
		System.out.println("我的国籍是：" + nation);
		return i;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void info(){
		System.out.println("中国人！");
	}

	class Bird{

	}
}
