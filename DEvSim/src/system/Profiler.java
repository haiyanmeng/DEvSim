package system;

public class Profiler {

	// TIME VARIABLES
	private long cpu;
	private long idle;
    private long read;
    
    // ACCESS COUNTS
	private long diskAccess;
	private long pageFaults;
	
	public Profiler() {
		
		cpu = 0;
		idle = 0;
		read = 0;
		diskAccess = 0;
		pageFaults = 0;
				
	}

	public long getCpuTime() {
		return cpu;
	}

	public void incrementCpuTime(long cpu) {
		this.cpu = cpu;
	}

	public long getIdleTime() {
		return idle;
	}

	public void incrementIdleTime(long idle) {
		this.idle = idle;
	}

	public long getReadTime() {
		return read;
	}

	public void incrementReadTime(long read) {
		this.read = read;
	}

	public long getDiskAccess() {
		return diskAccess;
	}

	public void incrementDiskAccess() {
		this.diskAccess++;
	}

	public long getPageFaults() {
		return pageFaults;
	}

	public void incrementPageFaults() {
		this.pageFaults++;
	}
	
}
