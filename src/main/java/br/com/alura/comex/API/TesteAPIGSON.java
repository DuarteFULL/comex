package br.com.alura.comex.API;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.comex.records.RecordTitulo;
import br.com.alura.comex.services.Produto;

public class TesteAPIGSON {

    //TAREFA8-semana5
    //A partir do resultado do nosso resultado da consulta API externa devemos desserializar o JSON de retorno em um Objeto do JAVA.
    //OBS: Podemos criar uma Estrutura do Tipo Record inicialmente e converter o resultado da consulta para esse tipo e depois imprimir em uma classe teste.
    // Utilizaremos a seguinte uri: “https://fakestoreapi.com/products/1" como exemplo.
    //{"id":1,"title":"Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops","price":109.95,"description":"Your perfect pack for everyday use and walks in the forest. Stash your laptop 
    //(up to 15 inches) in the padded sleeve, your everyday","category":"men's clothing","image":"https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg","rating":{"rate":3.9,"count":120}}

    public static void main(String[] args) throws IOException, InterruptedException {


        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a URI para consulta da API Dinâmica: ");
        String endereco = leitura.nextLine();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        leitura.close();

        String json = response.body();
        System.out.println("\nImprime JSON");
        System.out.println("**************************************");
        System.out.println(json);
        System.out.println("**************************************");

        Gson  gson = new GsonBuilder()
                        .create();

        RecordTitulo tituloAPI = gson.fromJson(json, RecordTitulo.class);
        System.out.println("\nImprime tituloAPI");
        System.out.println("**************************************");
        System.out.println(tituloAPI);
        System.out.println("**************************************");
        Produto tituloConvertido = new Produto(tituloAPI);
        System.out.println("\nTitulo já convertido");
        System.out.println("**************************************");
        System.out.println(tituloConvertido);
        System.out.println("**************************************");

    }

}
