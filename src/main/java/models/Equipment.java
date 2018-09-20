package models;

import java.util.ArrayList;
import java.util.List;

public class Equipment {
    private String id;
    private String slot;
    private List<String> bonus_ids;
    private String reforge;
    private String gem_id;
    private Boolean gemSlotPresent;
    private List<String> azerite_powers;
    private String enchant_id;
    private Boolean enchantPresent;
    private Boolean azeritePowersPresent;

    public Equipment() {
        bonus_ids = new ArrayList<String>();
        azerite_powers = new ArrayList<String>();
        azeritePowersPresent = false;
        enchantPresent = false;
        gemSlotPresent = false;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public void setBonus_ids(String bonus_ids) {
        String[] bonusIds = bonus_ids.split("/");
        for (String bonus_id : bonusIds) {
            this.bonus_ids.add(bonus_id);
        }
    }

    public void setReforge(String reforge) {
        this.reforge = reforge;
    }

    public void setGem_id(String gem_id) {
        this.gem_id = gem_id;
        this.gemSlotPresent = true;
    }

    public void setAzerite_powers(String azerite_powerString) {
        String[] azeritePowers = azerite_powerString.split("/");
        for (String azeritePower : azeritePowers) {
            this.azerite_powers.add(azeritePower);
        }
        this.azeritePowersPresent = true;
    }

    public void setEnchant_id(String enchant_id) {
        this.enchant_id = enchant_id;
        this.enchantPresent = true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(slot);
        sb.append("=,id=");
        sb.append(id);
        if(enchantPresent){
            sb.append(",enchant_id=");
            sb.append(enchant_id);
        }
        if(gemSlotPresent){
            sb.append(",gem_id=");
            sb.append(gem_id);
        }
        if(!bonus_ids.isEmpty()){
            sb.append(",bonus_id=");
            sb.append(getListOfIdsAsString(bonus_ids));
        }
        sb.append(",reforge=");
        sb.append(reforge);
        if(azeritePowersPresent){
            sb.append(",azerite_powers=");
            sb.append(getListOfIdsAsString(azerite_powers));
        }
        return sb.toString();
    }

    private String getListOfIdsAsString(List<String> ids){
        StringBuilder sb = new StringBuilder();
        for (String id : ids) {
            sb.append(id);
            sb.append("/");
        }
        sb.deleteCharAt(sb.lastIndexOf("/"));
        return sb.toString();
    }
}
