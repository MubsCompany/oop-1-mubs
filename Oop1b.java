package oop1a;

public class Oop1b {
	
public static void main(String[] args) {
	//membuat object mobil remote
	Mobil mobil = new Mobil();
	
	//mengisi atribut di class mobil
			mobil.engineStart = true;
			mobil.carBattrey = 25;
			mobil.jarak = 5;
			mobil.remoteBattrey = 10;
			mobil.speed = 10;
			
			mobil.mesin();
}
}
