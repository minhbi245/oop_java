public class Parent {
    protected  String assetOne; // Cha có 2 món tài sản, sure Con sẽ được thừa kế -> có luôn
    protected  String assetTwo;

    public Parent(String assetOne, String assetTwo) {
        this.assetOne = assetOne;
        this.assetTwo = assetTwo;
    }

    public String getAssetOne() {
        return assetOne;
    }

    public void setAssetOne(String assetOne) {
        this.assetOne = assetOne;
    }

    public String getAssetTwo() {
        return assetTwo;
    }

    public void setAssetTwo(String assetTwo) {
        this.assetTwo = assetTwo;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "assetOne='" + assetOne + '\'' +
                ", assetTwo='" + assetTwo + '\'' +
                '}';
    }

    public void showAll() {
        System.out.println("PARENT: assetOne: " + assetOne + "; assetTwo: " + assetTwo);
    }
}
