package project;

import java.util.ArrayList;

/**
 * The {@code ZeldaFetchData} class represents the data structure for storing information about a Zelda monster.
 * This class contains a nested {@code DataObj} class that holds detailed information about the monster.
 */
public class ZeldaFetchData {

    /**
     * The {@code DataObj} object that stores the detailed data fetched from the API.
     */
    public DataObj data;

    /**
     * The {@code DataObj} class represents detailed information about a Zelda monster.
     */
    public static class DataObj {
        /**
         * The unique identifier for the monster.
         */
        public int id;

        /**
         * A list of common locations where the monster can be found.
         */
        public ArrayList<String> common_locations;

        /**
         * A description of the monster.
         */
        public String description;

        /**
         * The URL of the monster's image.
         */
        public String image;

        /**
         * The name of the monster.
         */
        public String name;

        /**
         * Returns a string representation of the {@code DataObj} object.
         * This method provides a formatted string containing the monster's ID, common locations, description, image URL, and name.
         *
         * @return A string representing the monster's details.
         */
        @Override
        public String toString() {
            return
                    "Id is " + id + "/" +
                            "common_locations: " + common_locations + "/" +
                            "description: " + description + "/" +
                            "image: " + image + "/" +
                            "name: " + name;
        }
    }

    /**
     * Returns a string representation of the {@code ZeldaFetchData} object.
     * This method delegates to the {@code toString} method of the {@code DataObj} object.
     *
     * @return A string representing the monster's details.
     */
    @Override
    public String toString() {
        return data.toString();
    }
}
