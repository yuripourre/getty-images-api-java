package model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class GettyImageResult {

	@SerializedName("id")
	String id;

	@SerializedName("caption")
	String caption;
	
	@SerializedName("title")
	String title;
	
	@SerializedName("display_sizes")
	List<DisplaySize> displaySizes;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<DisplaySize> getDisplaySizes() {
		return displaySizes;
	}

	public void setDisplaySizes(List<DisplaySize> displaySizes) {
		this.displaySizes = displaySizes;
	}
	
}
