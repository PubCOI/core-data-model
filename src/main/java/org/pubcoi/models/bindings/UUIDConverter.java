package org.pubcoi.models.bindings;

import java.util.UUID;

public class UUIDConverter {

    public static UUID parse(String xmlValue) {
        return UUID.fromString(xmlValue);
    }

    public static String print(UUID value) {
        return value.toString();
    }

}
