import br.com.dio.desafio.dominio.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Devs devJonata = new Devs();
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição");

        List<Curso> cursos = new ArrayList<>();
        List<Mentoria> mentorias = new ArrayList<>();

        // Entrada de cursos pelo usuário
        System.out.println("Quantos cursos deseja adicionar?");
        int numCursos = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < numCursos; i++) {
            System.out.println("Digite o nome do curso:");
            String nomeCurso = sc.nextLine();
            System.out.println("Digite a descrição do curso:");
            String descricaoCurso = sc.nextLine();
            System.out.println("Digite a carga horária do curso:");
            int cargaHoraria = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha

            try {
                Curso curso = new Curso(nomeCurso, descricaoCurso, cargaHoraria);
                cursos.add(curso);
                bootcamp.getConteudos().add(curso);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro na criação do curso: " + e.getMessage());
            }
        }

        // Entrada de mentorias pelo usuário
        System.out.println("Quantas mentorias deseja adicionar?");
        int numMentorias = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < numMentorias; i++) {
            System.out.println("Digite o nome da mentoria:");
            String nomeMentoria = sc.nextLine();
            System.out.println("Digite a descrição da mentoria:");
            String descricaoMentoria = sc.nextLine();

            try {
                Mentoria mentoria = new Mentoria(nomeMentoria, descricaoMentoria, LocalDate.now());
                mentorias.add(mentoria);
                bootcamp.getConteudos().add(mentoria);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro na criação da mentoria: " + e.getMessage());
            }
        }

        // Inscrição e progresso do dev
        devJonata.setNome("Jonata");
        devJonata.inscrever(bootcamp);

        System.out.println("Conteúdos inscritos: " + devJonata.getConteudo());

        try {
            devJonata.progredir();
            System.out.println("Conteúdos restantes: " + devJonata.getConteudo());
            System.out.println("XP total: " + devJonata.calcularTotalXp());
        } catch (IllegalStateException e) {
            System.out.println("Erro ao tentar progredir: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Erro no cálculo do XP: " + e.getMessage());
        }

        // Listar todos os cursos e mentorias adicionados
        System.out.println("Cursos adicionados:");
        for (Curso curso : cursos) {
            System.out.println(curso);
        }

        System.out.println("Mentorias adicionadas:");
        for (Mentoria mentoria : mentorias) {
            System.out.println(mentoria);
        }
    }
}
