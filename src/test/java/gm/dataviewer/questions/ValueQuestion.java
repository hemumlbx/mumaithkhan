package gm.dataviewer.questions;

import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;


public class ValueQuestion {
    public static Question<List<String>> getValues(ArrayList<String> values) {
        return actor -> values;
    }
}
