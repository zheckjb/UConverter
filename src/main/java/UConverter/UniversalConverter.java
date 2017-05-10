package UConverter;

import asg.cliche.Command;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class UniversalConverter {

    private final List<UnitConverter> converters = Arrays.asList(
            new CelsiusUC(),
            new FarenheitUC(),
            new KelvinUC()
    );


    private UnitConverter sourceConverter;
    private UnitConverter targetConverter;

    public void setTargetConverter(UnitConverter targetConverter) {
        this.targetConverter = targetConverter;
    }

    public void setSourceConverter(UnitConverter sourceConverter) {
        this.sourceConverter = sourceConverter;
    }

    public UnitConverter getSourceConverter() {
        return sourceConverter;
    }

    public UnitConverter getTargetConverter() {
        return targetConverter;
    }

    public List<UnitConverter> getConverters() {
        return converters;
    }

    @Command(name = "list", abbrev = "l")
    public void list(){
        for (int i =0; i < converters.size(); i++) {
            System.out.printf("%d - %s\n", i+1,converters.get(i));
        }
    }
    @Command(name = "Source", abbrev = "s")
    public void source(int idx){
        sourceConverter = converters.get(idx - 1);

    }
    @Command(name = "Target", abbrev = "t")
    public void target(int idx){
        targetConverter = converters.get(idx - 1);
    }
    @Command(name = "Convert", abbrev = "c")
    public String convert(double value){
        UnitConverter src = getSourceConverter();
        UnitConverter trg = getTargetConverter();
        if (src == null && trg == null) {
            throw new IllegalStateException("Source and Target converters are not set");
        }
        if (src == null) {
            throw new IllegalStateException("Source converter is not set");
        }
        if (trg == null) {
            throw new IllegalStateException("Target converter is not set");
        }
        //double abc = sourceConverter.toSI(value);
        return String.format("%.2f",trg.fromSI(src.toSI(value)));
    }

}
