/**
 * 
 */
package records;

import java.util.UUID;

/**
 * 
 */
public interface Automovel  permits Carro, Moto{
	UUID chassi();
}