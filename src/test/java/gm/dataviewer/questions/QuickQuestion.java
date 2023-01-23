package gm.dataviewer.questions;

import net.serenitybdd.screenplay.Question;
import org.json.JSONObject;

import java.time.Duration;
import java.util.List;

public class QuickQuestion {

    public static Question<String> textOf(String text) {
        return actor -> text;
    }

}
