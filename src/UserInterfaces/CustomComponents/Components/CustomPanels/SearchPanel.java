package UserInterfaces.CustomComponents.Components.CustomPanels;

import UserInterfaces.CustomComponents.Colors;
import UserInterfaces.CustomComponents.Components.dataTable;
import UserInterfaces.CustomComponents.Icons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class SearchPanel extends JPanel {


    @SuppressWarnings("FieldMayBeFinal")
    private dataTable table;
    public SearchPanel(dataTable table){
        this.table = table;
        init();
    }

    private void init(){
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        JTextField search = new JTextField();
        JLabel ICON = new JLabel(Icons.SEARCH);

        this.add(ICON);
        ICON.setBorder(new EmptyBorder(0,25,0,0));
        this.add(search);
        search.setColumns(50);

        this.setBorder(new MatteBorder(0,0,1,0, Colors.PRIMARY));
    }
}
