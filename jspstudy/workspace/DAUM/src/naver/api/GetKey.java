package naver.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class GetKey {

	public static String getKey() {
	
		 String clientId = "EfI8HhY51r1KSViceL9i";
		 String clientSecret = "j6dttir_jK";
		 
		 String code = "0"; 
		 String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code;
		 
		 Map<String, String>  requestHeaders = new HashMap<>();
		 requestHeaders.put("X-Naver-Client-Id", clientId);
	     requestHeaders.put("X-Naver-Client-Secret", clientSecret);
	     
	    URL url = null;
		HttpURLConnection con = null;
		String captchaKey = null;
		
		
		try {
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");   // get방식으로 요청 설정하기!
			
			
			for( Map.Entry<String, String> entry : requestHeaders.entrySet()) {
			con.setRequestProperty(entry.getKey(), entry.getValue());
			}
			int responseCode = con.getResponseCode(); // 응답코드 200 400 500 등 확인위해 
			if( responseCode == HttpURLConnection.HTTP_OK) {   // http_ok == 200
				// 응답코드가 정상이면 네이버가 준 json의 바이트형식을 읽어야한다
				InputStreamReader isr = new InputStreamReader(con.getInputStream());
				BufferedReader br = new BufferedReader(isr);
				StringBuilder sb = new StringBuilder();
				
			 while(true) {
				String line = br.readLine();
				if( line == null) {
					break;
				}
				sb.append(line);
			}
			 JSONObject obj = new JSONObject(sb.toString());
			 captchaKey = (String) obj.get("key");
			// System.out.println("메시지 : "+ sb.toString());	
		  } else {
			  InputStreamReader isr = new InputStreamReader(con.getInputStream());
				BufferedReader br = new BufferedReader(isr);
				StringBuilder sb = new StringBuilder();
				
			 while(true) {
				String line = br.readLine();
				if( line == null) {
					break;
				}
				sb.append(line);
			 }
			 System.out.println("에러메시지 : "+ sb.toString());		  
		  }
			
			
		} catch(MalformedURLException e) {
			throw new RuntimeException("API URL이 잘못되었습니다. "+apiURL);	
		} catch(IOException e) {
			throw new RuntimeException("연결이 실패했거나 API응답을 읽는데 실패했습니다. : "+ apiURL);	
		} finally {
			con.disconnect();  // 결국엔 연결 끊기 
		}
		
		return captchaKey;  // 캡차키 반환해서 넘기기 
	}


}
