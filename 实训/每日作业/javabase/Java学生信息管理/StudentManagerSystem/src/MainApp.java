import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Student student = new Student();
		while(true){
			
			try{
				System.out.println("----------------欢迎使用学生管理系统------------------");
				
			
					
					System.out.println("-----------------------------------------------");
					System.out.println("选择功能  1》查看所有学生  2》添加学生  3》删除学生  4》修改学生  5》退出");
					Scanner scanner = new Scanner(System.in);
					int choice = scanner.nextInt();
					if(choice == 1 ){
						student.showAllUser();
					}
					
					else if(choice ==2){
						student.register();
					}
					
					else if(choice ==3){
						student.drop();
					}
					
					else if(choice ==4){
						student.update();
					}
					
					else if(choice ==5){
						System.out.println("感谢使用！");
						System.exit(0);
					}
					
					else{
						System.out.println("请输入正确功能代号！");
					}	
			}catch(Exception e){
					System.err.println("发生未知错误！请重新输入");
	
			}
		}	
	}
}
