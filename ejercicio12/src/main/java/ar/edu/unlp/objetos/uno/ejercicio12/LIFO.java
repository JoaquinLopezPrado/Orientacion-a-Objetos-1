package ar.edu.unlp.objetos.uno.ejercicio12;

public class LIFO extends JobScheduler{

	@Override
	public JobDescription next() {
		JobDescription nextJob = null;
		nextJob = jobs.get(jobs.size()-1);
        this.unschedule(nextJob);
        return nextJob;
	}

}
