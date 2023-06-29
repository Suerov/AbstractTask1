public class Hourse extends Animals {
    public Hourse() {
    }

    public Hourse(int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "\n"+"Hourse:"+super.toString();
    }
}
