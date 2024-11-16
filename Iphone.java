/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.natamaia.iphone;

import java.util.Scanner;
/**
 *
 * @author natal
 */
public class Iphone {

    public static void main(String[] args) {
        Scanner opcao = new Scanner(System.in);
        System.out.println("Oque deseja fazer?\nReproduzir musica[1]\nNavegar na internt[2]\nFAzer chamada[3]");
        int Opcao = opcao.nextInt();
        while(Opcao != 0){
    
        if(Opcao == 1){
            Scanner opcaoMusica = new Scanner(System.in);
            System.out.println("Reprodutor musical\nOque deseja fazer?\nTocar musica[1]\nPausar musica[2]\nTrocar musica[3]");
            int Musica = opcaoMusica.nextInt();
            
            if (Musica == 1) {
                System.out.println("Tocando musica");
            }
            if (Musica == 2) {
                System.out.println("Musica pausada"); 
            }
            if (Musica == 3) {
                System.out.println("Trocando musica...\n...."); 
                System.out.println("Musica trocada"); 
            }else {
                System.out.println("Opção inexistente");
            }
        }
        if (Opcao == 2){
            Scanner opcaoNavegador = new Scanner(System.in);
            System.out.println("Abrindo navedor....\nOque deseja fazer?\n[1]Exibir pagina\n[2]Adicionar nova aba\n[3]Atualizar pagina");
            int Navegador = opcaoNavegador.nextInt();
            
            if (Navegador == 1) {
                System.out.println("Exibindo pagina....\n.....\nURL da pagina: https://github.com/natamaia");
            }
            if (Navegador == 2) {
                System.out.println("Adicionando nova pagina....\nPagina adicionada com sucesso!!"); 
            }
            if (Navegador == 3) {
                System.out.println("Atualizando pagina...\n....\nPagina atualizada");
            }else {
                System.out.println("Opção inexistente");
            }
        }
        if (Opcao == 3){
            Scanner opcaoChamada = new Scanner(System.in);
            System.out.println("Oque deseja fazer?\n[1]LIgar\n[2]Atender\n[3]Correio de voz");
            int Chamar = opcaoChamada.nextInt();
            
            if (Chamar == 1) {
                Scanner FazendoChamada = new Scanner(System.in);
                System.out.println("Disque o numero para fazer a chamada: ");
                int Numero = FazendoChamada.nextInt();
                System.out.println("Numero discado " + Numero);
                System.out.println("Chamando....\n...\n.....\nNinguem atendeu, tente novamente mais tarde");
            }
            if (Chamar == 2){
                System.out.println("Atendendo chamada....\nVocê está em uma ligação agora");
            }
            if (Chamar == 3){
                Scanner CorreioVoz = new Scanner(System.in);
                System.out.println("Deixe sua mensagem para o correio de voz: ");
                String Mensagem = CorreioVoz.nextLine();
                System.out.println(Mensagem);
                System.out.println("Recado enviado!!");
            }else{
                System.out.println("Opção inexistente");
            }
        }else{
                System.out.println("Saindo.....");
                break;
            }
        }   
    }
}
