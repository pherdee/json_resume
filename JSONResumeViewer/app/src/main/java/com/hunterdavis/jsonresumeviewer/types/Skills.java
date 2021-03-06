
package com.hunterdavis.jsonresumeviewer.types;

import android.text.TextUtils;

import java.util.List;

public class Skills{
   	private List<String> keywords;
   	private String level;
   	private String name;

    @Override
    public String toString() {
        return "Skills{" +
                "keywords=" + getKeywordListTextually() + '\'' +
                ", level='" + level + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getKeywordListTextually() {
        return TextUtils.join(",", keywords);
    }

    public List getKeywords(){
		return this.keywords;
	}
	public void setKeywords(List keywords){
		this.keywords = keywords;
	}
 	public String getLevel(){
		return this.level;
	}
	public void setLevel(String level){
		this.level = level;
	}
 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
}
