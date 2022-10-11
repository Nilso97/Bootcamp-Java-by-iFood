package Classes;

public class StudentBulletin {

	public static void main(String[] args) {
		
		int finalMedia = 6;
		
		if (finalMedia < 6) {
			System.out.println("REPROVADO");
		} else if (finalMedia == 6) {
			System.out.println("PROVA MINERVA");
		} else {
			System.out.println("APROVADO");
		}
	}
}
