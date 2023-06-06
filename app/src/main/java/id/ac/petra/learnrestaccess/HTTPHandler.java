package id.ac.petra.learnrestaccess;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPHandler {
   public HTTPHandler() {

   }

   public String getAccess(String url) {
      String response = null;
      URL u = null;
      try {
         u = new URL(url);
         HttpURLConnection conn = (HttpURLConnection) u.openConnection();
         conn.setRequestMethod("GET");
         InputStream i = new BufferedInputStream(conn.getInputStream());
         response = i.toString();
      } catch (MalformedURLException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
      return response;
   }
}
