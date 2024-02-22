class Triangle implements IForme, Comparable<Triangle>{
    double base;
    double hauteur;

    public Triangle(double base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
   public double surface() {
        return base * hauteur / 2;
    }


    @Override
    public int compareTo(Triangle o) {
        return 0;
    }
}