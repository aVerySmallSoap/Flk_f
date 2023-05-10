package Interfaces;

import java.net.URL;

@SuppressWarnings("unused")
public abstract class ResourceLocator {
    private static URL getResource(String path){
        return ResourceLocator.class.getResource(path);
    }
}
