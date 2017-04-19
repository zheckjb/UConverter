package UConverter;

public abstract class UnitConverter {
    public abstract double toSI(double value);
    public abstract double fromSI(double siValue);
    public abstract String getName();

    @Override
    public String toString() {
        return getName();
    }



}
