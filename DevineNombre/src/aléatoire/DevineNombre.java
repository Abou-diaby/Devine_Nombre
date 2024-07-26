package aléatoire;
import java.util.Scanner;
public class DevineNombre {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = (int)(Math.random()*101);
		int essaie = 0;
		boolean win = false;
	while(essaie<10) {
		System.out.print("Entrez votre nombre: ");
		int nb = scanner.nextInt();
		essaie++;
		if(nb>num) {
			System.out.print("Le nombre à deviner est plus petit. ");
		}else if(nb<num) {
			System.out.print("Le nombre à deviner est plus grand. ");
		}else {
			win = true;
			break;
		}
	}
	if(win){
		System.out.println("Vous avez gagné le nombre est: "+num);
	}else{
		System.out.println("Vous avez perdu, nombre de tentative atteint, le nombre était: "+num);
	}
}
}
