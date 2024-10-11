package service;

import com.google.gson.Gson;
import model.InfoEpisodio;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiProcurar {

    Gson gson = new Gson();

    public String BusacarApi(String FilmeOuSerie){



        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://omdbapi.com/?t="+FilmeOuSerie+"&apikey=7e1e11f9"))
                .build();
        HttpResponse<String> response= null;
        try {
            response = HttpClient.newHttpClient()
                    .send(request, HttpResponse
                            .BodyHandlers
                            .ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        var dadosEscolhido = gson.fromJson(response.body(), InfoEpisodio.class);

        return String.valueOf(dadosEscolhido);

    }


}
