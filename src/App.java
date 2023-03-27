import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Map;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Olá, World!");
        // Fazrt conexao http
        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest requisicao = HttpRequest.newBuilder(URI.create(url)).GET().build();
        HttpResponse<String> resposta = cliente.send(requisicao, BodyHandlers.ofString());
        String body = resposta.body();
        System.out.println(body);
        // extrair os dados
        var parser = new JsonParser();
        List<Map<String, String>> listaDeFimes = parser.parse(body);
        //

    }
}
