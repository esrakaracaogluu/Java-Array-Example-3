
public class CamasirMakinesi extends BeyazEsya {
	private int yikamaKapasitesi;
	private String program;

	public CamasirMakinesi(int yikamaKapasitesi, String program, String renk, String cihazTipi, String enerjiSinifi,
			int guc) {
		super(renk, cihazTipi, enerjiSinifi, guc);
		this.yikamaKapasitesi = yikamaKapasitesi;
		this.program = program;
		this.setCihazTipi(cihazTipi);
		this.setEnerjiSinifi(enerjiSinifi);
		this.setGucWatt(guc);
		this.setRenk(renk);

	}

	public int getYikamaKapasitesi() {
		return yikamaKapasitesi;
	}

	public void setYikamaKapasitesi(int yikamaKapasitesi) {
		this.yikamaKapasitesi = yikamaKapasitesi;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	@Override
	public String toString() {
		return "CamasirMakinesi [yikamaKapasitesi=" + yikamaKapasitesi + ", program=" + program + ", "
				+ super.toString() + "]";
	}

}
