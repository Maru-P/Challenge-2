package com.maru.challenge2.conversor;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import java.net.URI;

public class Conversor{

    
    public CambioDeMoneda convierte(String moneda1, String moneda2, Integer monto){
        
        try {
            URI link = URI.create("https://v6.exchangerate-api.com/v6/b7b5ec2b65653ce12c1ad630/pair/"+moneda1+"/"+moneda2+"/"+monto);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(link)
                    .build();
                
            HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
                    
            String json = response.body();

            return new Gson().fromJson(json, CambioDeMoneda.class);

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }    

}


