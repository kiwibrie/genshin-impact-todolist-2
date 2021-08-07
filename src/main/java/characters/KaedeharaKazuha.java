package main.java.characters;

public class KaedeharaKazuha extends Character {

    public KaedeharaKazuha() {
        super("Kaedehara Kazuha", 5, "anemo", "sword", "");

        setAttackName("Garyuu Bladework");
        setAttackDesc("""
                Normal Attack: Perform up to 5 rapid strikes.
                
                Charged Attack: Consumes a certain amount of Stamina to unleash 2 rapid sword strikes.
                
                Plunging Attack: Plunges from mid-air to strike the ground below, damaging opponents along the path and dealing AoE DMG upon impact. If this Plunging Attack is triggered by Chihayaburu, it will be converted to Plunging Attack: Midare Ranzan.
                
                Plunging Attack: Midare Ranzan: When a Plunging Attack is performed using the effects of the Elemental Skill Chihayaburu, Plunging Attack DMG is converted to Anemo DMG and will create a small wind tunnel via a secret blade technique that pulls in nearby objects and opponents.""");
        setSkillName("Chihayaburu");
        setSkillDesc("""
                Unleashes a secret technique as fierce as the rushing wind that pulls objects and opponents towards Kazuha's current position before launching opponents within the AoE, dealing Anemo DMG and lifting Kazuha into the air on a rushing gust of wind.
                
                Press: Can be used in mid-air.
                
                Hold: Charges up before unleashing greater Anemo DMG over a larger AoE than Press Mode.
                
                Plunging Attack: Midare Ranzan: Within 10s of remaining airborne after casting Chihayaburu, Kazuha can unleash a powerful Plunging Attack known as Midare Ranzan.
                When a Plunging Attack is performed using the effects of the Elemental Skill Chihayaburu, Plunging Attack DMG is converted to Anemo DMG. On landing, Kazuha creates a small wind tunnel via a secret blade technique that pulls in nearby objects and opponents. Midare Ranzan's DMG is considered Plunging Attack DMG.""");
        setBurstName("Kazuha Slash");
        setBurstDesc("The signature technique of Kazuha's self-styled bladework — a single slash that strikes with the force of the first winds of autumn, dealing AoE Anemo DMG. The blade's passage will leave behind a field named \"Autumn Whirlwind\" that periodically deals AoE Anemo DMG to opponents within its range.\n" +
                "Elemental Absorption: If Autumn Whirlwind comes into contact with Hydro/Pyro/Cryo/Electro, it will deal additional elemental DMG of that type. Elemental Absorption may only occur once per use.");

        setPassive00Name("Cloud Strider");
        setPassive00Desc("Decreases sprinting Stamina consumption for your own party members by 20%.\n" +
                "Not stackable with Passive Talents that provide the exact same effects.");
        setPassive20Name("Soumon Swordsmanship");
        setPassive20Desc("If Chihayaburu comes into contact with Hydro/Pyro/Cryo/Electro when cast, Chihayaburu will absorb that element and if Plunging Attack: Midare Ranzan is used before the effect expires, it will deal an additional 200% ATK of the absorbed elemental type as DMG. This will be considered Plunging Attack DMG.\n" +
                "Elemental Absorption may only occur once per use of Chihayaburu.");
        setPassive60Name("Poetics of Fuubutsu");
        setPassive60Desc("Upon triggering a Swirl reaction, Kaedehara Kazuha will grant all party members a 0.04% Elemental DMG Bonus to the element absorbed by Swirl for every point of Elemental Mastery he has for 8s. Bonuses for different elements obtained through this method can co-exist.");

        setNotes("");
    }
}
