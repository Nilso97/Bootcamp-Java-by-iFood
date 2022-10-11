package Classes;

public class MyClass {

	public static void main(String[] args) {
		String firstName = "John";
		String lastName = "Doe";
		
		String completeName = completeName(firstName, lastName);
		
		System.out.println(completeName);
	}
	
	public static String completeName(String firstName, String lastName) {
		return "Resultado do método é: " + firstName.concat(" ").concat(lastName);
	}
}
