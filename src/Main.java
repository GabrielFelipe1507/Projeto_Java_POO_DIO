import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //apartir da palavra new que agente instancia o objeto:
        Curso curso = new Curso();
        curso.setTitulo("curso java");
        curso.setDescricao("descriçao do curso java");
        curso.setCargaHoraria(8);

        //criando outro curso(curso 2):
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descriçao do curso js");
        curso2.setCargaHoraria(4);

        //criando e instanciando a classe mentoria:
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
