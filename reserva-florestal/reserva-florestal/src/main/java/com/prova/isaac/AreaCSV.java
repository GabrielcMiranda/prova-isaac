package com.prova.isaac;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class AreaCSV {
    

    //file path
    private static String nomeArquivo = "src\\main\\CSVs\\Areas.csv";

    public static void addAreaCSV(Area area){

        try {

            //checando existencia do arquivo
            boolean arquivoExiste = new File(nomeArquivo).exists();

            //criando o escritor de txt
            FileWriter escritor = new FileWriter(nomeArquivo,StandardCharsets.ISO_8859_1,arquivoExiste);

            //escreve os dados no formato apropriado
            escritor.write("\n"+area.getNome()+";"+area.getTamanho()+";"+area.getLocalizacao()+";"+area.getLogradouro()+";"+area.getComplemento()+";"+area.getBairro()+";"+area.getLocalidade()+";"+area.getUf());

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
                 escritor.write("\nNome;Tamanho;CEP;;Logradouro;Complemento;Bairro;Localidade;Uf\n");

                //escreve o que tá no buffer no arquivo imediatamente
                 escritor.flush();

                //fecha o escritor pra não consumir poder computacional
                 escritor.close();
            }

            else{

                //escreve os dados no formato apropriado
                 escritor.write("\n\n\nLog date: "+ dateFormat.format(date));
                 escritor.write("\nNome;Tamanho;CEP;;Logradouro;Complemento;Bairro;Localidade;Uf\n");

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
