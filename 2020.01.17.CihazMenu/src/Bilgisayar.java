
public class Bilgisayar extends Elektronik {
	private int disk;
	private String kasa;

	public Bilgisayar(int disk, String kasa,  double cpuGHz, int ramGB,String ekranBoyutu, String cihazTipi,
			String enerjiSinifi, int guc) {
		super(ekranBoyutu, cpuGHz, ramGB, cihazTipi, enerjiSinifi, guc);
		this.disk = disk;
		this.kasa = kasa;
		this.setEkranBoyutu(ekranBoyutu);
		this.setCpuGHz(cpuGHz);
		this.setRamGB(ramGB);
		this.setCihazTipi(cihazTipi);
		this.setEnerjiSinifi(enerjiSinifi);
		this.setGucWatt(guc);

	}

	@Override
	public String toString() {
		return "Bilgisayar [disk=" + disk + ", kasa=" + kasa + ", " + super.toString() + "]";
	}

}
