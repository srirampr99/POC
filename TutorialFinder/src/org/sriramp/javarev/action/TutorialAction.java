package org.sriramp.javarev.action;

import org.sriramp.javarev.service.TutorialFinderService;

public class TutorialAction {
	
	private String bestTutorialSite;
	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	private String lang;

	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

	public String execute()
	{
		TutorialFinderService tutorialFinderService = new TutorialFinderService();
		
		if (this.getLang().equals("java"))
		{
		setBestTutorialSite(tutorialFinderService.getBestTutorialSite());
		}
		else 
		{
			setBestTutorialSite("This is not the correct lang...!!!");
		}
		return "success";
		
	}
}
