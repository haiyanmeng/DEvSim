package process;

import java.util.Vector;

public class Process {
	
	private Vector<Event> tasks;
	private State state;
	
	public enum State {
	    READY, RUNNING 
	}

	public Process(Vector<Event> tasks) {
		this.tasks = tasks;
	}
	
	public Process() {
		this.tasks = new Vector<Event>();
	}
	
	public void addTask(Event task){
		tasks.add(task);
	}
	
	public Event popTask(){
		Event task = tasks.firstElement();
		tasks.remove(0);		
		return task;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
}
