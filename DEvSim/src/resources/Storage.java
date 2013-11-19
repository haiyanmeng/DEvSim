package resources;

public interface Storage {

	Block read(int block);
	
	void write(int loc, Block block);
}
