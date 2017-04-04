package totototo;
import java.util.*;
public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int num1 = r.nextInt(6)+1;
		int num2 = r.nextInt(6)+1;
		System.out.println("컴퓨터가 던진 숫자는: " +num1);
		System.out.println("내가 던진 숫자는: " +num2);
		if (num1<num2)
			System.out.println("빙고!!!!! 돈을 땄습니다.");
		else if (num1>num2)
			System.out.println("이런,돈을 모두 잃었습니다.");
		else
			System.out.println("비겼습니다.");
	}

}
