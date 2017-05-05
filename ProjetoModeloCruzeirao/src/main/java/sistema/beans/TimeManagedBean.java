package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Equipe;
import sistema.service.TimeService;

@ManagedBean
@SessionScoped
public class TimeManagedBean {
	
	private Equipe time = new Equipe();
	private TimeService service = new TimeService();
	private Equipe timeAtual;
	
	public void salvar()
	{
		service.salvar(time);
		time = new Equipe();	
	}
	
	public String salvarEditar()
	{
		return "cadastroTime";
	}

	public Equipe getTime() {
		return time;
	}

	public void setTime(Equipe time) {
		this.time = time;
	}

	public List<Equipe> getTimes() {
		return service.getTimes();
	}
	
	public String descricaoTime(Equipe time)
	{
		this.timeAtual = time;
		return "descricaoTime";
	}
	
	public String editarTime(Equipe time)
	{
		this.timeAtual = time;
		return "editarTime";
	}
	public String voltar()
	{
		return "cadastroTime";
	}

	public TimeService getService() {
		return service;
	}

	public void setService(TimeService service) {
		this.service = service;
	}

	public Equipe getTimeAtual() {
		return timeAtual;
	}

	public void setTimeAtual(Equipe timeAtual) {
		this.timeAtual = timeAtual;
	}
	
	public void removerTime(Equipe time)
	{
		service.removerTime(time);
	}
	
}
