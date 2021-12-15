package com.sdp;

import org.openqa.selenium.WebDriver;
import com.pom.Book_Confirm;
import com.pom.Book_Hotel;
import com.pom.Home_Page;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;

public class Page_Object_Manager {
	
	public Page_Object_Manager(WebDriver driver2) {
	
		this.driver= driver2;
	}

	public WebDriver driver; //null
	
	private Home_Page hp;
	
	private Search_Hotel sh;

	private Select_Hotel sel;
	
	private Book_Hotel bh;
	
	private Book_Confirm bc;
	

	public Home_Page getInstanceHp() {
		
		if (hp==null)  {
			
			hp= new Home_Page(driver);
		}
		
		return hp;
	}

	public Search_Hotel getInstanceSh() {
		
		if (sh==null)  {
			
			sh= new Search_Hotel(driver);
		}
				return sh;
	}
	
	public Select_Hotel getInstanceSel() {
		
		if (sel==null)  {
			
			sel= new Select_Hotel(driver);
		}		
		return sel;
	}
	
	public Book_Hotel getInstanceBh() {
		
		if (bh==null)  {
			
			bh= new Book_Hotel(driver);
		}
		
		return bh;
	}
	
	public Book_Confirm getInstanceBc() {
		
		if (bc==null)  {
			
			bc= new Book_Confirm(driver);
		}		
		return bc;
	}
		
}
