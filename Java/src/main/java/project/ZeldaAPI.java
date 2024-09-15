package project;

import com.google.gson.Gson;

/**
 * The {@code ZeldaAPI} class extends the {@code APIUtility} class to provide
 * functionality for fetching data related to Zelda monsters from a remote API.
 * This class utilizes the Gson library to parse JSON responses.
 */
public class ZeldaAPI extends APIUtility {

    /**
     * An instance of the Gson library used for JSON parsing.
     */
    private static Gson gson = new Gson();

    /**
     * Fetches data related to a specific Zelda monster from the API.
     * The method sends a request to the API and parses the JSON response into
     * a {@code ZeldaFetchData} object.
     *
     * @return A {@code ZeldaFetchData} object containing the data fetched from the API.
     */
    public static ZeldaFetchData fetchTeams() {
        String uri = "https://botw-compendium.herokuapp.com/api/v3/compendium/entry/white-maned_lynel";
        String json = sendRequest(uri);
        ZeldaFetchData response = gson.fromJson(json, ZeldaFetchData.class);
        return response;
    }

//    /**
//     * Main method for testing the fetchTeams method.
//     * It sends a request to the API, fetches the data, and prints the result.
//     *
//     * @param args Command line arguments.
//     */
//    public static void main(String[] args) {
//        String uri = "https://botw-compendium.herokuapp.com/api/v3/compendium/entry/white-maned_lynel";
//        String json = APIUtility.sendRequest(uri);
//        ZeldaFetchData response = gson.fromJson(json, ZeldaFetchData.class);
//        System.out.println(response);
//    }

}
