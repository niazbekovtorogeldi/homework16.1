public class Cirlcle extends Shepes{
    private final double PI =Math.PI;
    private int radius;
    public Cirlcle(){

    }

    @Override
    public void findAre(){
        double are = PI *(radius*radius);
        System.out.println("are of circle is:"+are);
    }

    @Override
    public void finArea() {

    }

    public double getPI() {
        return PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Cirlcle(int radius) {
        this.radius = radius;
    }

}
