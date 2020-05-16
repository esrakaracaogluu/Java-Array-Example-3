import java.util.Scanner;

public class ElektrikliCihazApp {
	static Scanner input = new Scanner(System.in);
	static ElektrikliCihaz[] cihazlarim = new ElektrikliCihaz[50];// array adresini tutuyor burasý sadece

	static int cihazCount = 0;

	public static void main(String[] args) {

		int islem = 0;

		while (islem != 4) {
			islem = menu();

			switch (islem) {
			case 1:
				System.out.println("Cihaz ekliyoruz...");

				cihazEkle();

				break;

			case 2:
				System.out.println("Cihaz listeliyoruz...");
				cihazListele();
				break;
			case 3:
				System.out.print("Hangi cihaz tipleri:\n");
				System.out.println("1.Çamaþýr Makinesi\n" + "2.Bulaþýk Makinesi\n" + "3.Buzdolabý\n" + "4.Bilgisayar\n"
						+ "5.Cep Telefonu\n");
				String cihazTipi = input.next();
				cihazListeleFiltreli(cihazTipi);
				break;
			case 4:
				System.out.println("Güle güle...");
				break;
			}

		}
	}

	private static void cihazListele() {
		for (int i = 0; i < cihazCount; i++) {
			System.out.println((i + 1) + ".cihaz:" + cihazlarim[i]);
		}
	}

	private static void cihazListeleFiltreli(String cihazTipi) {
		System.out.println(cihazTipi + " cihaz tipindeki cihazlar");
		for (int i = 0; i < cihazCount; i++) {
			if (cihazlarim[i].getCihazTipi().equals(cihazTipi))
				System.out.println(i + ".cihaz:" + cihazlarim[i].toString());
		}
	}

	private static void cihazEkle() {
		ElektrikliCihaz cihaz;
		// input.nextLine();
		System.out.print("Cihaz tipi: \n");
		System.out.print("1.Camaþýr Makinesi\n" + "2.Bulaþýk Makinesi\n" + "3.Buzdolabý\n" + "4.Bilgisayar\n"
				+ "5.Cep Telefonu\n");
		String cihazTipi = input.next();

		System.out.print("Enerji Sýnýfý (A,A+,B,B+,C,C):");
		String enerjiSinifi = input.next();

		System.out.print("Güç (watt):");
		int gucWatt = input.nextInt();

		System.out.print("Sinif: \n");
		System.out.println("1.BeyazEsya\n" + "2.Elektronik");
		String sinif = input.next();

		if (sinif.equals("1")) {
			System.out.print("Beyaz Eþya: \n");
			System.out.print("Renk: ");
			String renk = input.next();

			if (cihazTipi.equals("1")) {
				System.out.print("Yýkama kapasitesi giriniz: ");
				int yikamaKapasitesi = input.nextInt();

				System.out.print("Program giriniz: ");
				String program = input.next();

				cihaz = new CamasirMakinesi(yikamaKapasitesi, program, renk, cihazTipi, enerjiSinifi, gucWatt);
				cihazlarim[cihazCount++] = cihaz;
			} else if (cihazTipi.equals("2")) {
				System.out.print("Program giriniz: ");
				String program = input.next();

				cihaz = new BulasikMakinesi(program, renk, cihazTipi, enerjiSinifi, gucWatt);
				cihazlarim[cihazCount++] = cihaz;
			} else if (cihazTipi.equals("3")) {
				System.out.print("Ýç hacim giriniz: ");
				int icHacim = input.nextInt();

				cihaz = new Buzdolabi(icHacim, renk, cihazTipi, enerjiSinifi, gucWatt);
				cihazlarim[cihazCount++] = cihaz;
			}

		} else if (sinif.equals("2")) {
			System.out.print("Ekran boyutu : ");
			String ekranBoyutu = input.next();

			System.out.print("CPU(GHz): ");
			double cpuGHz = input.nextDouble();

			System.out.print("RAM(GB): ");
			int ramGB = input.nextInt();

			if (cihazTipi.equals("4")) {
				System.out.print("Disk giriniz: ");
				int disk = input.nextInt();

				System.out.print("Kasa giriniz: ");
				String kasa = input.next();

				cihaz = new Bilgisayar(disk, kasa, cpuGHz, ramGB, ekranBoyutu, cihazTipi, enerjiSinifi, gucWatt);
				cihazlarim[cihazCount++] = cihaz;
			} else if (cihazTipi.equals("5")) {
				System.out.print("Hat sayýsý giriniz: ");
				int hatSayisi = input.nextInt();

				System.out.print("Marka giriniz: ");
				String marka = input.next();

				cihaz = new CepTelefonu(hatSayisi, marka, cpuGHz, ramGB, ekranBoyutu, cihazTipi, enerjiSinifi, gucWatt);
				cihazlarim[cihazCount++] = cihaz;

			}
		}

	}

	static int menu() {
		System.out.println("1.Cihaz ekle");
		System.out.println("2.Listele");
		System.out.println("3.Filtreli Listele");
		System.out.println("4.Çýkýþ");

		System.out.print("Seçiminiz: ");
		int secim = input.nextInt();
		return secim;// girilen secimi alýp bana döndürüyor

	}

}
