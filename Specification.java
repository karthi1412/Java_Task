package sample;

public class Specification {
	
	private int ram;
	private int rom;
	
	public Specification(int ram, int rom) {
		super();
		this.ram = ram;
		this.rom = rom;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}

	@Override
	public String toString() {
		return "Specification [ram=" + ram + ", rom=" + rom + "]";
	}
	
	
	
	
}
