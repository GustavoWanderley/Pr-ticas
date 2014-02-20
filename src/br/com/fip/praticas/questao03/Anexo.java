package br.com.fip.praticas.questao03;

public class Anexo {
	
	private String nome;
	private String textoEmail;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTextoEmail() {
		return textoEmail;
	}
	
	public void setTextoEmail(String textoEmail) {
		this.textoEmail = textoEmail;
	}
	
	public boolean contains (String parametro){
		if (textoEmail.contains(parametro))
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((textoEmail == null) ? 0 : textoEmail.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Anexo other = (Anexo) obj;
		if (textoEmail == null) {
			if (other.textoEmail != null)
				return false;
		} else if (!textoEmail.equals(other.textoEmail))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String toString() {
		return "Anexo [nome : " + nome + ", textoEmail : " + textoEmail + "]";
	}
	
	
	
}
