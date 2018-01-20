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
    String getStreetName();
    String getPostalCode();
    String getPostTown();
    FireBrigade getFireBrigade();
    FireFighterStatus getFireFighterStatus();
    Rank getRank();
}