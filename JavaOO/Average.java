import java.util.Scanner;

public class Average { 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	
    	double sum = 0;
    	boolean flag = true;
        System.out.print("�Է��� �ִ� �Ǽ��� ������ �Է��ϼ���. >> ");    
        Scanner input = new Scanner(System.in);  
        int size = input.nextInt();    
        while(flag){
        	
        }
        System.out.println("\n�߰��� 0�� �Է��ϸ� ���� �Է��ڷ�� ����ϰ� �����մϴ�.");  
        System.out.print("�Ǽ� " + size + "���� �Է��ϼ���. >> ");    
        
        if(size != 0){
            sum += size;
        }else{
            flag = false;


        //���α׷��� �ϼ���.
        
        System.out.println("��: " +sum+ ", ���: " + sum/size);
    }
}
}