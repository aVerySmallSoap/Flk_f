package UserInterfaces.CustomComponents;

import Interfaces.ResourceLocator;

import java.net.URL;

public class Fonts extends ResourceLocator {
    private static final String preURL = "UserInterfaces/Resources/Fonts";

    private static URL getResource(String path){
        return Fonts.class.getResource(preURL + path);
    }



}
