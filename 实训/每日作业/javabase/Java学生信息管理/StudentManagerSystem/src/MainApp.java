import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Student student = new Student();
		while(true){
			
			try{
				System.out.println("----------------��ӭʹ��ѧ������ϵͳ------------------");
				
			
					
					System.out.println("-----------------------------------------------");
					System.out.println("ѡ����  1���鿴����ѧ��  2�����ѧ��  3��ɾ��ѧ��  4���޸�ѧ��  5���˳�");
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
						System.out.println("��лʹ�ã�");
						System.exit(0);
					}
					
					else{
						System.out.println("��������ȷ���ܴ��ţ�");
					}	
			}catch(Exception e){
					System.err.println("����δ֪��������������");
	
			}
		}	
	}
}
