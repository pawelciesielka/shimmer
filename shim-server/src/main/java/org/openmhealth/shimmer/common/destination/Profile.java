package org.openmhealth.shimmer.common.destination;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author pezet
 */
@Document(collection = "profile")
public class Profile extends AbstractDocument {

    private String username;

    public Profile(String username) {
        this.username = username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}