package UserInterfaces.CustomComponents.Components.CustomPanels;

import Interfaces.Initializable;
import UserInterfaces.CustomComponents.Colors;
import UserInterfaces.CustomComponents.Components.dataTable;
import UserInterfaces.CustomComponents.Icons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class SearchPanel extends JPanel implements Initializable {


    @SuppressWarnings("FieldMayBeFinal")
    private dataTable table;
    public SearchPanel(dataTable table){
        this.table = table;
        init();
    }

    @Override
    public void init(){
        GridBagConstraints constraints = new GridBagConstraints();

        this.setLayout(new GridBagLayout());
        JTextField search = new JTextField();
        JLabel ICON = new JLabel(Icons.SEARCH);

        constraints.anchor = GridBagConstraints.FIRST_LINE_START;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(5,20,5,0);
        this.add(ICON, constraints);
        constraints.gridx = 1;
        constraints.weightx = 1;
        constraints.weighty = 1;
        search.setColumns(25);
        search.setMinimumSize(new Dimension(500,500));
        this.add(search, constraints);

        this.setBorder(new MatteBorder(0,0,1,0, Colors.PRIMARY));
    }
}
