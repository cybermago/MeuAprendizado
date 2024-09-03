package me.dio.academia.digital.unidade;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class AlunoServiceImplTest {

    @InjectMocks
    private AlunoServiceImpl alunoService;

    @Mock
    private AlunoRepository alunoRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateAluno() {
        AlunoForm form = new AlunoForm("João", "12345678901", "Centro", LocalDate.of(2000, 1, 1));
        Aluno aluno = new Aluno(1L, "João", "12345678901", "Centro", LocalDate.of(2000, 1, 1), Collections.emptyList());

        when(alunoRepository.save(aluno)).thenReturn(aluno);

        Aluno createdAluno = alunoService.create(form);
        assertEquals(aluno.getNome(), createdAluno.getNome());
    }

    @Test
    void testGetAllAlunos() {
        Aluno aluno = new Aluno(1L, "João", "12345678901", "Centro", LocalDate.of(2000, 1, 1), Collections.emptyList());
        when(alunoRepository.findByDataDeNascimento(LocalDate.of(2000, 1, 1))).thenReturn(Collections.singletonList(aluno));

        List<Aluno> alunos = alunoService.getAll("01/01/2000");
        assertEquals(1, alunos.size());
        assertEquals(aluno.getNome(), alunos.get(0).getNome());
    }

    @Test
    void testUpdateAluno() {
        Aluno alunoExistente = new Aluno(1L, "João", "12345678901", "Centro", LocalDate.of(2000, 1, 1), Collections.emptyList());
        AlunoForm formAtualizado = new AlunoForm("João Atualizado", "12345678901", "Centro", LocalDate.of(2000, 1, 1));

        when(alunoRepository.findById(1L)).thenReturn(java.util.Optional.of(alunoExistente));
        when(alunoRepository.save(alunoExistente)).thenReturn(alunoExistente);

        Aluno alunoAtualizado = alunoService.update(1L, formAtualizado);
        assertEquals("João Atualizado", alunoAtualizado.getNome());
    }
}
