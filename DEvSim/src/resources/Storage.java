package resources;

public interface Storage {

	Block read(int block);
	
	int write(Block block);
}
