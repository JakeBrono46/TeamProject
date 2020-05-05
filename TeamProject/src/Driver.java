import java.io.*;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Team t = new Team();
		
		String name;
		int num;
		char position;
		double points, rebounds, assists;
		
		try {
			Scanner input = new Scanner(new File("TeamFile.txt"));
			
			while(input.hasNext()) {
				name = input.next() + " " + input.next();
				num = input.nextInt();
				position = input.next().charAt(0);
				points = input.nextDouble();
				rebounds = input.nextDouble();
				assists = input.nextDouble();
				
				t.addPlayer(new Player(name, num, position, points, rebounds, assists));
			}
			
			input.close();
			
		}catch(IOException e) {
			System.out.println("*** I/O Error ***\n" + e);
		}
		
		System.out.println(t.toString());
	}

}
