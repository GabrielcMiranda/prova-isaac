package com.prova.isaac;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class AvistamentoCSV {
    

    //file path
    private static String nomeArquivo = "src\\main\\CSVs\\Avistamentos.csv";

    public static void addAvistamentoCSV(Area area, Especie especie, String data){

        try {

            //checando existencia do arquivo
            boolean arquivoExiste = new File(nomeArquivo).exists();

            //criando o escritor de txt
            FileWriter escritor = new FileWriter(nomeArquivo,StandardCharsets.ISO_8859_1,arquivoExiste);

            //escreve os dados no formato apropriado
            escritor.write("\n"+area.getNome()+";"+especie.getNome()+";"+data);

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
                 escritor.write("\nÁrea;Nome;Data do avistamento\n");

                //escreve o que tá no buffer no arquivo imediatamente
                 escritor.flush();

                //fecha o escritor pra não consumir poder computacional
                 escritor.close();
            }

            else{

                //escreve os dados no formato apropriado
                 escritor.write("\n\n\nLog date: "+ dateFormat.format(date));
                 escritor.write("\nÁrea;Nome;Data do avistamento\n");

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
