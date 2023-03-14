package br.com.dio.desafio.dominio;

import java.time.LocalDate;
//aqui abaixo a classe "Mentoria" é filha da classe "Conteudo":
public class Mentoria extends Conteudo{
    private LocalDate data;
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    //construtor(s):
    public Mentoria() {
    }
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
               ", data=" + data +
                ", titulo=" + getTitulo() +
                ", descricao=" + getDescricao() +
                '}';
    }

}
