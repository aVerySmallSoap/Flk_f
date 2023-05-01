package UserInterfaces.CustomComponents.Icons;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Icons {
    private static URL resourceFinder(String path){
        return Icons.class.getResource(path);
    }

    private static final Image file = new ImageIcon(resourceFinder("/UserInterfaces/Resources/filled_File.png")).getImage();
    private static final Image home = new ImageIcon(resourceFinder("/UserInterfaces/Resources/Home.png")).getImage();
    public static final ImageIcon File = new ImageIcon(file.getScaledInstance(16,16,Image.SCALE_SMOOTH));
    public static final ImageIcon Home = new ImageIcon(home.getScaledInstance(24,24,Image.SCALE_SMOOTH));
}
