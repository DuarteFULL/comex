package br.com.alura.comex;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.io.IOException;
//import java.math.BigDecimal;
//import java.math.RoundingMode;
import java.net.URISyntaxException;
import java.util.ArrayList;
//import java.util.List;
//import java.text.NumberFormat;
//import java.util.Arrays;
//import java.util.Locale;
import java.util.Scanner;

//import org.apache.commons.collections.functors.WhileClosure;

import br.com.alura.comex.services.Cliente;
import br.com.alura.comex.services.Endereco;
import br.com.alura.comex.services.ListaDeDesejos;
import br.com.alura.comex.services.Produto;

public class Main {

    //private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException, URISyntaxException {
        
        // Cria uma classe para efetuar a instanciação (Objeto) para manipular suas informações e apresente suas propriedades no console da sua IDE.
            
        Produto produto1 = new Produto("Produto10");
        Produto produto2 = new Produto("Produto20");
        Util util = new Util();

        System.out.println("*******************************");
        System.out.println("Imprime o objeto produto1");
        System.out.println(produto1.toString());
        System.out.println("*******************************");
        // util.equals(produto1,produto2);
        System.out.println("*******************************");
        System.out.println("Compara o nome dos objetos produto1 e produto2");
        System.out.print("produto1 e produto2 tem nomes: ");
        if (util.equals(produto1,produto2)) {
            System.out.println("Iguais");
        } else System.out.println("Diferentes");
        System.out.println("*******************************");


        // Exercicio 4
        produto1.imprimirProduto();

        // Exercício 5
        // Crie uma classe de teste para efetuar a criação desse objetos e criar a
        // associação entre eles.
        Cliente cliente1 = new Cliente();
        Endereco endereco1 = new Endereco();

        cliente1.setCPF("123.456.789-10");
        cliente1.setNome("Cliente Nome UM");
        cliente1.setEmail("cliente@gmail.com");
        cliente1.setProfissao("Desenvolvedor");
        cliente1.setTelefone("+55 11 3303 1121");
        endereco1.setBairro("Centro");
        endereco1.setCidade("São Paulo");
        endereco1.setEstado("SP");
        endereco1.setRua("Rua da Consolação");
        endereco1.setNumero(1122);;
        cliente1.setEndereco(endereco1);
        
        System.out.println("*******************************");
        System.out.println("Imprime o objeto cliente1 com seu endereço: ");
        System.out.println(cliente1);
        System.out.println("*******************************");
        System.out.println();
        System.out.println();


        // Exercício 7
        // Criar a obrigatoriedade na criação do Produto para que o usuário da aplicação forneça um nome.
        System.out.print("Entre com o nome do produto: ");
        Scanner entrada = new Scanner(System.in);
        String valor = entrada.nextLine();
        Produto produto3 = new Produto(valor);
        System.out.println("*******************************");
        System.out.println("Imprime o objeto produto3: ");
        System.out.println(produto3.toString());
        System.out.println("*******************************");


        // Exercicio 8
        // Crie uma classe de teste que instancie uma ListaDeDesejos e adicione alguns
        // produtos nela. Depois exiba a lista de desejos com o método imprimeProdutos.
        ListaDeDesejos desejos = new ListaDeDesejos();
        System.out.println("*******************************");
        System.out.println("*******************************");
        System.out.println("Vamos montar nossa lista de desejos.");
        System.out.println("Tarefa4-Semana5 Le e trata erros.");
       
        System.out.println();       
        

        //Tarefa4-Semana5 lendo do teclado e tratando erros.
        boolean feito = false;
        boolean continuar = true;
        int i = 0;
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        Scanner leitura = new Scanner(System.in);
        
        while (continuar) {   
            i++;
            System.out.println();             
            System.out.print("Digite o nome do produto desejado nº "+i+": ");
            //Scanner leitura = new Scanner(System.in);
            listaDeProdutos.add(new Produto(leitura.nextLine()));
            System.out.println(i+"º produto adicionado: "+listaDeProdutos.get(i-1).getNome());
            feito = false;
            while (!feito) {
                try {
                    System.out.println();
                    System.out.print("Selecione sua opção: \n1-Continuar \n2-Encerrar \nResposta: ");                    
                    Scanner leOpcao = new Scanner(System.in);
                    if (leOpcao.nextInt() == 2){
                        continuar = false;
                    }
                    feito = true;                    
                } catch (Exception e) {
                    System.out.println("Erro ao ler código, por favor informe a opção correta.");
                } 
            } 
            
        } 
        leitura.close();

        
        

