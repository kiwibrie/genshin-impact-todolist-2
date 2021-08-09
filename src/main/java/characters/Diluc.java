package main.java.characters;

public class Diluc extends Character {

    public Diluc(){
        super("Diluc", 5, "pyro", "claymore", "");

        setHP(1011, 2621, 5219, 6710, 8421, 9932, 11453, 12981);
        setATK(26, 68, 135, 173, 217, 256, 295, 335);
        setDEF(61, 158, 315, 405, 509, 600, 692, 784);
        setAscensionStat("Crit Rate");

        setAscensionMaterials("Agnidus Agate", "Small Lamp Grass", "Everflame Seed", "Insignia");
        setTalentMaterials("Resistance", "Insignia", "Dvalin's Plume");

        setAttackName("Tempered Sword");
        setAttackDesc("");
        setSkillName("Searing Onslaught");
        setSkillDesc("");
        setBurstName("Dawn");
        setBurstDesc("");

        setPassive00Name("Tradition of the Dawn Knight");
        setPassive00Desc("");
        setPassive20Name("Relentless");
        setPassive20Desc("");
        setPassive60Name("Blessing of Phoenix");
        setPassive60Desc("");

        setNotes("");
    }
    //todo descriptions
}
