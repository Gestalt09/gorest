package apicore.util;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

/**
 * This is the KeyValue class for the operations with the keys and values
 */
public class KeyValue {

    /**
     * This method is used to receive environment variable by passing key as param.
     */
    public static final String getEnvironmentVariable(final String key) {
        final EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
        return environmentVariables.getProperty(key);
    }
}