        System.out.println();
        System.out.println("*******************************");
        System.out.println("Você encerrou o cadastro com um total de "+i+" produtos em sua lista.");
        System.out.println("*******************************");

        System.out.println();
        System.out.println("*******************************");
        System.out.println("Imprime o ArrayList listaDeProdutos: ");
        System.out.println("*******************************");
        System.out.println(listaDeProdutos);
        //desejos.imprimeProdutos;


        //Imprime objetos identificaveis / Tarefa3 Semana-5
        System.out.println();
        System.out.println("*******************************");
        System.out.println("Tarefa3-Semana5 Imprime o objeto Cliente identificavel: ");
        System.out.println("*******************************");


        System.out.println(cliente1.getIdentificacao());


        


        System.out.println("*******************************");
        System.out.println("Fim do programa");
        System.out.println("*******************************");
        
        // Linhas abaixo comentadas pois não sei do que se trata.
        // Pedido[] pedidos = ProcessadorDeCsv.processaArquivo("pedidos.csv");

        // int totalDeProdutosVendidos = 0;
        // int totalDePedidosRealizados = 0;
        // BigDecimal montanteDeVendas = BigDecimal.ZERO;
        // Pedido pedidoMaisBarato = null;
        // Pedido pedidoMaisCaro = null;

        // String[] categoriasProcessadas = new String[10];
        // int totalDeCategorias = 0;

        // for (int i = 0; i < pedidos.length; i++) {
        //     Pedido pedidoAtual = pedidos[i];

        //     if (pedidoAtual == null) {
        //         break;
        //     }

        //     if (pedidoMaisBarato == null || pedidoAtual.getPreco().multiply(new BigDecimal(pedidoAtual.getQuantidade())).compareTo(pedidoMaisBarato.getPreco().multiply(new BigDecimal(pedidoMaisBarato.getQuantidade()))) < 0) {
        //         pedidoMaisBarato = pedidoAtual;
        //     }

        //     if (pedidoMaisCaro == null || pedidoAtual.getPreco().multiply(new BigDecimal(pedidoAtual.getQuantidade())).compareTo(pedidoMaisCaro.getPreco().multiply(new BigDecimal(pedidoMaisCaro.getQuantidade()))) > 0) {
        //         pedidoMaisCaro = pedidoAtual;
        //     }

        //     montanteDeVendas = montanteDeVendas.add(pedidoAtual.getPreco().multiply(new BigDecimal(pedidoAtual.getQuantidade())));
        //     totalDeProdutosVendidos += pedidoAtual.getQuantidade();
        //     totalDePedidosRealizados++;

        //     boolean jahProcessouCategoria = false;
        //     for (int j = 0; j < categoriasProcessadas.length; j++) {
        //         if (pedidoAtual.getCategoria().equalsIgnoreCase(categoriasProcessadas[j])) {
        //             jahProcessouCategoria = true;
        //         }
        //     }

        //     if (!jahProcessouCategoria) {
        //         totalDeCategorias++;

        //         if (categoriasProcessadas[categoriasProcessadas.length - 1] != null) {
        //             categoriasProcessadas = Arrays.copyOf(categoriasProcessadas, categoriasProcessadas.length * 2);
        //         } else {
        //             for (int k = 0; k < categoriasProcessadas.length; k++) {
        //                 if (categoriasProcessadas[k] == null) {
        //                     categoriasProcessadas[k] = pedidoAtual.getCategoria();
        //                     break;
        //                 }
        //             }
        //         }
        //     }
        // }

        // logger.info("##### RELATÓRIO DE VALORES TOTAIS #####");
        // logger.info("TOTAL DE PEDIDOS REALIZADOS: {}", totalDePedidosRealizados);
        // logger.info("TOTAL DE PRODUTOS VENDIDOS: {}", totalDeProdutosVendidos);
        // logger.info("TOTAL DE CATEGORIAS: {}", totalDeCategorias);
        // logger.info("MONTANTE DE VENDAS: {}", NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(montanteDeVendas.setScale(2, RoundingMode.HALF_DOWN)));
        // logger.info("PEDIDO MAIS BARATO: {} ({})", NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(pedidoMaisBarato.getPreco().multiply(new BigDecimal(pedidoMaisBarato.getQuantidade())).setScale(2, RoundingMode.HALF_DOWN)), pedidoMaisBarato.getProduto());
        // logger.info("PEDIDO MAIS CARO: {} ({})\n", NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(pedidoMaisCaro.getPreco().multiply(new BigDecimal(pedidoMaisCaro.getQuantidade())).setScale(2, RoundingMode.HALF_DOWN)), pedidoMaisCaro.getProduto());
        // logger.info("### FIM DO RELATÓRIO ###");
    }
}