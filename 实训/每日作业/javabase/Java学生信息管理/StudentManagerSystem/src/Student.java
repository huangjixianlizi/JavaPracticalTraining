

import java.util.ArrayList;
import java.util.Scanner;



public class Student {
	int id;
	String name;
	String age;
	String place;
	
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	public Student(int id, String name, String age, String place) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.place = place;
	}
	public Student(){
		
	}
	
	
	
	//定义arraylist用来存储信息
	ArrayList<Student> studentgroup = new ArrayList<>();

	//查看所有学生
	public void showAllUser(){
		if(studentgroup.size()==0){
			System.out.println("目前没有学生记录！");
		}else {
			System.out.println("学号"+"   "+"   "+"姓名"+"   "+"   "+"年龄"+"   "+"   "+"居住地");
			for(int i = 0; i < studentgroup.size();i++){
				System.out.println(studentgroup.get(i).getId()+"    "+studentgroup.get(i).getName()
				+"    "+studentgroup.get(i).getAge()+"    "+studentgroup.get(i).getPlace());
			}
		}
		
	}
	//添加学生
	public void register(){
		
		Student student = new Student();

		Scanner scanner = new Scanner(System.in);		
		System.out.println("请输入学生学号：");
		int id = scanner.nextInt();
		student.setId(id);
		boolean exist = false;
	    for(int j = 0;j < studentgroup.size();j++){
			if(id == studentgroup.get(j).getId()){
				//=========判断学号是否已被占用
				System.out.println("此学号已被占用！");
				exist = true;
			}
		}
		if(!exist){
			scanner = new Scanner(System.in);
			System.out.println("请输入学生姓名：");
			String name = scanner.nextLine();
			student.setName(name);
			
			scanner = new Scanner(System.in);
			System.out.println("请输入学生年龄：");
			String age = scanner.nextLine();
			student.setAge(age);
			
			scanner = new Scanner(System.in);
			System.out.println("请输入学生居住地：");
			String place = scanner.nextLine();
			student.setPlace(place);
	
			studentgroup.add(student);
	    }

	}
    //删除学生
	public void drop(){
		if(studentgroup.size()==0){
			System.out.println("目前没有学生记录！");
		}else {
			System.out.println("请输入要删除的学生信息的学号：");
			Scanner scanner = new Scanner(System.in);
			int id = scanner.nextInt();
			for(int j = 0;j < studentgroup.size();j++){
				if(id == studentgroup.get(j).getId()){
					studentgroup.remove(studentgroup.get(j));
					System.out.println("已删除");
				}
			}		
		}	
	}
	//修改学生
	public void update(){
		if(studentgroup.size()==0){
			System.out.println("目前没有学生记录！");
		}else{
			System.out.println("请输入要更改的学生信息的学号：");
			Scanner scanner = new Scanner(System.in);
			int id = scanner.nextInt();
			for(int j = 0;j < studentgroup.size();j++){
				if(id == studentgroup.get(j).getId()){
					scanner = new Scanner(System.in);
					System.out.println("请输入新的学生姓名：");
					String name = scanner.nextLine();
					studentgroup.get(j).name = name;
					
					scanner = new Scanner(System.in);
					System.out.println("请输入新的学生年龄：");
					String age = scanner.nextLine();
					studentgroup.get(j).age = age;
					
					scanner = new Scanner(System.in);
					System.out.println("请输入新的学生居住地：");
					String place = scanner.nextLine();
					studentgroup.get(j).place = place;
				}
			}
		}
	}
    
	
}
