package naver.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;

public class GetValidation {
	
	public static boolean getValidation(HttpServletRequest request){
		
		String clientId = "EfI8HhY51r1KSViceL9i";
		String clientSecret = "j6dttir_jK";
		
		String code = "1";   //  키 발급 "0", 이미지 비교 "1"
		String key = request.getParameter("key");
		String value = request.getParameter("value");
		String apiURL ="https://openapi.naver.com/v1/captcha/nkey?code="+code+"&key="+key+"&value="+value;
	
		// 요청 헤더(request header) 
		Map<String, String> requestHeaders = new HashMap<>();
		requestHeaders.put("X-Naver-Client-Id", clientId);
		requestHeaders.put("X-Naver-Client-Secret", clientSecret);
		
		URL url = null;    				// 조상 
		HttpURLConnection con = null;   // 자손 
		boolean result = false;
		
		try {
			url = new URL(apiURL);
			con = (HttpURLConnection) url.openConnection();  //자손= 조상일땐 다운캐스팅 형변환 필수
			
			con.setRequestMethod("GET");
			for(Map.Entry<String, String> entry : requestHeaders.entrySet()) {
				con.setRequestProperty(entry.getKey(), entry.getValue());
			}
			
			
			int responseCode = con.getResponseCode();
			
			if( responseCode == HttpURLConnection.HTTP_OK) {
				InputStreamReader isr = new InputStreamReader(con.getInputStream());
				BufferedReader br = new BufferedReader(isr);
				StringBuilder sb = new StringBuilder();
				
				while(true) {
					String line = br.readLine(); // 한줄씩 읽기 
					if(line == null) {
						break;
					}
					sb.append(line);
				}
				JSONObject obj = new JSONObject(sb.toString());
				result = (boolean)obj.getBoolean("result");
			
			} else {
				InputStreamReader isr = new InputStreamReader(con.getInputStream());
				BufferedReader br = new BufferedReader(isr);
				StringBuilder sb = new StringBuilder();
				while(true) {
					String line = br.readLine();
					if( line == null) { break; }
					sb.append(line);
				}
				System.out.println("에러메시지 : "+ sb.toString());
			}
			
			
			
		} catch(MalformedURLException e) {
			throw new RuntimeException("API URL이 잘못되었습니다. : " + apiURL, e); 
		}  catch(IOException e) {
			throw new RuntimeException("연결이 실패했거나 API응답을 읽는데 실패했습니다.");
		} finally {
			con.disconnect();
		}
		
		
		//request.setAttribute("result", result);
		return result;
		
	}
			
	
	
	
	
	
	
	

}
