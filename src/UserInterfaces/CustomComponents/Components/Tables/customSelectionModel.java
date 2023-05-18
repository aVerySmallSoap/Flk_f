package UserInterfaces.CustomComponents.Components.Tables;

import UserInterfaces.CustomComponents.Components.Panels.CustomerDataPanel;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.Vector;

public class customSelectionModel extends DefaultListSelectionModel implements ListSelectionListener {

    dataTable table;
    CustomerDataPanel dataPanel;

    customSelectionModel(dataTable table) {
        this.table = table;
        init();
    }

    customSelectionModel(dataTable table, CustomerDataPanel dataPanel) {
        this.table = table;
        this.dataPanel = dataPanel;
        init();
    }

    private void init() {
        this.addListSelectionListener(this);
        this.setSelectionMode(SINGLE_SELECTION);
    }

    @Override
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            Vector<Object> selectedValues = new Vector<>();
            for (int i = 0; i < table.getColumnCount(); i++) {
                selectedValues.add(table.getValueAt(table.getSelectedRow(), i));
            }
            dataPanel.loadIntoPanel(selectedValues);
        }
    }
}
