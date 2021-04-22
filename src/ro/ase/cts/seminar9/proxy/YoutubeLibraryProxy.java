package ro.ase.cts.seminar9.proxy;

import java.util.HashMap;

public class YoutubeLibraryProxy implements YoutubeLibraryInterface {
	
	private YoutubeLibraryInterface libraryImplementation;
	private String videoListCached;
	private HashMap<Integer, String> videoInfoCached;
	private boolean hasExpired;
	
	public YoutubeLibraryProxy() {
		libraryImplementation = new YoutubeLibrary();
		videoInfoCached = new HashMap<>();
		hasExpired = false;
	}
	
	public YoutubeLibraryProxy(YoutubeLibraryInterface youtubeLibrary, boolean hasExpired) {
		libraryImplementation = youtubeLibrary;
		videoInfoCached = new HashMap<>();
		this.hasExpired = hasExpired;
	}
	
	
	
	@Override
	public String listVideos() {
		if(videoListCached == null || hasExpired) {
			videoListCached = libraryImplementation.listVideos();
		}
		return videoListCached;
	}

	@Override
	public String listVideoInfo(int id) {
		if(videoInfoCached.get(id) == null || hasExpired) {
			videoInfoCached.put(id, libraryImplementation.listVideoInfo(id));
		}
		return videoInfoCached.get((Integer)id).toString();
	}

}
