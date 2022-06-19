/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.listaEncadeada;

/**
 *
 * @author 03569198200
 */
public class testeLista {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        //lista.imprimir();
        lista.criarListaVazia();
        lista.inserir("Maria");
        lista.inserir("Maria");
        lista.inserir("Ana");

        lista.inserir("João");

        lista.imprimir();
        lista.buscar("Ana");
    }
}
