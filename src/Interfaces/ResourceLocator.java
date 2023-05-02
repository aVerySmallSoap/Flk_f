package Interfaces;

import java.net.URL;

public abstract class ResourceLocator {
    private static URL getResource(String path){
        return ResourceLocator.class.getResource(path);
    }
}
