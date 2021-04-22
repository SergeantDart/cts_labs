package ro.ase.cts.seminar9.proxy;

public class Main {

	public static void main(String[] args) {
		//without proxy
		YoutubeLibraryInterface youtubeLibrary = new YoutubeLibrary();
		//System.out.println(youtubeLibrary.listVideos());
		//System.out.println(youtubeLibrary.listVideoInfo(1));
		
		//with proxy
		YoutubeLibraryInterface proxy = new YoutubeLibraryProxy(youtubeLibrary, false);
		System.out.println(proxy.listVideos());
		System.out.println(proxy.listVideoInfo(1));	
		
		System.out.println(proxy.listVideos());
		System.out.println(proxy.listVideoInfo(1));	
	}

}
