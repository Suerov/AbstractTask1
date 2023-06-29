public class Cow extends  Animals {

    public Cow() {
    }

    public Cow(int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);

    }

    @Override
    public String toString() {
        return "\n"+"Cow:"+super.toString();
    }
}

