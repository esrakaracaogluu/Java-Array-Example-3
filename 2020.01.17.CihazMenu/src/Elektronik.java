
public class Elektronik extends ElektrikliCihaz {

	private String ekranBoyutu;
	private double cpuGHz;
	private int ramGB;

	public String getEkranBoyutu() {
		return ekranBoyutu;
	}

	public void setEkranBoyutu(String ekranBoyutu) {
		this.ekranBoyutu = ekranBoyutu;
	}

	public double getCpuGHz() {
		return cpuGHz;
	}

	public void setCpuGHz(double cpuGHz) {
		this.cpuGHz = cpuGHz;
	}

	public int getRamGB() {
		return ramGB;
	}

	public void setRamGB(int ramGB) {
		this.ramGB = ramGB;
	}

	public Elektronik(String ekranBoyutu, double cpuGHz, int ramGB, String cihazTipi, String enerjiSinifi, int guc) {
		super();
		this.ekranBoyutu = ekranBoyutu;
		this.cpuGHz = cpuGHz;
		this.ramGB = ramGB;
		this.setCihazTipi(cihazTipi);
		this.setEnerjiSinifi(enerjiSinifi);
		this.setGucWatt(guc);
	}

	@Override
	public String toString() {
		return "Elektronik [ekranBoyutu=" + ekranBoyutu + ", cpuGHz=" + cpuGHz + ", ramGB=" + ramGB + ", "
				+ super.toString() + "]";
	}

	
	
	
	/*@Override
	public String toString() {
		return "Elektronik  [ElektrikliCihaz[" + this.getCihazTipi() + " " + this.getEnerjiSinifi() + " "
				+ this.getGucWatt() + " " + "[ekranBoyutu=" + ekranBoyutu + ", cpuGHz=" + cpuGHz + ", ramGB=" + ramGB
				+ "]";
	}*/

}
