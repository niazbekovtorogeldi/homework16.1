public class Triangle extends  Shepes{
    private int name;
    private int name1;

    public Triangle(int name, int name1) {
        this.name = name;
        this.name1 = name1;
    }
    public Triangle(){

    }


    public void findAre() {

    }

    @Override
    public void finArea() {
        int are = name1 * name/2;
        System.out.println("are of triangle is :"+are);
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getName1() {
        return name1;
    }

    public void setName1(int name1) {
        this.name1 = name1;
    }
}

