package at.fh.ima.swengs.angularfighter.api.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "all" , types = FireFighter.class)
public interface FireFighterProjection {
    Long getId();
    String getTitle();
    String getSurname();
    String getName();
    FireBrigade getFireBrigade();
    FireFighterStatus getFireFighterStatus();
    Rank getRank();


}