// Classes concrètes
class Cercle implements IForme, Comparable<Cercle> {
    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

@Override
   public double surface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public int compareTo(Cercle o) {
        return 0;
    }
}