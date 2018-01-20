package at.fh.ima.swengs.angularfighter.api;


import at.fh.ima.swengs.angularfighter.api.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class RestConfig extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(FireBrigade.class);
        config.exposeIdsFor(FireEngine.class);
        config.exposeIdsFor(FireEngineAbbreviation.class);
        config.exposeIdsFor(FireFighter.class);
        config.exposeIdsFor(FireFighterStatus.class);
        config.exposeIdsFor(Rank.class);
    }


}