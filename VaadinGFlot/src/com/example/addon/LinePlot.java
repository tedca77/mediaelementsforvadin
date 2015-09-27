package com.example.addon;

import java.util.Arrays;

import com.example.addon.client.ui.LinePlotState;
import com.example.addon.client.ui.LinePlotState.DataSeries;
import com.vaadin.ui.AbstractComponent;

public class LinePlot extends AbstractComponent {

    public LinePlot() {
    }

    @Override
    public LinePlotState getState() {
        return (LinePlotState) super.getState();
    }

    public void addSeries(String label, String color, Float[] fs) {
        DataSeries ds = new DataSeries();
        ds.setLabel(label);
        ds.setColor(color);
        ds.setData(Arrays.asList(fs));
        getState().getSeries().add(ds);
    }
}
