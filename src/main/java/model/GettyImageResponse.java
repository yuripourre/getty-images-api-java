package model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class GettyImageResponse {

	@SerializedName("result_count")
	private int resultCount;
	
	@SerializedName("images")
	private List<GettyImageResult> images;

	public int getResultCount() {
		return resultCount;
	}

	public void setResultCount(int resultCount) {
		this.resultCount = resultCount;
	}

	public List<GettyImageResult> getImages() {
		return images;
	}

	public void setImages(List<GettyImageResult> images) {
		this.images = images;
	}

}
