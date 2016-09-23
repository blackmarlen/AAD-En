package demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties
//@ConfigurationProperties(prefix="cuvinte")
public class WordController {

	String cuvant;
	String altCuvant;
	String text;
	
	@RequestMapping("/lucky-word")
	public String showLuckyWord() {
//		return cuvant + ": " + altCuvant;
		return text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCuvant() {
		return cuvant;
	}

	public void setCuvant(String cuvant) {
		this.cuvant = cuvant;
	}

	public String getAltCuvant() {
		return altCuvant;
	}

	public void setAltCuvant(String altCuvant) {
		this.altCuvant = altCuvant;
	}
}
