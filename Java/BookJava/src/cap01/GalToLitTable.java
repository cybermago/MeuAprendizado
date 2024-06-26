/**Tente isto 1-2
 * 
 */
package cap01;

/**
 * Este programa exibe uma tabela de converões de polegadas 
 */
public class GalToLitTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pol, metro;
		int i;
		
		i=0;
		for(pol=1; pol<=12; pol++){
			metro = pol / 39.37; //converte polegadas em metros
			System.out.println(pol + " polegadas " + metro+" metros");
			
			i++;
			//a cada decima linha, exibe uma linha em branco
			if(i==12) {
				System.out.println();
				i=0; //zera o contador de linhas
			}
		}
	}
}
