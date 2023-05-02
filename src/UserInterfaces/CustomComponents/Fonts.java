package UserInterfaces.CustomComponents;

import Interfaces.ResourceLocator;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Fonts extends ResourceLocator {

    private static final String prefix = "/UserInterfaces/Resources/Fonts/";

    private static InputStream getResource(String path){
        return Fonts.class.getResourceAsStream(prefix.concat(path));
    }

    public static void registerFonts(){
        GraphicsEnvironment graph = GraphicsEnvironment.getLocalGraphicsEnvironment();
            try {
                final Font SEGOE_UI = Font.createFont(Font.TRUETYPE_FONT, getResource("Segoe UI.ttf"));
                graph.registerFont(SEGOE_UI);
            } catch (FontFormatException | IOException e) {
                throw new RuntimeException(e);
            }
    }
}
