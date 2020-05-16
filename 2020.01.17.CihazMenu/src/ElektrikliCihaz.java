
public class ElektrikliCihaz {
	private String enerjiSinifi;
	private String cihazTipi;// tv,pc,telefon,buzdolab�
	private int gucWatt;
	private int gelirimVolt = 220;

	private char currentStatus = 'K';// "A" , "K"

	public String getEnerjiSinifi() {
		return enerjiSinifi;
	}

	public void setEnerjiSinifi(String enerjiSinifi) {
		this.enerjiSinifi = enerjiSinifi;
	}

	public String getCihazTipi() {
		return cihazTipi;
	}

	public void setCihazTipi(String cihazTipi) {
		this.cihazTipi = cihazTipi;
	}

	public int getGucWatt() {
		return gucWatt;
	}

	public void setGucWatt(int gucWatt) {
		this.gucWatt = gucWatt;
	}

	public int getGelirimVolt() {
		return gelirimVolt;
	}

	public char getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(char currentStatus) {
		this.currentStatus = currentStatus;
	}

	public void ac() {
		if (currentStatus == 'A')
			System.out.println("Cihaz zaten a��k.");
		else {
			currentStatus = 'A';
			System.out.println("Cihaz a��ld�.");
		}
	}

	public void kapat() {
		if (currentStatus == 'K') {
			System.out.println("Cihaz zaten kapal�.");
		} else {
			currentStatus = 'K';
			System.out.println("Cihaz kapand�.");

		}

	}

	@Override
	public String toString() {
		return "ElektrikliCihaz [enerjiSinifi=" + enerjiSinifi + ", cihazTipi=" + cihazTipi + ", gucWatt=" + gucWatt
				+ ", gelirimVolt=" + gelirimVolt + ", currentStatus=" + currentStatus + "]";
	}
	
}