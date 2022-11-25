package org.isvora.snap.service;

import org.isvora.snap.model.Location;
import org.isvora.snap.model.LocationResponse;
import org.isvora.snap.utils.MarvelSnapUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class LocationService {

    private final HttpService<LocationResponse> httpService = new HttpService();

    public Location getLocation(String name, String api) throws IOException, InterruptedException {
        String params = URLEncoder.encode(name, StandardCharsets.UTF_8);
        String uri = api
                + MarvelSnapUtils.LOCATION
                + "n="
                + params;

        LocationResponse locationResponse = httpService.makeRequest(URI.create(uri), LocationResponse.class);

        return locationResponse.getLocations().get(0);
    }
}
