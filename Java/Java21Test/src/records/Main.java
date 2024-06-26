/**
 * 
 */
package records;
import records.Automovel;
import records.Carro;
import records.Moto;

import java.lang.invoke.VarHandle;
import java.util.Random;
import java.util.UUID;

/**
 * 
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Object automovel = createAutomovel();
		
		if(automovel instanceof Carro carro) {
			enviaParaODetran(carro.chassi());
		}
		
		var retornoChassi = switch (automovel) {
		case Automovel o when o instanceof Carro c -> c.chassi();
		case Carro c -> {
			validarCarroca(c.carroca());
			yield c.chassi();
		}
		case Moto(UUID chassi) -> chassi;
		default -> "chassi default";
		};
	}
	
	private static void validarCarroca() {
		System.out.println("validando");
	}
	
		private static void enviaParaODetran(UUID chassi) {
			System.out.println("E o um caro");
			System.out.printf("enviando para o detran a o chassi%s",chassi);
		}*/
	
		/*public static Automovel createAutomovel() {
			Random random = new Random();
			int value = random.nexInt(0, 5);

			if (value % 2 == 0)
				//return new Carro(UUID.randomUUID(),carroca, false);
				//else
				return new Moto(UUID.randomUUID());
			}
		}
*/
	}}