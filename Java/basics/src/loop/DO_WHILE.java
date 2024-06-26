package loop;
public class DO_WHILE{

	public static void main(String[] args) {
		int i;
		int j;
		boolean result=false;
		int[][] array= {{1,2,3,4,5},{10,20,30,40,50}};
		int[][] arrayb= {{100,200,300,400,500},{1000,2000,3000}};
		int linhas = array.length;
		int colunas = array[0].length;
		
		do {
			for(i=0; i<linhas; i++) {
			for(j=0; j<colunas; j++) {
				System.out.println(array[i][j]);
			}
			}
		}while(result);
	}
}