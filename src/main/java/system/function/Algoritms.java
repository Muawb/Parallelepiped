package system.function;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Algoritms {

    private static FileInputStream in;
    private static StringBuilder sb;
    private static byte[] list;
    private static byte[] buffer;
    private String func;

    public Algoritms(String func){
        this.func = func;
    }

    public String hex(File file){
        try {
            MessageDigest md = MessageDigest.getInstance(func);
            in = new FileInputStream(file);

            list = new byte[1024];
            int count = 0;

            while ((count = in.read(list)) != -1){
                md.update(list, 0, count);
            }
            in.close();

            buffer = md.digest();

            sb = new StringBuilder();
            for (int i = 0; i < buffer.length; i++){
                sb.append(Integer.toString((buffer[i] & 0xff) + 0x100, 16));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return sb.toString();
    }

    public String sha(String line){
        try {
            MessageDigest digest = MessageDigest.getInstance(func);
            buffer = digest.digest(line.getBytes("UTF-8"));
            sb = new StringBuilder();
            for (int i = 0; i < buffer.length; i++){
                String h = Integer.toHexString(0xff & buffer[i]);
                if (buffer.length == 1)
                    sb.append(0);
                    sb.append(h);
            }
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public String md(String line){
        try {
            MessageDigest digest = MessageDigest.getInstance(func);
            buffer = digest.digest(line.getBytes("UTF-8"));
            sb = new StringBuilder();
            for (int i = 0; i < buffer.length; i++){
                sb.append(Integer.toHexString((buffer[i] & 0xff) | 0x100).substring(1,3));
            }
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
