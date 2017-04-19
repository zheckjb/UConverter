package UConverter;


public class FarenheitUC extends UnitConverter {
    @Override
    public double toSI(double value) {
        return (value + 459.67) * 5.0/9.0;
    }

    @Override
    public double fromSI(double siValue) {
        return (siValue * (9.0/5.0) - 459.67);
    }

    @Override
    public String getName() {
        return "Farenheit";
    }
}
