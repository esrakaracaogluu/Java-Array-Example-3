
public class BulasikMakinesi extends BeyazEsya {

	private String program;

	public BulasikMakinesi(String program, String renk, String cihazTipi, String enerjiSinifi, int guc) {
		super(renk, cihazTipi, enerjiSinifi, guc);
		this.program = program;
		this.setCihazTipi(cihazTipi);
		this.setEnerjiSinifi(enerjiSinifi);
		this.setGucWatt(guc);
		this.setRenk(renk);

	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	@Override
	public String toString() {
		return "BulasikMakinesi [program=" + program + ", " + super.toString() + "]";
	}

}
