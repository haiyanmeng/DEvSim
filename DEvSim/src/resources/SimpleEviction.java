package resources;

public class SimpleEviction implements Evictor {

	@Override
	public int evict(Block[] memory) {
		int oldest = 0;
		for(int i = 0; i < memory.length; i++){
			if(memory[i] != null){
				if(memory[i].lastAccess < memory[oldest].lastAccess){
					oldest = i;
				}
			}
			else{
				oldest = i;
				break;
			}
		}
		return oldest;
	}

}
