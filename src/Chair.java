public class Chair {
    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public boolean isRolling() {
        return rolling;
    }

    public void setRolling(boolean rolling) {
        this.rolling = rolling;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int numOfLegs;
    public boolean rolling;
    public String material;
    public Chair(int legs, boolean rolls, String mat) {
        numOfLegs = legs;
        rolling = rolls;
        material = mat;
    }

}
