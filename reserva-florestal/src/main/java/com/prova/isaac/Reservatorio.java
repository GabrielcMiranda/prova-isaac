package com.prova.isaac;

import java.util.Scanner;

public class Reservatorio {

     Especie[] especies = new Especie[200];
        Area[] areas = new Area[20];
        Scanner s = new Scanner(System.in);

        int input = 0, contEspecie = 0, contArea = 0, istatus;
        double tamanho;
        String entrada1, entrada2, getch;
        boolean status;

        public void home(){
            while(input != 5){
                System.out.println("-------------------------- RESERVA FLORESTAL --------------------------");
                System.out.println("\n\n\n\t1) Cadastrar espécie");
                System.out.println("\t2) Registrar área monitorada");
                System.out.println("\t3) Registrar avistamento");
                System.out.println("\t4) Listagem de informações");
                System.out.println("\t5) Sair\n\n\n");
                input = s.nextInt();
                s.nextLine();
                System.out.println("\n\n--------------------------                    --------------------------");
    
                if(input == 1){
                    cadastroEspecie();
                }
    
                if(input == 2){
                    registroArea();
                }
    
                if(input == 3){
                    avistamentoNaReserva();
                }
    
                if(input == 4){
                    listagemDeInformacoes();
                }
            }
        }

        public void cadastroEspecie(){
            if(contEspecie <=199){
                System.out.println("\n\nInsira o nome da espécie: ");
                entrada1 = s.nextLine();
                System.out.println("Insira o tipo da espécie: ");
                entrada2 = s.nextLine();
                System.out.println("Insira o status de conservação da espécie (1 para ameaçada e 0 para não ameaçada): ");
                istatus = s.nextInt();

                if(istatus == 1){
                    status = true;
                }

                else{
                    status = false;
                }

                Especie e1 = new Especie(entrada1,entrada2,status);
                especies[contEspecie] = e1;
                contEspecie++;

                System.out.println("\nEspécie registrada com sucesso!");
                getch = s.nextLine();
                
                }

                else{
                    System.out.println("\nNúmero limite de espécies atingido.\n");
                    getch = s.nextLine();

                }
                System.out.println("\n\n--------------------------                    --------------------------");
        }

        public void registroArea(){
            if(contArea <= 19){
                System.out.println("\n\nInsira o nome da área: ");
                entrada1 = s.nextLine();
                entrada1 = entrada1.toLowerCase();
                System.out.println("Insira a localização da área: ");
                entrada2 = s.nextLine();
                System.out.println("Insira o tamanho da área (em hectares): ");
                tamanho = s.nextDouble();

                Area a1 = new Area(entrada1, entrada2, tamanho);
                areas[contArea] = a1;
                contArea++;

                System.out.println("\nÁrea registrada com sucesso!");
                getch = s.nextLine();
                }

                else{
                    System.out.println("\nNúmero limite de áreas atingido.\n");
                    getch = s.nextLine();
                }
                System.out.println("\n\n--------------------------                    --------------------------");
        }

        public void avistamentoNaReserva(){
            System.out.println("\n\ninsira o nome da area onde ocorreu o avistamento: ");
                    for(int i = 0; i<=19;i++){
                        if(areas[i] != null){
                            System.out.println("\n\t"+(i+1)+") "+areas[i].getNome());
                        }
                    }
                    int n = s.nextInt();
                    s.nextLine();
                        if(areas[n-1] != null){
                            System.out.println("\n\ninsira o nome da espécie avistada: ");
                        for(int i = 0; i<=199;i++){
                            if(especies[i] != null){
                                System.out.println("\n\t"+(i+1)+") "+especies[i].getNome());
                            }
                        }
                        int j = s.nextInt();
                        s.nextLine();
                        if(especies[j-1] != null){
                            areas[n-1].setAvistados(areas[n-1].getContadorAvistamento(), especies[j-1].getNome());
                            System.out.println("\n\ndigite a data do avistamento: ");
                            String data = s.nextLine();
                            areas[n-1].setDataAvistamento(areas[n-1].getContadorAvistamento(), data);
                            areas[n-1].setContadorAvistamento(areas[n-1].getContadorAvistamento()+1);
                            System.out.println("\n\nAvistamento registrado!");
                            getch = s.nextLine();
                        }
                        else{
                            System.out.println("Espécie inválida.");
                            getch = s.nextLine();
                        }
                
                    }
                    else{
                        System.out.println("Área inválida.");
                        getch = s.nextLine();
                    }
                    System.out.println("\n\n--------------------------                    --------------------------");
        }

        public void listagemDeInformacoes(){
            System.out.println("\n\nEspécies registradas:\n\n");
                    for(int i = 0; i<=199;i++){
                        if(especies[i] != null){
                            System.out.println("\tEspécie número "+ (i+1)+": ");
                            System.out.println("\t-nome: "+especies[i].getNome()+"\n\t-tipo: "+especies[i].getTipo());
                            if(especies[i].isStatusAmeaca() == true){
                                System.out.println("\t-status: ameaçada\n");
                            }
                            else{
                                System.out.println("\t-status: não ameaçada\n");
                            }
                        }
                    }
                    System.out.println("\n\nÁreas registradas:\n\n");
                    for(int i = 0; i<=19;i++){
                        if(areas[i] != null){
                            System.out.println("\tÁrea número "+ (i+1)+": ");
                            System.out.println("\t-nome: "+areas[i].getNome()+"\n\t-localização: "+areas[i].getLocalizacao()+"\n\t-dimensão: "+areas[i].getTamanho());
                            if(areas[i].getAvistados(0) != null){
                                System.out.println("\n\nAvistamentos na área : ");
                                for(int j = 0 ;j <= 199 ; j++){
                                    if(areas[i].getAvistados(j) != null){
                                        System.out.println("\n\t-espécie: "+areas[i].getAvistados(j)+"\n\t-data: "+areas[i].getDataAvistamento(j));
                                    }
                                    
                                }
                            }
                               
                        }
                         
                    }
                
                    getch = s.nextLine();
                    System.out.println("\n\n--------------------------                    --------------------------");
            

        }
}


