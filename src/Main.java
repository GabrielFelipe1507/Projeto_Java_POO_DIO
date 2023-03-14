import br.com.dio.desafio.dominio.*;

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

    //    System.out.println(curso);
    //    System.out.println(curso2);
    //    System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        System.out.println("**********************************************************************");
        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos Gabriel: " + devGabriel.getConteudosInscritos());
        System.out.println("-");
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("Conteudos incritos Gabriel que ainda nao foram Concluidos: " + devGabriel.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Gabriel: " + devGabriel.getConteudosConcluidos());
        System.out.println("XP" + devGabriel.calcularTotalXp());

        System.out.println("**********************************************************************");
        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos Pedro: " + devPedro.getConteudosInscritos());
        System.out.println("-");
        devPedro.progredir();
        System.out.println("Conteudos incritos Pedro que ainda nao foram Concluidos: " + devPedro.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Pedro: " + devPedro.getConteudosConcluidos());
        System.out.println("XP" + devPedro.calcularTotalXp());
    }
}
