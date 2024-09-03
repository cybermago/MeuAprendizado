package me.dio.academia.digital.unidade;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.repository.AlunoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@SpringBootTest
public class AlunoRepositoryTest {

    @Autowired
    private AlunoRepository alunoRepository;

    @BeforeEach
    void setUp() {
        alunoRepository.deleteAll();
    }

    @Test
    void testFindByDataDeNascimento() {
        Aluno aluno = new Aluno(null, "João", "12345678901", "Centro", LocalDate.of(2000, 1, 1), null);
        alunoRepository.save(aluno);

        List<Aluno> alunos = alunoRepository.findByDataDeNascimento(LocalDate.of(2000, 1, 1));
        assertEquals(1, alunos.size());
        assertEquals("João", alunos.get(0).getNome());
    }
}
