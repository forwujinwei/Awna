package config;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by Administrator on 2017/9/4.
 *
 */
public class CodeProperties {

    private static final String publicProperties = "public.properties";
    private static final String privateProperties = "/private.properties";
    private static CodeProperties instance = null;
    Properties properties = new Properties();
    private CodeProperties{
        try {
            InputStream publicPro = this.getClass().getResourceAsStream("public.properties");
            this.properties.load(new InputStreamReader(publicPro, "UTF-8"));
        }catch (Exception e){

        }
    }

    public static CodeProperties getInstance(){
        if(instance==null){
            instance=new CodeProperties();
        }
        return instance;
    }

    public String getValue(String code){
       return properties.getProperty(code);
    }

}
