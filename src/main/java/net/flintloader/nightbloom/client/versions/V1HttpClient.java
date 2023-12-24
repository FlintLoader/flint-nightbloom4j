package net.flintloader.nightbloom.client.versions;

import net.flintloader.nightbloom.NightBloom4J;
import net.flintloader.nightbloom.client.HttpClient;
import net.flintloader.nightbloom.client.agent.UserAgent;

/**
 * @author HypherionSA
 * Helper class to construct a V1 API endpoint client
 */
public class V1HttpClient extends HttpClient {

    /**
     * Create a new V1 API Client. This shouldn't be called directly. Use {@link NightBloom4J#v1(UserAgent)} instead
     * @param agent The constructed {@link UserAgent} to use for the requests
     * @param apiKey Optional API key. Required for file uploads
     */
    public V1HttpClient(UserAgent agent, String apiKey) {
        super(agent, "1", apiKey);
    }
}
