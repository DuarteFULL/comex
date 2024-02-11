package br.com.alura.comex;

public record RecordTitulo(String title, String description, double price) {
    //TAREFA8-semana5
    //A partir do resultado do nosso resultado da consulta API externa devemos desserializar o JSON de retorno em um Objeto do JAVA.
    //OBS: Podemos criar uma Estrutura do Tipo Record inicialmente e converter o resultado da consulta para esse tipo e depois imprimir em uma classe teste.
    // Utilizaremos a seguinte uri: “https://fakestoreapi.com/products/1" como exemplo.
    //{"id":1,"title":"Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops","price":109.95,"description":"Your perfect pack for everyday use and walks in the forest. Stash your laptop 
    //(up to 15 inches) in the padded sleeve, your everyday","category":"men's clothing","image":"https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg","rating":{"rate":3.9,"count":120}}
}
