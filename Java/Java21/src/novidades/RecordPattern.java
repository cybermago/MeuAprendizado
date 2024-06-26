/**
 * 
 */
package novidades;

/**
 * 
 */
public record RecordPattern() {
	
	Ponto ponto = new Ponto(1,20);
	FormaGeometrica formaGeometrica = new Circulo(ponto, 20);
	
	if(formaGeometrica intanceof Circulo(var pontoCirculo, var radius)) {
		System.out.printf("a forma eh um circulo com radius %s",radius);
	}

}
