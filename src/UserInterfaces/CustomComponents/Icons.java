package UserInterfaces.CustomComponents;

import Interfaces.ResourceLocator;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Icons extends ResourceLocator {
    private static final String preURL = "UserInterfaces/Resources/Images";
    private static URL getResource(String path) {
        return Fonts.class.getResource(preURL + path);
    }
    private static final Image file = new ImageIcon(getResource("/UserInterfaces/Resources/filled_File.png")).getImage();
    private static final Image home = new ImageIcon(getResource("/UserInterfaces/Resources/filled_home.png")).getImage();
    private static final Image close = new ImageIcon(getResource("/UserInterfaces/Resources/plain.png")).getImage();
    private static final Image hoverClose = new ImageIcon(getResource("/UserInterfaces/Resources/hover_close.png")).getImage();
    private static final Image users = new ImageIcon(getResource("/UserInterfaces/Resources/Users.png")).getImage();
    public static final ImageIcon FILE = new ImageIcon(file.getScaledInstance(16,16,Image.SCALE_SMOOTH));
    public static final ImageIcon HOME = new ImageIcon(home.getScaledInstance(16,16,Image.SCALE_SMOOTH));
    public static final ImageIcon USERS = new ImageIcon(users.getScaledInstance(16,16,Image.SCALE_SMOOTH));
    public static final ImageIcon CLOSE = new ImageIcon(close.getScaledInstance(8,8,Image.SCALE_SMOOTH));
    public static final ImageIcon HOVER_CLOSE = new ImageIcon(hoverClose.getScaledInstance(10,10,Image.SCALE_SMOOTH));

}
