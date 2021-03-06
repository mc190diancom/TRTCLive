package com.miu30.common.util;

import android.annotation.SuppressLint;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/**
 * Created by Murphy on 2018/10/11.
 */
public class MapUtil {
    private Map<String, Object> params;

    public Map<String, Object> getMap(String type, String jsonStr) {
        params = new LinkedHashMap<>();
        params.put("type", type);
        params.put("jsonStr", jsonStr);
        return params;
    }

    public Map<String, Object> getMapForJson(String jsonStr) {
        params = new LinkedHashMap<>();
        params.put("jsonStr", jsonStr);
        return params;
    }

    public Map<String, Object> getMapKeyAndValue(Map<String,Object> map) {
        params = new LinkedHashMap<>();
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key = it.next();
            params.put(key,map.get(key));
        }

        return params;
    }

    public static List<MultipartBody.Part> getParts(List<File> files) {
        List<MultipartBody.Part> parts = new ArrayList<>(files.size());

        for (File file : files) {
            RequestBody requestBody = RequestBody.create(MediaType.parse("image/*"), file);
            MultipartBody.Part part = MultipartBody.Part.createFormData("files", file.getName(), requestBody);
            parts.add(part);
        }

        return parts;
    }

    public static MultipartBody.Part getFilePart(File file) {
        RequestBody requestBody = RequestBody.create(MediaType.parse("text/*"), file);
        MultipartBody.Part part = MultipartBody.Part.createFormData("file", file.getName(), requestBody);

        return part;
    }

    @SuppressLint("TimberArgCount")
    public static MultipartBody.Part getPart(File file) {
        RequestBody requestBody = RequestBody.create(MediaType.parse("image/*"), file);
        MultipartBody.Part part = MultipartBody.Part.createFormData("file", file.getName(), requestBody);
        return part;
    }

}
