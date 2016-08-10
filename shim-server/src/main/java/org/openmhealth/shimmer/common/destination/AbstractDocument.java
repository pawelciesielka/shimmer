package org.openmhealth.shimmer.common.destination;

import java.time.LocalDateTime;

/**
 * @author pezet
 */
public abstract class AbstractDocument {

    private LocalDateTime dateCreated = LocalDateTime.now();

    private String _id;

    private String _class;

    public AbstractDocument() {}

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public String get_id() {
        return _id;
    }

    public String get_class() {
        return _class;
    }
}