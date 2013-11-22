package resources;

import java.util.HashMap;
import java.util.Vector;

public class ResourceManager {
	
	// Size Limit
	int vmSize;
	
	HashMap<Integer, Integer> vm;
	Storage memory;
	Storage disk;

	public ResourceManager(int disk, int pm, int vm) {
		vmSize = vm;
		
		this.vm = new HashMap<Integer, Integer>();
		this.memory = new Memory(pm);
		this.disk = new EasyDisk(disk);
	}
	
	public int needs(Vector<Integer> resources){
		int faults = 0;
		
		for(Integer block : resources){
			if(vm.containsKey(block)){
				if(vm.get(block) == null){
					faults++;
					Block page = disk.read(block);
					int mapping = memory.write(page);
					vm.put(block, mapping);
				}
				else{
					memory.read(vm.get(block));
				}
			}
			else if(vm.size() < vmSize){
				faults++;
				Block page = disk.read(block);
				int mapping = memory.write(page);
				vm.put(block, mapping);
			}
			else{
				// THIS MEANS THERE IS NO ADDRESSABLE SPACE LEFT
			}
		}
		
		return faults;
	}
	
}
