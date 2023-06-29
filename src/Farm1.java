import java.util.Arrays;

public class Farm1 {
    private  String ownerName;
    private  String adress;
    Cow [] cows;
    Hourse[] hourses;
    Sheep[] sheeps;




    public Farm1(String ownerName, String adress, Cow[] cows, Hourse[] hourses, Sheep[] sheeps) {
        this.ownerName = ownerName;
        this.adress = adress;
        this.cows = cows;
        this.hourses = hourses;
        this.sheeps = sheeps;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Hourse[] getHourses() {
        return hourses;
    }

    public void setHourses(Hourse[] hourses) {
        this.hourses = hourses;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    @Override
    public String toString() {
        return "Farm1:" +"\n"+
                "ownerName:" + ownerName + "\n" +
                "adress:" + adress + "\n" +
                "cows:" + Arrays.toString(cows) +"\n"+
                "hourses=" + Arrays.toString(hourses) +"\n"+
                "sheeps=" + Arrays.toString(sheeps) +"\n";
    }
}
