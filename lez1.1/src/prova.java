import java.util.Scanner;	
	
public class prova {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int ore, minuti;
			System.out.println("Inserire ore e minuti");
			ore = input.nextInt();
			minuti = input.nextInt();
			
			
			
			if (orarioOk(ore,minuti))
				System.out.print("abbiamo un fottuto orario");
			else System.out.println("non puo esse n'orario");
		}
		
		private static boolean orarioOk(int o, int m) {
			boolean ore_ok = (o>=0) && (o<24);
			boolean minuti_ok = (m>=0) && (m<60);
			return ore_ok && minuti_ok;
		}
}


