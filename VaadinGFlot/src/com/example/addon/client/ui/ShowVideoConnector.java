package com.example.addon.client.ui;



import com.example.addon.ShowVideo;
import com.example.addon.LinePlot;
import com.example.addon.client.ui.LinePlotState.DataSeries;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.MediaElement;
import com.google.gwt.media.client.Video;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.terminal.gwt.client.communication.StateChangeEvent;
import com.vaadin.terminal.gwt.client.ui.AbstractComponentConnector;
import com.vaadin.terminal.gwt.client.ui.Connect;

@Connect(ShowVideo.class)
public class ShowVideoConnector extends AbstractComponentConnector {

    @Override
    public ShowVideoState getState() {
        return (ShowVideoState) super.getState();
    }
    @Override
   public Video getWidget() {
   return (Video) super.getWidget();
   }
   

    @Override
    protected Widget createWidget() {
       // return GWT.create(SimplePlot.class);
    	return GWT.create(Video.class);
    }

    @Override
    public void onStateChanged(StateChangeEvent stateChangeEvent) {
        super.onStateChanged(stateChangeEvent);

     System.out.print(getWidget().getPlaybackRate());
       
   //   getWidget().redraw();
    }
    public void setSource(String s)
    {
    	getWidget().setSrc(s);
    }
    public void play()
    {
    	getWidget().play();
    }
}
