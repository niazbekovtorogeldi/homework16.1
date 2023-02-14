public class Rectangle extends Shepes{
    private int name3;
    private int name4;

    @Override
    public void findAre(){
        int are = name3*name4;
        System.out.println("are of rectangle is:"+are);
    }

    public int getName3() {
        return name3;
    }

    public void setName3(int name3) {
        this.name3 = name3;
    }

    public int getName4() {
        return name4;
    }

    public void setName4(int name4) {
        this.name4 = name4;
    }

    public Rectangle(int name3, int name4) {
        this.name3 = name3;
        this.name4 = name4;
    }
    public Rectangle(){

    }


    public void finArea() {

    }
}
