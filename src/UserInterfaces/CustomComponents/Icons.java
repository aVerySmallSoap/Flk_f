package UserInterfaces.CustomComponents;

import Interfaces.ResourceLocator;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Icons extends ResourceLocator {
    private static final String prefix = "/UserInterfaces/Resources/Images/";

    private static URL getResource(String path) {
        return Icons.class.getResource(prefix.concat(path));
    }
    private static final Image file = new ImageIcon(getResource("filled_File.png")).getImage();
    private static final Image home = new ImageIcon(getResource("filled_home.png")).getImage();
    private static final Image close = new ImageIcon(getResource("plain.png")).getImage();
    private static final Image hoverClose = new ImageIcon(getResource("hover_close.png")).getImage();
    private static final Image users = new ImageIcon(getResource("Users.png")).getImage();
    private static final Image settings = new ImageIcon(getResource("Settings.png")).getImage();
    private static final Image table = new ImageIcon(getResource("table.png")).getImage();
    private static final Image insertTable = new ImageIcon(getResource("InsertTable.png")).getImage();
    private static final Image search = new ImageIcon(getResource("search.png")).getImage();
    public static final ImageIcon FILE = new ImageIcon(file.getScaledInstance(16,16,Image.SCALE_SMOOTH));
    public static final ImageIcon HOME = new ImageIcon(home.getScaledInstance(16,16,Image.SCALE_SMOOTH));
    public static final ImageIcon USERS = new ImageIcon(users.getScaledInstance(16,16,Image.SCALE_SMOOTH));
    public static final ImageIcon SETTINGS = new ImageIcon(settings.getScaledInstance(16,16,Image.SCALE_SMOOTH));
    public static final ImageIcon TABLE = new ImageIcon(table.getScaledInstance(16,16,Image.SCALE_SMOOTH));
    public static final ImageIcon SEARCH = new ImageIcon(search.getScaledInstance(16,16,Image.SCALE_SMOOTH));
    public static final ImageIcon INSERTABLE = new ImageIcon(insertTable.getScaledInstance(16,16,Image.SCALE_SMOOTH));
    public static final ImageIcon CLOSE = new ImageIcon(close.getScaledInstance(8,8,Image.SCALE_SMOOTH));
    public static final ImageIcon HOVER_CLOSE = new ImageIcon(hoverClose.getScaledInstance(10,10,Image.SCALE_SMOOTH));
}
