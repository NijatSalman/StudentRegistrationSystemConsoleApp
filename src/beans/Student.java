package beans;

public class Student {

	private String name;
	private String surname;
	private String className;
	private int age;
	
	
	public Student(){
		
	}
	
	public Student(String name,String surname,String className,int age){
		this.name=name;
		this.surname=surname;
		this.className=className;
		this.age=age;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setStudentName(String name) {
		this.name = name;
	}
	
	
    public String getSurname(){
    	return surname;
    }
	
    public void setSurnmae(String surname){
    	this.surname=surname;
    }

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    
	public String getFullName(){	
		return this.getName()+" "+ this.getSurname()+" "+ this.getClassName()+" "+this.getAge();
	}
    
	
}
