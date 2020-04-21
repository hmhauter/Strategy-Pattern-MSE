import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EngineController eg = new EngineController();		
		Scanner scan = new Scanner(System.in);	
		String input = "";
		
		// w‰hlen, ob ein TestKit verbunden ist oder das Auto normal auf der Straﬂe f‰hrt
		while(true) {
			System.out.println("Connect Test Kit(t); Exit(x); Else(anything)");
			input = scan.nextLine();
			if (input.equals("t")) { //TestKit ist verbunden
				eg.getNOx(eg.connectTestKit());
			}else if(input.equals("x")) { //EXIT
				break;
			}
			else { //Auto f‰hrt normal auf der Straﬂe
				eg.getNOx(eg.ontheroad());
			}
			
		}
		System.out.println("EXIT");
	}

}
