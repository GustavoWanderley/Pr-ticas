/*
 * Controla email
 * author Gustavo
 */
package br.com.fip.praticas.questao04;

import br.com.fip.praticas.questao03.Anexo;

public class Email {
	
	private String origem;
	private String destinatario;
	private String textoEmail;
	private String dataEnvio;
	private Anexo anexo;
	
	public String getOrigem() {
		return origem;
	}
	
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	public String getDestinatario() {
		return destinatario;
	}
	
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public String getTextoEmail() {
		return textoEmail;
	}
	
	public void setTextoEmail(String textoEmail) {
		this.textoEmail = textoEmail;
	}
	
	public String getDataEnvio() {
		return dataEnvio;
	}
	
	public void setDataEnvio(String dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	
	public Anexo getAnexo() {
		return anexo;
	}
	
	public void setAnexo(Anexo anexo) {
		this.anexo = anexo;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anexo == null) ? 0 : anexo.hashCode());
		result = prime * result
				+ ((dataEnvio == null) ? 0 : dataEnvio.hashCode());
		result = prime * result
				+ ((destinatario == null) ? 0 : destinatario.hashCode());
		result = prime * result + ((origem == null) ? 0 : origem.hashCode());
		result = prime * result
				+ ((textoEmail == null) ? 0 : textoEmail.hashCode());
		return result;
	}
	
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Email other = (Email) obj;
		if (anexo == null) {
			if (other.anexo != null)
				return false;
		} else if (!anexo.equals(other.anexo))
			return false;
		if (dataEnvio == null) {
			if (other.dataEnvio != null)
				return false;
		} else if (!dataEnvio.equals(other.dataEnvio))
			return false;
		if (destinatario == null) {
			if (other.destinatario != null)
				return false;
		} else if (!destinatario.equals(other.destinatario))
			return false;
		if (origem == null) {
			if (other.origem != null)
				return false;
		} else if (!origem.equals(other.origem))
			return false;
		if (textoEmail == null) {
			if (other.textoEmail != null)
				return false;
		} else if (!textoEmail.equals(other.textoEmail))
			return false;
		return true;
	}
	
	
	public String toString() {
		return "Email [Origem : " + origem + ", Para : " + destinatario
				+ ", Conteudo : " + textoEmail + ", Data : " + dataEnvio
				+ ", anexo -> " + anexo + "]";
	}
	
}