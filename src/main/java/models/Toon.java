package models;

import java.util.ArrayList;
import java.util.List;

public class Toon {
    private int level;
    private String spec;
    private String classification;
    private String region;
    private String role;
    private String server;
    private String professions;
    private String name;
    private String talents;
    private String race;
    private String azerite_level;
    private List<Equipment> equippedItems;

    public Toon() {
        this.equippedItems = new ArrayList<Equipment>();
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public void setProfessions(String professions) {
        this.professions = professions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTalents(String talents) {
        this.talents = talents;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setAzerite_level(String azerite_level) {
        this.azerite_level = azerite_level;
    }

    public void addEquipment(Equipment equipment){
        if(equippedItems.size() >= 16){
            throw new IllegalArgumentException("Too many equipped items. 16 is max and you are trying to add more");
        }
        equippedItems.add(equipment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(classification);
        sb.append("=");
        sb.append(name);
        sb.append("\n");
        sb.append("level=");
        sb.append(level);
        sb.append("\n");
        sb.append("race=");
        sb.append(race);
        sb.append("\n");
        sb.append("region=");
        sb.append(region);
        sb.append("\n");
        sb.append("server=");
        sb.append(server);
        sb.append("\n");
        sb.append("role=");
        sb.append(role);
        sb.append("\n");
        sb.append("professions=");
        sb.append(professions);
        sb.append("\n");
        sb.append("talents=");
        sb.append(talents);
        sb.append("\n");
        sb.append("spec=");
        sb.append(spec);
        sb.append("\n");
        for (Equipment eq : equippedItems) {
            sb.append("\n");
            sb.append(eq.toString());
        }
        return sb.toString();
    }
}
