package br.com.alura.comex;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TesteAPIDinamica {
    //Tarefa6-Semana5
    // OBJETIVO
    // Aplicar o conhecimento adquirido no treinamento e realizar consulta utilizando a classe HTTPCLIENT a uma API externa a nossa Aplicação.

    // Tarefa

    // Temos que realizar a consulta para uma API externa a nossa aplicação e imprimir o seu resultado (response.body) para comprovar que funcionou.
    // Usar uma classe de teste com o método Main para realizar essa operação.
    // Usar a classe HttpClient, HttpRequest e HttpResponse para realizar a consulta.
    // Usar uma classe de teste com o método Main para realizar essa operação.
    // Usar a classe HttpClient, HttpRequest e HttpResponse para realizar a consulta.
    // Utilizaremos a seguinte uri: “https://fakestoreapi.com/products/1" como exemplo.
    // A URI agora é dinâmica - o valor é capturada pela leitura de dados (exercício 4).

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a URI para consulta da API Dinâmica: ");
        String endereco = leitura.nextLine();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        leitura.close();
        System.out.println("\nImprimindo resposta:\n");
        System.out.println("******************************************************************");
        System.out.println(response.body());
        System.out.println("******************************************************************");


    //TAREFA8-semana5
    //A partir do resultado do nosso resultado da consulta API externa devemos desserializar o JSON de retorno em um Objeto do JAVA.
    //OBS: Podemos criar uma Estrutura do Tipo Record inicialmente e converter o resultado da consulta para esse tipo e depois imprimir em uma classe teste.

    
    }



}
