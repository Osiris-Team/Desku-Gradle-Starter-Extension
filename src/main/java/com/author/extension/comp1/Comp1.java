package com.author.extension.comp1;

import com.osiris.desku.App;
import com.osiris.desku.UI;
import com.osiris.desku.ui.Component;
import com.osiris.desku.ui.display.Image;

public class Comp1 extends Component<Comp1> {

    static { // Executed only once
        try {
            String styles = "" +
                    "comp1{" + // Style affects all components with the tag "vl"
                    "background-color: red;" +
                    "}";
            // You can also add a css file to the current classes' package/folder.
            // The file below is at "com/osiris/desku/VerticalLayout.css"
            styles = App.getCSS(Comp1.class);
            App.appendToGlobalStyles(styles);

            // Execute JavaScript code globally once the HTML is loaded.
            //TODO App.appendToGlobalJS(App.getJS(Comp1.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Comp1() {
        init(this, "comp1");
        // Make sure to call init before anything else!

        // You can get the window this component is loaded in, like so:
        UI ui = UI.get();
        System.out.println(ui);

        // You can also load any other files like .png from the current classes' package/folder:
        add(new Image(this.getClass(), "/desku-icon.png"));
        // Internally this is done which returns an InputStream:
        //App.getResourceInPackage(this.getClass().getPackage(), "/desku-icon.png")

        // You can run JavaScript and modify this component:
        ui.executeJavaScript(ui.jsGetComp("comp", id) + "console.log('This component in JavaScript: '+comp)",
                "internal", 0);

        // You can add JavaScript event listeners that when triggered execute Java code:
        // See "How do I add my own JavaScript event listener?" at https://github.com/Osiris-Team/Desku#documentation
    }
}
