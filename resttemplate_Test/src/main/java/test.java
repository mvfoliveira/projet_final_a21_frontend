import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class test {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        String livre = "http://localhost:8080/livres/livreById/1"; // L'URL de votre microservice distant

        String utilisateur = "http://localhost:8080/livres/livreById/1"; // L'URL de votre microservice distant

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            String data = response.getBody();
            System.out.println("Données récupérées : " + data);
        } else {
            System.out.println("Erreur lors de la récupération des données. Code de statut : " + response.getStatusCodeValue());
        }
    }
}