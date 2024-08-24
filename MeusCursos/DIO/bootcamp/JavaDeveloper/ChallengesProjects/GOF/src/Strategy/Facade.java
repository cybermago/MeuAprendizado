package Strategy;

import subsystem.Subsystem2;

public class Facade {

    public void migrar(String nome,String cep){
        String cidade = Subsystem2.getInstancy().cidade();
        String name = Subsystem2.getInstancy().name();
    }
}
