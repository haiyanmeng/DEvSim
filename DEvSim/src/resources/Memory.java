package resources;

import system.OS;

public class Memory implements Storage {

	Block[] memory;
	int readCost;
	int writeCost;
	
	Evictor evict;
	
	public Memory(int size) {
		memory = new Block[size];
		readCost = 0;
		writeCost = 0;
		
		evict = new SimpleEviction();
	}

	@Override
	public Block read(int block) {
		memory[block].lastAccess = OS.TIME;
		return memory[block];
	}

	@Override
	public int write(Block block) {
		block.lastAccess = OS.TIME;
		int replace = evict.evict(memory);
		if(memory[replace] != null){
			// write to disk
		}
		memory[replace] = block;
		return replace;
	}
}