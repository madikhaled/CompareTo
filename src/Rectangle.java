class Rectangle  implements  IForme, Comparable<Rectangle>{
    double longueur;
    double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }


    @Override
    public int compareTo(Rectangle o) {
        return 0;
    }

    @Override
    public double surface() {
        return  longueur * largeur;
    }
}