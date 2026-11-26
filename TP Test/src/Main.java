import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		int i;
		i = 0;
		System.out.println("Saisir un entier");
		try {//gestion exception fiche 8
			i = clavier.nextInt();
		}
		catch (Exception erreur) {
			System.out.println("Erreur, réessaie");
			erreur.printStackTrace(); //affiche erreur 
		}
		
		System.out.println(i);
		
		
		
		

	}

}
