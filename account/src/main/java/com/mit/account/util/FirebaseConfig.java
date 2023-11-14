package com.mit.account.util;

import com.google.gson.Gson;
import com.mit.account.dto.DataResponse;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class FirebaseConfig {
	 private static final HttpClient http = HttpClient.newHttpClient();

	    public static CompletableFuture<Map<String, Object>> sendNotification(Map<String, Object> notification, DataResponse data) {
	        Gson gson = new Gson();
	        String fcmtoken="edn2r5SoDNrfTE-XyxfCOT:APA91bHKcrzqfIYamWFK2SRITgvnix3PKP__1b3yxyfBBKMk0GecWrS04RdDii0UIwsxHtzcaXhA9JChRUQBFBvNriRb1ohTiJ5ZCa8YVruOzxU1L8_yp9d5oLmm6Bu8YKEmRdp-HDPI";
	        String jsonData = gson.toJson(data);
	        String jsonPayload = new Gson().toJson(Map.of(
	        	    "to", fcmtoken,
	        	    "notification", notification,
	        	    "data", data
	        	));

	        HttpRequest request = HttpRequest.newBuilder()
	                .uri(URI.create("https://fcm.googleapis.com/fcm/send"))
	                .header("Authorization", "key=AAAA4D-TAQo:APA91bFmXMWK_LQ-dihA1p-5G1sfjuWEeivFDCOQgA_PkDV4ZcNv118Ys4W0EbE-MND_KlGf8hne_ZuFQD0tgrYIy-g1FUpIVrds8vgbZMBTDUq51Hay1AyADHeeW-gSUT0biab9SD_c")
	                .header("Content-Type", "application/json")
	                .POST(HttpRequest.BodyPublishers.ofString(
	                		jsonPayload))
	                .build();

	        return http.sendAsync(request, HttpResponse.BodyHandlers.ofString())
	                .thenApply(HttpResponse::body)
	                .thenApply(FirebaseConfig::parseResponse);
	    }

	    private static Map<String, Object> parseResponse(String responseBody) {
	        return new HashMap<>();
	    }
}
