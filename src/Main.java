import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

        //criando e instanciando a classe Mentoria:
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        //mexendo com Polimorfismo:
        //aqui abaixo tudo que eu tenho em conteudo eu tenho em curso mais nem tudo que eu tenho em curso
        //eu tenho em conteudo
        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();
        //aqui no caso do List e ArrayList é a mesma coisa:
        List<String> palavras = new ArrayList<>();

        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
