package com.jlhood.ddbcopier.dagger;

/**
 * Helper class for fetching environment values.
 */
public final class Env {
    public static final String DESTINATION_TABLE_KEY = "DESTINATION_TABLE_NAME";
    public static final String DESTINATION_TABLE_REGION = "DESTINATION_TABLE_REGION";

    private Env() {
    }

    public static String getDestinationTable() {
        return System.getenv(DESTINATION_TABLE_KEY);
    }

    public static String getDestinationTableRegion() { return System.getenv(DESTINATION_TABLE_REGION); }
}
