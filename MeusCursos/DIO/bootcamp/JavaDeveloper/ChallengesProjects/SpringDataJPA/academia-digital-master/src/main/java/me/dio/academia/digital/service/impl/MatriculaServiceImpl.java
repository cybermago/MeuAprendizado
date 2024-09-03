package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.MatriculaRepository;
import me.dio.academia.digital.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

  private final MatriculaRepository matriculaRepository;
  private final AlunoRepository alunoRepository;

  @Autowired
  private MatriculaServiceImpl (MatriculaRepository matriculaRepository, AlunoRepository alunoRepository){
    this.matriculaRepository = matriculaRepository;
    this.alunoRepository = alunoRepository;
  }

  @Override
  public Matricula create(MatriculaForm form) {

    //Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
    Optional<Aluno> alunoOptional = alunoRepository.findById(form.getAlunoId());

    if(!alunoOptional.isPresent()){
      throw new IllegalArgumentException("Aluno"+form.getAlunoId()+"não encontrado");
    }

    Aluno aluno = alunoOptional.get();

    if(matriculaRepository.existsByAluno(aluno)){
          throw  new IllegalArgumentException("ALuno já matriculado");
    }

    Matricula matricula = new Matricula(aluno);
    return matriculaRepository.save(matricula);
  }

  @Override
  public Matricula get(Long id) {
    return null;
  }

  @Override
  public List<Matricula> getAll(){
    return matriculaRepository.findAll();
  }

  @Override
  public List<Matricula> getAll(String bairro) {

    if(bairro == null){
      return matriculaRepository.findAll();
    }else{
      return matriculaRepository.findAlunosMatriculadosBairro(bairro);
    }

  }

  @Override
  public void delete(Long id) {}



}
