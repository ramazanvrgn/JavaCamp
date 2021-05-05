package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu="Ýnternet Þubesi";
		double dolarDun=8.5;
		double dolarBugun=8.32;
		int vade=48;
		boolean dustuMu =true;
		System.out.println(internetSubeButonu);

		if(dolarBugun>dolarDun) {
			System.out.println("Dolar düþtü resmi");
		}
		
		String kredi1="Hýzlý Kredi";
		String kredi2="MUtlu emeklilik kredisi";
		String kredi3="Konut Kredisi";
		String kredi4="Çiftçi Kredisi";
		String kredi5="Msb Kredisi";
		String kredi6="Meb Kredisi";
		
		String[] krediler = {
				kredi1,
				kredi2,
				kredi3,
				kredi4,
				kredi5,
				kredi6				
		};
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		
		System.out.println();
		for(int i = 0; i<krediler.length;i++) {
			
			System.out.println(krediler[i]);
		}
		
		
	}

}
