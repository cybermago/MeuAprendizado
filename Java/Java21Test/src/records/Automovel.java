/**
 * 
 */
package records;

import java.util.UUID;

/**
 * 
 */
public sealed interface Automovel permits Carro, Moto{
	UUID chassi();
}