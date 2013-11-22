package resources;

public class EasyDisk implements Storage {
	
	private int cost;

	public EasyDisk(int size) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Block read(int block) {
		// TODO Auto-generated method stub
		return new Block();
	}

	@Override
	public int write(Block block) {
		// TODO Auto-generated method stub
		return 0;
	}

}
