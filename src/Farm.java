import java.util.Arrays;

public class Farm {
    private String adress;
    private  String ownerName;
    Cow [] cows;

    Hourse[] hourses;
    Sheep[] sheeps;

    public Farm() {
    }


    public Farm(String adress, String ownerName, Cow[] cows, Hourse[] hourses, Sheep[] sheeps) {
        this.adress = adress;
        this.ownerName = ownerName;
        this.cows = cows;
        this.hourses = hourses;
        this.sheeps = sheeps;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
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
        return "Farm:" +"\n"+
                "adress:" + adress + "\n" +
                "ownerName:" + ownerName + "\n"+
               " cows:" + Arrays.toString(cows) + "\n"+
                "hourses:" + Arrays.toString(hourses) +"\n"+
                "sheeps:" + Arrays.toString(sheeps) ;
    }
}

