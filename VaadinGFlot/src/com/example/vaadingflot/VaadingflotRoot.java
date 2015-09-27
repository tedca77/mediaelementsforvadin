package com.example.vaadingflot;

import com.example.addon.LinePlot;
import com.example.addon.ShowVideo;
import com.vaadin.terminal.WrappedRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.Root;

public class VaadingflotRoot extends Root {
    @Override
    public void init(WrappedRequest request) {
   	ShowVideo video = new ShowVideo();
    	Label l = new Label("This is it");
    	
        LinePlot plot = new LinePlot();
        plot.setCaption("The future");
        plot.addSeries("A rising trend", "blue", new Float[] { 1f, 1f, 3f, 3f,
                5f, 5f, 7f, 7f, 9f, 9f });
        plot.addSeries("Nokia", "red", new Float[] { 10f, 9f, 8f, 7f, 6f, 5f,
                4f, 3f, 2f, 1f });
        addComponent(plot);
        addComponent(l);
        video.setSource("D:/Sample Data/Videos/114-1446_MVI_AVI.mp4");
      //  video.
  //   addComponent(video);
    }
}
