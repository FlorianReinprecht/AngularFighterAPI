package at.fh.ima.swengs.angularfighter.api.model;

import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(name = "all" , types = FireEngine.class)
public interface FireEngineProjection {
    String getModel();
    String getLicensePlate();
    String getPerformance();
    String getBuildYear();
    Boolean getActive();
    Set<FireEngineAbbreviation> getAbbreviation();
    Set<FireBrigade> getFireBrigade();
    
}