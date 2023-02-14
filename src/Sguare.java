public class Sguare extends Shepes {
    private int side;
    @Override
    public void findAre(){
        int are = side*side;
        System.out.println("are of sguare:"+are);
    }

    @Override
    public void finArea() {

    }

    public Sguare(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    public Sguare(){

    }
}
