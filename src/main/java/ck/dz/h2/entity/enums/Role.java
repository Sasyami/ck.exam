package ck.dz.h2.entity.enums;

import lombok.Getter;

@Getter
public enum Role {
    ADMIN("Admin"),
    DEVELOPER("Developer"),
    TESTER("Tester"),
    SYSTEM_ANALYST("System_analyst"),
    TEAM_LEAD("Team_lead");
    private final String role;
    Role(String rl){
        this.role = rl;
    }
    public String getRoleName(){return role;}


}
