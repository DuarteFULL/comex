package br.com.alura.comex.API;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class TesteAPI {
    //Tarefa5 Semana5
    // Temos que realizar a consulta para uma API externa a nossa aplicação e imprimir o seu resultado (response.body) para comprovar que funcionou.

    // - Usar uma classe de teste com o método Main para realizar essa operação.
    // - Usar a classe HttpClient, HttpRequest e HttpResponse para realizar a consulta.

    //Usar uma classe de teste com o método Main para realizar essa operação.
    //Usar a classe HttpClient, HttpRequest e HttpResponse para realizar a consulta.
    //Utilizaremos a seguinte uri: “https://fakestoreapi.com/products/1" como exemplo.
    public static void main(String[] args) throws IOException, InterruptedException {

        String endereco = "https://fakestoreapi.com/products/1";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    };

}
