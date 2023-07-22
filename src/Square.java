public class Square {
    private int side;
    
    public Square() {
        this.side = 10;
    }


    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public static void main(String[] args) {
        Square square1 = new Square();
        Square square2 = new Square(5);

        System.out.println("Square 1 Side: " + square1.getSide());
        System.out.println("Square 2 Side: " + square2.getSide());
    }
}
