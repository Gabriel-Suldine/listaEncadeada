/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.listaEncadeada;

/**
 *
 * @author 03569198200
 */
public class ListaEncadeada {

    Celula primeiro;
    Celula ultimo;

    void criarListaVazia() {
        primeiro = new Celula();
        ultimo = primeiro;
        primeiro.proximo = null;
    }

    boolean estaVazia() {
        return primeiro == ultimo;
    }

    void inserir(String item) {
        Celula celula = new Celula();
        celula.item = item;
        celula.proximo = null;
        ultimo.proximo = celula;
        ultimo = celula;
    }

    Celula buscar(String valor) {
        if (!estaVazia()) {
            Celula aux = primeiro;
            while (aux.proximo != null) {
                if (valor.equals(aux.proximo.item)) { // equals substitui o ==
                    return aux;
                }
                aux = aux.proximo;
            }

        }
        return null;
    }
    
    
    void retirar (String valor){
        Celula celula = buscar(valor);
        if (celula == null){
            System.out.println("Valor não existe!");
        } else{
        
        
        }
    
    }

    void imprimir() {

        if (estaVazia()) {
            System.out.println("Lista Vazia");
        } else {
            Celula aux = primeiro;
            while (aux.proximo != null) { //só imprime quando for verdade
                System.out.println(aux.proximo.item);
                aux = aux.proximo;
            }
        }

    }

}
