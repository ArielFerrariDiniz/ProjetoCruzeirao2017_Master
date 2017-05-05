package sistema.modelos;

import java.util.ArrayList;
import java.util.Date;

public class Equipe {
		
	private String nome;
	private Date dataFuncadacao;
	private String cidade;
	private ArrayList<Usuario> diretores;
	private int teste;
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public Date getDataFuncadacao() {
		return dataFuncadacao;
	}
	public void setDataFuncadacao(Date dataFuncadacao) {
		this.dataFuncadacao = dataFuncadacao;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public ArrayList<Usuario> getDiretores() {
		return diretores;
	}
	public void setDiretores(ArrayList<Usuario> diretores) {
		this.diretores = diretores;
	}
	public String salvarEditar()
	{
		return "cadastroTime";
	}
	
}
