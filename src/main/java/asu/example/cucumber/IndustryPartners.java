package asu.example.cucumber;


public class IndustryPartners {
    private int minimumPartners;
    private int actualNumberPartners;

    public IndustryPartners() {
    }

    public void setMinimumPartners(int minimumPartners) {
        this.minimumPartners = minimumPartners;
    }

    public int getMinimumPartners() {
        return minimumPartners;
    }

    public void setActualNumberPartners(int actualNumberPartners) {
        this.actualNumberPartners = actualNumberPartners;
    }

    public int getActualNumberPartners() {
        return actualNumberPartners;
    }

    public String getAction() {
        if (this.actualNumberPartners == minimumPartners){
            return "continue having meetings and are somewhat ok with it";
        }else if (this.actualNumberPartners < minimumPartners){
            return "disband";
        }else{
            return "celebrate";
        }
    }
}
