package com.example.addon.client.ui;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.terminal.gwt.client.ComponentState;

public class LinePlotState extends ComponentState {

    private List<DataSeries> series = new ArrayList<DataSeries>();

    public List<DataSeries> getSeries() {
        return series;
    }

    public void setSeries(List<DataSeries> series) {
        this.series = series;
    }

    public static class DataSeries {
        private String label;
        private String color;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        private List<Float> data;

        public List<Float> getData() {
            return data;
        }

        public void setData(List<Float> data) {
            this.data = data;
        }

    }

}
