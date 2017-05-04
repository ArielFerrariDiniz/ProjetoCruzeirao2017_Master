package sistema.modelos;

public class Partida {
	private int codigo;
	private String timeCasa;
	private String timeVisitante;
	private String local;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTimeCasa() {
		return timeCasa;
	}
	public void setTimeCasa(String timeCasa) {
		this.timeCasa = timeCasa;
	}
	public String getTimeVisitante() {
		return timeVisitante;
	}
	public void setTimeVisitante(String timeVisitante) {
		this.timeVisitante = timeVisitante;
	}
}
