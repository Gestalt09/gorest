package apicore.support;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Locale;

/**
 * Service class which is wrapper for rest assured requests
 */
public class Service {

    /**
     * Method is used to create a request depending on the request method.
     */
    public static Response sendRequest(final RequestSpecification spec, final String method, final String endpoint) {
        final Response response;

        switch (method.toUpperCase(Locale.getDefault())) {
            case "GET":
                response = spec.get(endpoint);
                break;
            case "POST":
                response = spec.post(endpoint);
                break;
            case "DELETE":
                response = spec.delete(endpoint);
                break;
            case "PUT":
                response = spec.put(endpoint);
                break;
            case "PATCH":
                response = spec.patch(endpoint);
                break;
            default:
                response = spec.get(endpoint);
                break;
        }

        return response;
    }
}
