package estudo.cap03.ex03_14;

public class DataTest {

	public static void main(String[] args) {

		Data data = new Data(25, 02, 2018);
		
		System.out.print("A data inicial é: ");
	      data.mostrarData();
	      
	   // mudar a data
	      data.setDia(01);
	      data.setMes(8);
	      data.setAno(2020);
	      
	      System.out.printf("%nNova data é: ");
	      data.mostrarData();

	      System.out.println(); 
		
	}

}
