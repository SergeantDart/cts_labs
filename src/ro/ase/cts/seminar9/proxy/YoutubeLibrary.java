package ro.ase.cts.seminar9.proxy;

import java.util.ArrayList;

public class YoutubeLibrary implements YoutubeLibraryInterface {
	
	private VideoDatabase videoDatabase;
	
	public YoutubeLibrary() {
		this.videoDatabase = new VideoDatabase();
	}
	
	@Override
	public String listVideos() {
		System.out.println("\nFetching videos from database...");
		ArrayList<YoutubeVideo> videoList = videoDatabase.getVideoCollection();
		StringBuilder videoListBuilder = new StringBuilder();
		for(YoutubeVideo video : videoList) {
			videoListBuilder.append(video.toString()).append("\n");
		}
		return videoListBuilder.toString();
	}

	@Override
	public String listVideoInfo(int id) {
		System.out.println("\nFetching video " + id + " from database...");
		YoutubeVideo video = videoDatabase.getVideoById(id);
		if(video != null) {
			return video.toString();
		}else {
			return "Not found...";
		}
	}
	
	
	
}
