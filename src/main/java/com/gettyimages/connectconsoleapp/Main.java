package com.gettyimages.connectconsoleapp;

import java.util.List;

import model.GettyImageResponse;
import model.GettyImageResult;

import com.gettyimages.connectsdk.ConnectSdk;
import com.gettyimages.connectsdk.SdkException;
import com.gettyimages.connectsdk.search.ICreativeImagesSearch;
import com.gettyimages.connectsdk.search.Search;
import com.google.gson.Gson;

public class Main {
    private static String apiKey = "your_key";
    private static String apiSecret = "your_secret";
    private static String userName = "";
    private static String userPassword = "";

    public static void main(String[] args) {
    	
        ConnectSdk connectSdk = new ConnectSdk(apiKey, apiSecret);
        String searchTerm = "forniture%20couch";
        String result = "";
        try {
            Search search = connectSdk.Search();
            ICreativeImagesSearch creativeImageSearch = search.Images().Creative().WithPhrase(searchTerm).WithPage(10);
            result = creativeImageSearch.ExecuteAsync();
        } catch (SdkException e) {
            result = e.getMessage();
        }
        catch (Exception e) {
            result = e.toString();
        }
        
        //System.out.print(result);

        GettyImageResponse response = new Gson().fromJson(result, GettyImageResponse.class);
		
        List<GettyImageResult> results = response.getImages();
        for(GettyImageResult r: results) {
        	System.out.println(r.getDisplaySizes().get(0).getUrl());
        }
		
    }
}
