package com.sudarom.tools;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlTools
{

    public static String getcontent(String path) throws Exception
    {
        // TODO �Զ����ɵķ������
        URL url = new URL(path);
        HttpURLConnection coon = (HttpURLConnection)url.openConnection();
        coon.setConnectTimeout(5000);
        coon.setRequestMethod("GET");
        if(coon.getResponseCode() == 200)
        {
            InputStream inputStream = coon.getInputStream();
            return SteamTools.gethtml(inputStream);

        }

        return null;
    }

}
