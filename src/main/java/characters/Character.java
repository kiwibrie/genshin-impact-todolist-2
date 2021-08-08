package main.java.characters;

public class Character {
    String name;
    int stars;
    String vision;
    String weapontype;
    int level;
    String image;

    int[] hp;
    int[] atk;
    int[] def;
    String ascensionstat;

    String ascmatgem;
    String ascmatboss;
    String ascmatspecialty;
    String ascmatcommon;

    String talmattalent;
    String talmatcommon;
    String talmatboss;

    boolean weapon;
    boolean flower;
    boolean feather;
    boolean sands;
    boolean goblet;
    boolean circlet;

    String attackname;
    String attackdesc;
    String skillname;
    String skilldesc;
    String burstname;
    String burstdesc;

    String passive20name;
    String passive20desc;
    String passive60name;
    String passive60desc;
    String passive00name;
    String passive00desc;

    String notes;

    public Character(String name, int stars, String vision, String weapontype, String image){
        setName(name);
        setStars(stars);
        setVision(vision);
        setWeaponType(weapontype);
        setLevel(1);
        setImage(image);

        initializeToDo();
    }

    public void initializeToDo(){
        setWeapon(false);
        setFlower(false);
        setFeather(false);
        setSands(false);
        setGoblet(false);
        setCirclet(false);
    }

    public void setAscensionMaterials(String gem, String specialty, String boss, String common){
        setAscensionGem(gem);
        setAscensionSpecialty(specialty);
        setAscensionBoss(boss);
        setAscensionCommon(common);
    }

    public void setTalentMaterials(String talent, String common, String boss){
        setTalentTalent(talent);
        setTalentCommon(common);
        setTalentBoss(boss);
    }

    public int[] getHP(){
        return hp;
    }

    public void setHP(int lvl1, int lvl20, int lvl40, int lvl50, int lvl60, int lvl70, int lvl80, int lvl90){
        hp = new int[]{lvl1, lvl20, lvl40, lvl50, lvl60, lvl70, lvl80, lvl90};
    }

    public int[] getATK(){
        return atk;
    }

    public void setATK(int lvl1, int lvl20, int lvl40, int lvl50, int lvl60, int lvl70, int lvl80, int lvl90){
        atk = new int[]{lvl1, lvl20, lvl40, lvl50, lvl60, lvl70, lvl80, lvl90};
    }

    public int[] getDEF(){
        return def;
    }

    public void setDEF(int lvl1, int lvl20, int lvl40, int lvl50, int lvl60, int lvl70, int lvl80, int lvl90){
        def = new int[]{lvl1, lvl20, lvl40, lvl50, lvl60, lvl70, lvl80, lvl90};
    }

    public String getAscensionStat(){
        return ascensionstat;
    }
    public void setAscensionStat(String stat){
        ascensionstat = stat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        if(vision.equals("anemo") || vision.equals("pyro") || vision.equals("hydro")
                || vision.equals("cryo") || vision.equals("dendro")
                || vision.equals("electro") || vision.equals("geo")){
            this.vision = vision;
        }
    }

    public String getWeaponType() {
        return weapontype;
    }

    public void setWeaponType(String weapontype) {
        if(weapontype.equals("sword") || weapontype.equals("bow")
                || weapontype.equals("catalyst") || weapontype.equals("claymore")
                || weapontype.equals("polearm")){
            this.weapontype = weapontype;
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isWeapon() {
        return weapon;
    }

    public void setWeapon(boolean weapon) {
        this.weapon = weapon;
    }

    public boolean isFlower() {
        return flower;
    }

    public void setFlower(boolean flower) {
        this.flower = flower;
    }

    public boolean isFeather() {
        return feather;
    }

    public void setFeather(boolean feather) {
        this.feather = feather;
    }

    public boolean isSands() {
        return sands;
    }

    public void setSands(boolean sands) {
        this.sands = sands;
    }

    public boolean isGoblet() {
        return goblet;
    }

    public void setGoblet(boolean goblet) {
        this.goblet = goblet;
    }

    public boolean isCirclet() {
        return circlet;
    }

    public void setCirclet(boolean circlet) {
        this.circlet = circlet;
    }

    public String getAttackName() {
        return attackname;
    }

    public void setAttackName(String attackname) {
        this.attackname = attackname;
    }

    public String getAttackDesc() {
        return attackdesc;
    }

    public void setAttackDesc(String attackdesc) {
        this.attackdesc = attackdesc;
    }

    public String getSkillName() {
        return skillname;
    }

    public void setSkillName(String skillname) {
        this.skillname = skillname;
    }

    public String getSkillDesc() {
        return skilldesc;
    }

    public void setSkillDesc(String skilldesc) {
        this.skilldesc = skilldesc;
    }

    public String getBurstName() {
        return burstname;
    }

    public void setBurstName(String burstname) {
        this.burstname = burstname;
    }

    public String getBurstDesc() {
        return burstdesc;
    }

    public void setBurstDesc(String burstdesc) {
        this.burstdesc = burstdesc;
    }

    public String getPassive20Name() {
        return passive20name;
    }

    public void setPassive20Name(String passive20name) {
        this.passive20name = passive20name;
    }

    public String getPassive20Desc() {
        return passive20desc;
    }

    public void setPassive20Desc(String passive20desc) {
        this.passive20desc = passive20desc;
    }

    public String getPassive60Name() {
        return passive60name;
    }

    public void setPassive60Name(String passive60name) {
        this.passive60name = passive60name;
    }

    public String getPassive60Desc() {
        return passive60desc;
    }

    public void setPassive60Desc(String passive60desc) {
        this.passive60desc = passive60desc;
    }

    public String getPassive00Name() {
        return passive00name;
    }

    public void setPassive00Name(String passive00name) {
        this.passive00name = passive00name;
    }

    public String getPassive00Desc() {
        return passive00desc;
    }

    public void setPassive00Desc(String passive00desc) {
        this.passive00desc = passive00desc;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getAscensionGem(){
        return ascmatgem;
    }

    public void setAscensionGem(String material){
        ascmatgem = material;
    }

    public String getAscensionSpecialty(){
        return ascmatspecialty;
    }

    public void setAscensionSpecialty(String material){
        ascmatspecialty = material;
    }

    public String getAscensionBoss(){
        return ascmatboss;
    }

    public void setAscensionBoss(String material){
        ascmatboss = material;
    }

    public String getAscensionCommon(){
        return ascmatcommon;
    }

    public void setAscensionCommon(String material){
        ascmatcommon = material;
    }

    public String getTalentCommon(){
        return talmatcommon;
    }

    public void setTalentCommon(String material){
        talmatcommon = material;
    }

    public String getTalentBoss(){
        return talmatboss;
    }

    public void setTalentBoss(String material){
        talmatboss = material;
    }

    public String getTalentTalent(){
        return talmattalent;
    }

    public void setTalentTalent(String material){
        talmattalent = material;
    }
}
