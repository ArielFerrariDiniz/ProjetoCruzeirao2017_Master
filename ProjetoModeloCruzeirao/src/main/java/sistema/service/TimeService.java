package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.modelos.Equipe;

public class TimeService {
	
	private ArrayList <Equipe> times = new ArrayList<Equipe>();
	
	public TimeService()
	{
	}
	
	public void salvar(Equipe time)
	{
	    times.add(time);
	}

	public List<Equipe> getTimes()
	{
		return times;
	}

	public void removerTime(Equipe time) {
		// TODO Auto-generated method stub
		times.remove(time);
	}
}