package model;

import com.google.gson.annotations.SerializedName;

public class DisplaySize {

	@SerializedName("is_watermarked")
	boolean watermark;
	
	@SerializedName("name")
	String name;
	
	@SerializedName("uri")
	String url;

	public boolean isWatermark() {
		return watermark;
	}

	public void setWatermark(boolean watermark) {
		this.watermark = watermark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
