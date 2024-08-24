package exerciciospropostos.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TemperaturaMedia {
    public static void main(String[] args) {
        List<TemperaturaMedia> temps = new ArrayList<>(){{
            add(new TemperaturaMedia("Janeiro",35.0));
            add(new TemperaturaMedia("Fevereiro",27.8));
            add(new TemperaturaMedia("Maio",32.3));
            add(new TemperaturaMedia("Março",24.9));
            add(new TemperaturaMedia("Abril",28.9));
            add(new TemperaturaMedia("Junho",31.2));

        }};

        Iterator<TemperaturaMedia> iterator = temps.iterator();
        int count =0;
        double soma = 0d;
        double media = 0d;
        while (iterator.hasNext()){
            double next;
            TemperaturaMedia temp = iterator.next();
            soma += temp.getTemp();
            count++;
        }
        media = soma / count;
        //for (Temp temp : temps) soma += temp;
        System.out.println("\nTemperaturas:\n"+temps);
        System.out.println("Média: "+media);
        // Exibir temperaturas acima da média
        System.out.println("Temperaturas acima da média:");

        for (TemperaturaMedia temp : temps) {
            if (temp.getTemp() > media) {
                System.out.print(temp.getMes() + ": " + temp.getTemp() + " / ");
            }
        }

    }
    private String mes;
    private double temp;

    public TemperaturaMedia(String mes, double temp) {
        this.mes = mes;
        this.temp = temp;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return mes + ": " + temp;
    }
}
