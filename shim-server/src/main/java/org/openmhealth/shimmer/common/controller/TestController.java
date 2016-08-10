package org.openmhealth.shimmer.common.controller;

import org.openmhealth.schema.domain.omh.StepCount;
import org.openmhealth.shim.AuthorizationRequestParameters;
import org.openmhealth.shim.AuthorizationRequestParametersRepo;
import org.openmhealth.shim.ShimException;
import org.openmhealth.shimmer.common.destination.Profile;
import org.openmhealth.shimmer.common.repository.JpaProfileRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author pezet
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "org.openmhealth")
@EnableWebSecurity
@RestController
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private AuthorizationRequestParametersRepo authParametersRepo;

    @Autowired
    private JpaProfileRepository profileRepository;

    @RequestMapping(value = "/authorize/test")
    public void approve() throws ShimException {

        String stateKey = "YhkcEr";
        AuthorizationRequestParameters authParams = authParametersRepo.findByStateKey(stateKey);


        logger.info(authParams.toString());

        logger.debug(authParams.toString());

        logger.warn(authParams.toString());

        logger.error(authParams.toString());

        StepCount build = new StepCount.Builder(1).build();

        System.out.println(build.toString());
    }

    @RequestMapping(value = "/test/update")
    public void updateTest() {
        List<Profile> profiles = profileRepository.findAll();
        for (Profile profile1 : profiles) {
            profile1.setUsername("Piotr Ziętek");
            profileRepository.save(profile1);

            logger.info(profile1.toString());
        }
    }
}