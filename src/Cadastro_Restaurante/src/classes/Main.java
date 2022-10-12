package classes;

public class Main {

	public static void main(String[] args) {
		
		Endereco enderecoRestauranteBeiraMar = new Endereco("83280-000", "Av. Atlântica, 1200 - Centro, Guaratuba - PR");
		
		Restaurante restaurante = new Restaurante();
		restaurante.setId(1L);
		restaurante.setNomeFantasia("Restaurante Beira Mar");
		restaurante.setCnpj("000.000.0001-11");
		restaurante.setEndereco(enderecoRestauranteBeiraMar);
		
		System.out.println(restaurante);
	}
}
