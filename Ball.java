public class Ball {
    static int count = 0;

    private  String  color = "none";

    public Ball(String  color){
        this.color = color;

        count++;// count = + 1;
    }
    static int getCountInstance(){
        return count;
    }
    @Override
    public String toString() {
        return "Ball color: " + color;
    }
}
