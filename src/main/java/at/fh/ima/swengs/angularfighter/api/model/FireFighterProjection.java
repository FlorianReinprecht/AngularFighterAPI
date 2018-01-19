package at.fh.ima.swengs.angularfighter.api.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "all" , types = FireFighter.class)
public interface FireFighterProjection {
    Long getId();
    String getGender();
    String getTitle();
    String getSurname();
    String getName();
    String getDayOfBirth();
    FireBrigade getFireBrigade();
    FireFighterStatus getFireFighterStatus();
    Rank getRank();
}