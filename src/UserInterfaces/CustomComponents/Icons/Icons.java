package UserInterfaces.CustomComponents.Icons;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Icons {
    private static URL resourceFinder(String path){
        return Icons.class.getResource(path);
    }

    private static final Image file = new ImageIcon(resourceFinder("/UserInterfaces/Resources/filled_File.png")).getImage();
    public static final ImageIcon scaled_File = new ImageIcon(file.getScaledInstance(16,16,Image.SCALE_SMOOTH));
}
