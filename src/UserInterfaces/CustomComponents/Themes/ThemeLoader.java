package UserInterfaces.CustomComponents.Themes;

import com.formdev.flatlaf.FlatLaf;

public class ThemeLoader {
    public static void LoadThemes(){
        FlatLaf.registerCustomDefaultsSource("UserInterfaces.CustomComponents.Themes.Properties");
    }
}
