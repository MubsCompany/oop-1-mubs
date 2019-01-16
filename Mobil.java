package oop1a;

public class Mobil {
	//Attribut
	boolean engineStart;
	int carBattrey;
	int speed;
	int remoteBattrey;
	int jarak;
	
	void mesin() {
		if (engineStart) {
			System.out.println("Jangan lupa baca do'a");
			BatrayMobil();
		} else {
			
		}
	}
	
	//Menjelaskan batray mobil apakah daya cukup atau tidak
	void BatrayMobil() {	
		if (carBattrey <= 5) {
			System.out.println("Batray mobil lemah, mobil tidak dapat berjalan.");
			
		} else if (carBattrey >= 16) {
			System.out.println("Hati-hati dijalan.");
			Kecepatan();
			BatrayRemot();
		}
	}
	
	//Menjelaskan batray remote apakah daya cukup atau tidak
	void BatrayRemot() {
		if (remoteBattrey >= 20) {
			System.out.println("batray remote lemah segera cars remote.");
			
		} else if (remoteBattrey == 100) {
			System.out.println("Batray remote terisi penuh");
		} else {
			System.out.println("Batray remote cukup.");
			Kecepatan();
		}
	}
	
	//Memberikan peringatan jika kecepatan telah mencapai kecepatan maksimum
		void Kecepatan() {
			if (speed >= 30) {
				System.out.println("Kecepatan tinggi, hati-hati.");
			}else if (speed == 0) {
				System.out.println("Jika dalam 3 menit tidak menerima perintah maka sistem akan mematikan daya otomatis.");
			} else {
				System.out.println("Kecepatan standar, bila mengantuk istirahatlah terlebih dahulu.");
				Jarakk();
			}
		}	
		
		
	//Memberitahu jarak mobil
		void Jarakk() {
			if (jarak <= 20) {
				System.out.println("Jarak masih dalam jangkawan.");
			} else if (jarak == 17) {
				System.out.println("Mobil terlalu jauh, 3 meter lagi mobil diluar jangkawan dan tidak bisa menerima sinyal.");
			} else if (jarak >= 20) {
				System.out.println("Mobil diluar jangkawan, tidak dapat menerima sinyal.");
			}
		}
		
		
	
	
	

}
