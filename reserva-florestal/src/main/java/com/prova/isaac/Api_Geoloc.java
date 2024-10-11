package com.prova.isaac;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Api_Geoloc {
    
  Endereco endereco = new Endereco();

    public Endereco getEndereco(String cep)throws IOException,InterruptedException{ 
      try{
           HttpClient client =  HttpClient.newHttpClient();
           HttpRequest request =  HttpRequest.newBuilder()
                  .uri(URI.create("http://viacep.com.br/ws/"+cep+"/json/")).build();
                  HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
            
    ObjectMapper mapper = new ObjectMapper();
        endereco = mapper.readValue(response.body(),Endereco.class);
      } catch (Exception e){
         System.out.println(e.getMessage());;
      }
      return endereco;
    }
    }
 

   
