package me.dio.academia.digital.integration;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.repository.AlunoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)
public class AlunoRepositoryIntegrationTest {

    @Autowired
    private AlunoRepository alunoRepository;

    @Test
    void testFindByDataDeNascimento() {
        Aluno aluno = new Aluno(null, "João", "12345678901", "Centro", LocalDate.of(2000, 1, 1), null);
        alunoRepository.save(aluno);

        List<Aluno> alunos = alunoRepository.findByDataDeNascimento(LocalDate.of(2000, 1, 1));
        assertEquals(1, alunos.size());
        assertEquals("João", alunos.get(0).getNome());
    }

    @Test
    void testCreateAlunoCallsSave() {
        AlunoForm form = new AlunoForm("João", "12345678901", "Centro", LocalDate.of(2000, 1, 1));
        alunoService.create(form);

        verify(alunoRepository).save(any(Aluno.class));
    }
}
