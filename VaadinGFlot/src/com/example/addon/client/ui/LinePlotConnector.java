package com.example.addon.client.ui;

import ca.nanometrics.gflot.client.DataPoint;
import ca.nanometrics.gflot.client.SeriesHandler;
import ca.nanometrics.gflot.client.SimplePlot;

import com.example.addon.LinePlot;
import com.example.addon.client.ui.LinePlotState.DataSeries;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.terminal.gwt.client.communication.StateChangeEvent;
import com.vaadin.terminal.gwt.client.ui.AbstractComponentConnector;
import com.vaadin.terminal.gwt.client.ui.Connect;

@Connect(LinePlot.class)
public class LinePlotConnector extends AbstractComponentConnector {

    @Override
    public LinePlotState getState() {
        return (LinePlotState) super.getState();
    }

    @Override
    public SimplePlot getWidget() {
        return (SimplePlot) super.getWidget();
    }

    @Override
    protected Widget createWidget() {
        return GWT.create(SimplePlot.class);
    }

    @Override
    public void onStateChanged(StateChangeEvent stateChangeEvent) {
        super.onStateChanged(stateChangeEvent);

        getWidget().getModel().clear();
        for (DataSeries ds : getState().getSeries()) {

            SeriesHandler s = getWidget().getModel().addSeries(ds.getLabel(),
                    ds.getColor());
            for (int i = 0; i < ds.getData().size(); i++) {
                s.add(new DataPoint(i, ds.getData().get(i)));
            }
        }
        getWidget().redraw();
    }
}
