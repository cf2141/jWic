package de.jwic.mobile02.demos;

import de.jwic.base.Control;
import de.jwic.base.ControlContainer;
import de.jwic.base.IControlContainer;
import de.jwic.controls.mobile02.MSelectmenu;
import de.jwic.data.ISelectElement;
import de.jwic.mobile02.MobileDemoModule;

import org.json.JSONObject;
import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.HashMap;

import de.jwic.events.SelectionListener;

/**
 * @author vedad
 *
 */
public final class SelectMenuDemo02 extends MobileDemoModule {

	/**
	 * @param title
	 */
	public SelectMenuDemo02() {
		super("SelectMenu Demo02");
	}

	/* (non-Javadoc)
	 * @see de.jwic.mobile.MobileDemoModule#createPage(de.jwic.base.IControlContainer)
	 */
	@Override
	public Control createPage(IControlContainer controlContainer) {
		final ControlContainer container = new ControlContainer(controlContainer, "controlContainer");
		
		MSelectmenu selectmenu = new MSelectmenu(container, "selectmenu");
		selectmenu.setCorners(false);
		ISelectElement firstone = selectmenu.addElement("firstitem", "First");
		selectmenu.addElement("seconditem", "Second");
		selectmenu.addElement("thirditem", "Third");
		selectmenu.setSelectedElement(firstone);
		
		/****
		MSelectmenu selectmenuinline = new MSelectmenu(container, "selectmenuinline");
		selectmenuinline.setInline(true);
		selectmenuinline.addElement("firstiteminline", "First Inline");
		selectmenuinline.addElement("seconditeminline", "Second Inline");
		selectmenuinline.addElement("thirditeminline", "Third Inline");
		selectmenuinline.addElement("fourthiteminline", "Fourth Inline");
		****/
		
		MSelectmenu selectmenumini = new MSelectmenu(container, "selectmenumini");
		selectmenumini.setMini(true);
		//selectmenumini.addElement("firstitemmini", "First Mini");
		//selectmenumini.addElement("seconditemmini", "Second Mini");
		//selectmenumini.addElement("thirditemmini", "Third Mini");
		try {
		  String url = "http://localhost:8080/01-amp3s/01-amp3s.json";
		  URL obj = new URL(url);
		  HttpURLConnection con = (HttpURLConnection)obj.openConnection();
		  int responseCode = con.getResponseCode();
		  System.out.println("\nSending 'GET' request to URL : " + url);
		  System.out.println("Response Code : " + responseCode);
		  BufferedReader in =new BufferedReader(
		  new InputStreamReader(con.getInputStream()));
		  String inputLine;
		  StringBuffer response = new StringBuffer();
		    while ((inputLine = in.readLine()) != null) {
			  response.append(inputLine);
		    } in .close();
		    //print in String
		    System.out.println(response.toString());
		    JSONObject myresponse = new JSONObject(response.toString());
		   
			JSONArray arr = myresponse.getJSONArray("echo-list");
			
			//AudioButton[] arrayOButtons = new AudioButton[arr.length()];
			
			for (int i = 0; i < arr.length(); i++) {
				System.out.println(" " + arr.get(i));
				selectmenumini.addElement(""+arr.get(i), ""+i+"-"+arr.get(i));
		    /**
				arrayOButtons[i] = new AudioButton(tlc);
				arrayOButtons[i].addSelectionListener(
					                       (new AudioSelection(""+arr.get(i))));
				arrayOButtons[i].setTitle(""+arr.get(i));
				arrayOButtons[i].setAudioLink("http://localhost:8080/01-amp3s/"+arr.get(i));
			**/
			}
		   
		} catch(Exception e) {
			System.out.println(e);
		}
		
		return container;
	}

}