//Java - 11 HTTP Clients Api
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class Read_String_Example_7 {
	public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
		String uri = "https://postman-echo.com/get?uname=root&pwd=root";
		HttpRequest reqs = HttpRequest.newBuilder().uri(URI.create(uri)).GET().version(Version.HTTP_2).build();
		HttpClient clients = HttpClient.newBuilder().build();
		try {
			HttpResponse<String> resp = clients.send(reqs, BodyHandlers.ofString());
			System.out.println(resp.statusCode());
			System.out.println(resp.body());
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

}
