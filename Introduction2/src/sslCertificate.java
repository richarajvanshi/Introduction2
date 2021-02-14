import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class sslCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DesiredCapabilities fx = DesiredCapabilities.firefox();
				
				//fx.acceptInsecureCerts()
		
		
		fx.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		fx.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//Local Browser
		
		FirefoxOptions fx1=new FirefoxOptions();
		
		fx1.merge(fx);
	}
	

}
