package com.example.addon;

import com.example.addon.client.ui.ShowVideoState;
import com.vaadin.ui.AbstractComponent;


	public class ShowVideo extends AbstractComponent {

	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public ShowVideo() {
	    	
	    }

	    @Override
	    public ShowVideoState getState() {
	        return (ShowVideoState) super.getState();
	    }
	    public void setSource(String s)
	    {
	    	 getState().setSources(s);
	    }
	    public void play()
	    {
	    	 getState().play();
	    	
	    }
	    public String getDuration()
	    {
	    	 String s=getState().getDuration();
	    	return s;
	    }
	}

