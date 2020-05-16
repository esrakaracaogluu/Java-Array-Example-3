public class CepTelefonu extends Elektronik {
	private int hatSayisi;
	private String marka;

	public CepTelefonu(int hatSayisi, String marka, double cpuGHz, int ramGB, String ekranBoyutu, String cihazTipi,
			String enerjiSinifi, int guc) {
		super(ekranBoyutu, cpuGHz, ramGB, cihazTipi, enerjiSinifi, guc);
		this.hatSayisi = hatSayisi;
		this.marka = marka;
		this.setEkranBoyutu(ekranBoyutu);
		this.setCpuGHz(cpuGHz);
		this.setRamGB(ramGB);
		this.setCihazTipi(cihazTipi);
		this.setEnerjiSinifi(enerjiSinifi);
		this.setGucWatt(guc);
	}

	public int getHatSayisi() {
		return hatSayisi;
	}

	public void setHatSayisi(int hatSayisi) {
		this.hatSayisi = hatSayisi;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	@Override
	public String toString() {
		return "CepTelefonu [hatSayisi=" + hatSayisi + ", marka=" + marka + ", " + super.toString() + "]";
	}

}