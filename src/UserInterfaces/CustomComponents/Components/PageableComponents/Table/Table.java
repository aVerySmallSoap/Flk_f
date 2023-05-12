package UserInterfaces.CustomComponents.Components.PageableComponents.Table;

import UserInterfaces.CustomComponents.Colors;
import UserInterfaces.CustomComponents.Components.CustomPanels.SearchPanel;
import UserInterfaces.CustomComponents.Components.dataTable;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class Table extends JPanel {
    public static final String NAME = "Tables";
    public Table(dataTable table){
        this.setName(NAME);
        this.setLayout(new BorderLayout());
        JPanel BottomInfo = new JPanel();
        JPanel RightLead = new JPanel();
        JScrollPane scrollPane = new JScrollPane(table);
        SearchPanel searchPanel = new SearchPanel();

        this.add(BottomInfo, BorderLayout.SOUTH);
        BottomInfo.add(new JLabel("Bottom Panel components go here"));
        BottomInfo.setBorder(new MatteBorder(1,0,0,0, Colors.PRIMARY));
        this.add(RightLead, BorderLayout.EAST);
        RightLead.add(new JLabel("Right Panel components go here"));
        RightLead.setBorder(new MatteBorder(0,1,0,0, Colors.PRIMARY));
        this.add(scrollPane, BorderLayout.CENTER);
        this.add(searchPanel, BorderLayout.NORTH);
    }
}