import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Java","Descrissão",100);
        Curso curso2 = new Curso("JavaScript","Descrissão",100);

        Mentoria mentoria = new Mentoria("mentoria","descrisao",LocalDate.now());

        /*System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
            */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);



        System.out.println("------");

        Devs devJonata = new Devs();
        devJonata.setNome("Jonata");
        devJonata.inscrever(bootcamp);
        System.out.println(""+devJonata.getConteudo());
        devJonata.progredir();
        System.out.println(""+devJonata.getConteudo());
        System.out.println(+devJonata.calcularTotalXp());
    }
}