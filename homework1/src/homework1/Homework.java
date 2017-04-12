package homework1;

import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Homework {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		String font = Homework.fontSelection(scanner);
		System.out.println("Selected font: " + font);
		String textToConvert = Homework.textInput(scanner);
		String convertedText = Homework.getConvertedText(textToConvert, font);
		System.out.println(convertedText);
	}
	
	private static String textInput(Scanner scanner) {
		System.out.println("Write text to convert: ");
		while(true) {
			String text = scanner.nextLine();
			if(text.length() > 1)
				return text;
		}
	}

	public static String fontSelection(Scanner scanner) throws IOException {
		String[] fonts = Homework.getFonts();
		
		int index = 0;
		for (String font : fonts) {
			System.out.println(index + ": " + font);
			index++;
		}
		
		System.out.println("Write font index: ");
		return fonts[scanner.nextInt()];
	}
	
	public static String getHTML(String url) throws IOException {
		URL api = new URL(url);
		BufferedReader in = new BufferedReader(new InputStreamReader(api.openStream()));
		String inputLine;
		String html = "";
        while ((inputLine = in.readLine()) != null)
            html += inputLine + "\n";
        
        return html;
	}
	
	public static String[] getFonts() throws IOException {
		String fontsList = Homework.getHTML("http://artii.herokuapp.com/fonts_list");
		String[] fontsArray = fontsList.split("\\r?\\n");
		
		return fontsArray;
	}
	
	public static String getConvertedText(String text, String font) throws IOException {
		return Homework.getHTML("http://artii.herokuapp.com/make?text="+ URLEncoder.encode(text, "UTF-8") + "&font=" + font);
	}
}

