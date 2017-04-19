package UConverter;

import asg.cliche.Command;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class UniversalConverter {

    private List<UnitConverter> converters = Arrays.asList(
            new CelsiusUC(),
            new FarenheitUC(),
            new KelvinUC()
    );
    private UnitConverter sourceConverter;
    private UnitConverter targetConverter;

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
        //double abc = sourceConverter.toSI(value);
        return String.format("%.2f",targetConverter.fromSI(sourceConverter.toSI(value)));
    }

}
