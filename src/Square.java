class Square implements IForme, Comparable <Square> {
    double cote;


    public Square(double cote) {
        this.cote = cote;

    }



    @Override
    public double surface() {
        return cote * cote;
    }


    @Override
    public int compareTo(Square o) {
        return 0;
    }
}