import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.HttpClient;
import java.net.URI;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, World!");
        String url = "https://imdb-api.com/en/API/Top250Movies/k_x3pev8lm";
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest requisicao = HttpRequest.newBuilder(URI.create(url)).GET().build();
        HttpResponse<String> resposta = cliente.send(requisicao, BodyHandlers.ofString());
        String json = resposta.body();
        System.out.println(json);

    }
}
