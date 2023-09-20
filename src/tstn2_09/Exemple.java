package tstn2_09;

import java.util.Scanner;

public class Exemple {

	private static Scanner sc = new Scanner(System.in);
	
	private static int[] notes;
	
	private static Matieres[] tabMatieres;
	
 	public static void main(String[] args) {
		
		System.out.println("Bonjour qu'elle est votre nom");
		String prenom = sc.nextLine();
		
		System.out.println("hello " + prenom);
		
		System.out.println("quelle age avez vous ?");
		
		int age = sc.nextInt();
		System.out.println("Combien il y a t'il de notes");
		int taille = sc.nextInt();
		
		// on initialise le tableau de note et le tableau de matiere
		notes = new int[taille];
		tabMatieres = new Matieres[taille];
		
		for (int i =0; i<taille; i++ )
		{
			
			System.out.println("saisir la note n°"+i );
			notes[i] = sc.nextInt();
			tabMatieres[i] = selectionnerMat();
		}
		System.out.println("votre moyenne est de "+ moyenne(notes));
		
		
	}
	public static void afficher(int [] tab) {
		System.out.print('[');
		for (int i = 0; i<tab.length; i++) {
			System.out.print(tab[i]);
			System.out.print(',');
		}
		System.out.print("]\n");
	}
	
	public static float moyenne(int [] tab) {
		
		float somme = 0;
		for (int i = 0; i<tab.length; i++) {
			somme = somme + tab[i];
		}
		
		return somme/tab.length;
		
	}

	public static Matieres selectionnerMat() {
		
		Matieres m = null;
		
		System.out.println("veuillez choisir une matiere");
		System.out.println("1: JAVA");
		System.out.println("2 : SQL");
		System.out.println("3 : ANGLAIS");
		
		int choix = sc.nextInt();
		switch(choix) {
			case 1:
				m = Matieres.JAVA;
				break;
			case 2 :
				m = Matieres.SQL;
				break;
			case 3 :
				m = Matieres.ANGLAIS;
				break;
			
		}
		return m;
		
	}
}

