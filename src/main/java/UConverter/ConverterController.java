package UConverter;


import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.List;

public class ConverterController {
    public ComboBox<UnitConverter> srcUnitCB;
    public ComboBox<UnitConverter> trgUnitCB;
    public TextField srcValue;
    public Text trgValue;
    private UniversalConverter converter = new UniversalConverter();

    public void initialize() {
        List<UnitConverter> units = converter.getConverters();
        srcUnitCB.getItems().setAll(units);
        trgUnitCB.getItems().setAll(units);
    }


    public void convert(ActionEvent actionEvent){
        converter.setSourceConverter(srcUnitCB.getValue());
        converter.setTargetConverter(trgUnitCB.getValue());

        //double tmp = Double.parseDouble(srcValue.getText());
        //String res = converter.convert(tmp);
        //trgValue.setText(res);
        trgValue.setText(converter.convert(Double.parseDouble(srcValue.getText())));
    }

}
