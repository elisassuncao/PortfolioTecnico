/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinalbancolivros;

/**
 *
 * @author elisa_assuncao
 */
public class Ler {
    String cod_ler;
    String nota_esperada;
    String expectativa;
    String isbn_ler;

    public Ler(String cod_ler, String nota_esperada, String expectativa, String isbn_ler) {
        this.cod_ler = cod_ler;
        this.nota_esperada = nota_esperada;
        this.expectativa = expectativa;
        this.isbn_ler = isbn_ler;
    }

    public String getCod_ler() {
        return cod_ler;
    }

    public void setCod_ler(String cod_ler) {
        this.cod_ler = cod_ler;
    }

    public String getNota_esperada() {
        return nota_esperada;
    }

    public void setNota_esperada(String nota_esperada) {
        this.nota_esperada = nota_esperada;
    }

    public String getExpectativa() {
        return expectativa;
    }

    public void setExpectativa(String expectativa) {
        this.expectativa = expectativa;
    }

    public String getIsbn_ler() {
        return isbn_ler;
    }

    public void setIsbn_ler(String isbn_ler) {
        this.isbn_ler = isbn_ler;
    }

}
