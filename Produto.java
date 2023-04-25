/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Escola
 */
public class Produto {
    private int id;
    private String nome;
    private String descrição;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(int id, String nome, String descrição, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.descrição = descrição;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produtos{" + "id=" + id + ", nome=" + nome + ", descri\u00e7\u00e3o=" + descrição + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }
    
}


   