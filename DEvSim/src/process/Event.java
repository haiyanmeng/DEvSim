package process;

import java.util.Vector;

import resources.Block;

public interface Event {

	int doEvent(int time);	
	Vector<Block> resourcesNeeded();
}
