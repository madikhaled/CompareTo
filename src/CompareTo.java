import java.util.Comparator;

public class CompareTo implements Comparator<IForme> {
    @Override
    public int compare(IForme forme1, IForme forme2) {
        return Double.compare(forme2.surface(), forme1.surface());
    }
}
