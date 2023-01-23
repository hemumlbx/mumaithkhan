package gm.dataviewer.pages;

import net.serenitybdd.screenplay.targets.Target;

public class LoginForm {
    public static final Target USERNAME_BOX = Target.the("username input box").locatedBy("#username");

    public static final Target PASSWORD_BOX = Target.the("password input box").locatedBy("#password");

    public static final Target SUBMIT_BOX = Target.the("user pass submit box").locatedBy("#submit_button");

}
