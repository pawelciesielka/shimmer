package org.openmhealth.shimmer.common.repository;

import org.openmhealth.shimmer.common.destination.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author pezet
 */
public interface JpaProfileRepository extends MongoRepository<Profile, String> {
}