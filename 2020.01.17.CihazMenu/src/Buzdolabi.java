
public class Buzdolabi extends BeyazEsya {
	private int icHacim;

	public Buzdolabi(int icHacim, String renk, String cihazTipi, String enerjiSinifi, int guc) {
		super(renk, cihazTipi, enerjiSinifi, guc);
		this.icHacim = icHacim;
		this.setCihazTipi(cihazTipi);
		this.setEnerjiSinifi(enerjiSinifi);
		this.setGucWatt(guc);
		this.setRenk(renk);

	}

	public int getIcHacim() {
		return icHacim;
	}

	public void setIcHacim(int icHacim) {
		this.icHacim = icHacim;
	}

	@Override
	public String toString() {
		return "Buzdolabi [icHacim=" + icHacim + ", " + super.toString() + "]";
	}

}
