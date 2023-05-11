package UserInterfaces.CustomComponents.PageableComponents;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Users extends JPanel {
    public static final String NAME = "Users";
    public Users(){
        this.setName(NAME);
        this.setLayout(new BorderLayout());
        JTable table = new JTable(5,5);
        JScrollPane scrollPane = new JScrollPane(table);
        JPanel testPane = new JPanel();
        TitledBorder border = new TitledBorder("Customer");

        this.add(scrollPane, BorderLayout.CENTER);

        this.add(testPane, BorderLayout.EAST);
        border.setTitlePosition(TitledBorder.TOP);
        testPane.setBorder(border);
        testPane.setPreferredSize(new Dimension(750,0));

        testPane.add(new JButton("Ass"));
        testPane.add(new JButton("Ass"));
        testPane.add(new JButton("Ass"));
    }
}
