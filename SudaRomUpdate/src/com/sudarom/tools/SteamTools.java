package com.sudarom.tools;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SteamTools
{

    public static String gethtml(InputStream inputStream) throws Exception
    {
        // TODO �Զ����ɵķ������
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String result = "";
        String line = "";
        while((line = reader.readLine()) != null)
        {
            result = result + line;
        }
        inputStream.close();

        return result;
    }

}
