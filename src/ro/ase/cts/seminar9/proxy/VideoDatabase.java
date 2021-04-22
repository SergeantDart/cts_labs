package ro.ase.cts.seminar9.proxy;

import java.util.ArrayList;

public class VideoDatabase {
	private ArrayList<YoutubeVideo> videoCollection;
	
	public VideoDatabase() {
		videoCollection = new ArrayList<>();
		videoCollection.add(new YoutubeVideo(1, "How to cook with Jamila", 6.34f));
		videoCollection.add(new YoutubeVideo(2, "CS Go Livestream", 44.53f));
	}

	public ArrayList<YoutubeVideo> getVideoCollection() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return videoCollection;
	}
	
	public YoutubeVideo getVideoById(int id) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		YoutubeVideo video = null;
		for(YoutubeVideo v : videoCollection) {
			if(id == v.getId()) {
				video = v;
				break;
			}
		}
		return video;
	}
	
	public void setVideoCollection(ArrayList<YoutubeVideo> videoCollection) {
		this.videoCollection = videoCollection;
	}
	
	
}
