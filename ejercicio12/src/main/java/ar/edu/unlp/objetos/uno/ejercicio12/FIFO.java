package ar.edu.unlp.objetos.uno.ejercicio12;

public class FIFO extends JobScheduler{

	
	@Override
	public JobDescription next() {
		JobDescription nextJob = null;
		nextJob = jobs.get(0);
        this.unschedule(nextJob);
        return nextJob;
	}

}
