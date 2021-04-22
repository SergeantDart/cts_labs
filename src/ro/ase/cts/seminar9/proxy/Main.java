package ro.ase.cts.seminar9.proxy;

public class Main {

	public static void main(String[] args) {
		YoutubeLibraryInterface youtubeLibrary = new YoutubeLibrary();
		System.out.println(youtubeLibrary.listVideos());
		System.out.println(youtubeLibrary.listVideoInfo(1));
	}

}
