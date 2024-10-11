package com.prova.isaac;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class EspecieCSV {
    

    //file path
    private static String nomeArquivo = "src\\main\\CSVs\\Especies.csv";

    public static void addEspecieCSV(Especie especie){

        try {

            //checando existencia do arquivo
            boolean arquivoExiste = new File(nomeArquivo).exists();

            //criando o escritor de txt
            FileWriter escritor = new FileWriter(nomeArquivo,StandardCharsets.ISO_8859_1,arquivoExiste);

            //escreve os dados no formato apropriado
            escritor.write("\n"+especie.getNome()+";"+especie.getTipo()+";"+especie.isStatusAmeaca());

            //escreve o que tá no buffer no arquivo imediatamente
            escritor.flush();

            //fecha o escritor pra não consumir poder computacional
            escritor.close();

            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void insertData(){

        try {
            
            //pegando a data do sistema
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();

            //checando existencia do arquivo
            boolean arquivoExiste = new File(nomeArquivo).exists();

            //criando o escritor de txt
            FileWriter escritor = new FileWriter(nomeArquivo,StandardCharsets.ISO_8859_1,arquivoExiste);

            if(arquivoExiste == false){

                //escreve os dados no formato apropriado
                 escritor.write("Log date: "+ dateFormat.format(date));
                 escritor.write("\nNome;Tipo;Status de ameaça\n");

                //escreve o que tá no buffer no arquivo imediatamente
                 escritor.flush();

                //fecha o escritor pra não consumir poder computacional
                 escritor.close();
            }

            else{

                //escreve os dados no formato apropriado
                 escritor.write("\n\n\nLog date: "+ dateFormat.format(date));
                 escritor.write("\nNome;Tipo;Status de ameaça\n");

                //escreve o que tá no buffer no arquivo imediatamente
                 escritor.flush();

                //fecha o escritor pra não consumir poder computacional
                 escritor.close();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    


}
