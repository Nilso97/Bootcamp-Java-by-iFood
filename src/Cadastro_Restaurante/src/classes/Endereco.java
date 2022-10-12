package classes;

public class Endereco {

	private String cep;
	private String complemento;
	
	public Endereco(String cep, String complemento) {
		this.cep = cep;
		this.complemento = complemento;
	}
	
	public Endereco() {
		/* empty constructor */
	}

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", complemento=" + complemento + "]";
	}
}
