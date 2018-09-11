/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Nathan
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Produto> list = new ArrayList<>();
        list.add(new Produto("TV", 900.00));
        list.add(new Produto("Notebook", 1200.00));
        list.add(new Produto("Tablet", 450.00));
        list.add(new Produto("Mouse", 50.00));

        //Comparator
        list.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));

        list.forEach(System.out::println);

        System.out.println("*****************************");

        //Consumer
        //Realizam alguma operação e não tem nenhum tipo de retorno
        //aumenta o preço em 10%
        list.forEach(p -> p.setPreco(p.getPreco() * 1.1));

        list.forEach(System.out::println);
        
        System.out.println("*****************************");
        
        //Predicate
        //verifica a condição e retorna um booleano
        //remover os produtos que iniciam com o caracter 't'
        list.removeIf(p -> p.getNome().charAt(0) == 'T');
        list.forEach(System.out::println);
        System.out.println("*****************************");
        
        //Function
        //transformar o list em stream, e a função map aplica uma function 
        //em todos os elementos
        List<String> nomes = list.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());
        nomes.forEach(System.out::println);
        
    }

}
