import UserInterfaces.CustomComponents.Themes.ThemeLoader;
import UserInterfaces.Dashboard;
import com.formdev.flatlaf.FlatLightLaf;

public class testingUI {
    public static void main(String[] args) {
        ThemeLoader.LoadThemes();
        FlatLightLaf.setup();
        Dashboard d = new Dashboard();
        d.run();
    }
}
