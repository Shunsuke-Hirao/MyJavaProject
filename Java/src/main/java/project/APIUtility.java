package project;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * The {@code APIUtility} class provides a method to send HTTP GET requests
 * and retrieve the response as a JSON string.
 */
public class APIUtility {

    /**
     * Sends an HTTP GET request to the specified URI and returns the response
     * as a JSON string.
     *
     * @param uri The URI to which the HTTP GET request is sent.
     * @return A JSON string containing the response from the server.
     *         If the request fails, an empty string is returned.
     */
    static String sendRequest(String uri) {
        String json = "";

        try {
            // Create an instance of HttpClient
            HttpClient client = HttpClient.newHttpClient();

            // Build the HTTP request using the provided URI
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(uri)).build();

            // Send the request and retrieve the response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Get the response body as a JSON string
            json = response.body();
        } catch (Exception e) {
            // Print an error message if the request fails
            System.err.println("Cannot retrieve request with URI of " + uri);
        }

        // Return the JSON response
        return json;
    }
}
