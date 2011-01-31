package org.domain.registrybrowser.entity;


import org.jboss.seam.annotations.Name;


import net.ivoa.xml.registryInterface.v10.Resource;


@Name("extendedResource")
public class ExtendedRegistry{

	private int resourceLocation = 0;
	
	//private int selectedResource = 0;
	
	private String tapURL = null;
	private String xsamURL = null;
	private String webURL = null;
	
	private boolean hasTAP = false;
	private boolean hasXSAM = false;
	private boolean hasWEB = false;
	
	private Resource resource;
	/**
	 * 
	 */
	private static final long serialVersionUID = 7277597830893008086L;
	
	public ExtendedRegistry(int index, Resource resourceTemp){
		//System.out.println("Index: " + index);
		this.resourceLocation = index;
		this.resource = resourceTemp;
	}

	public int getResourceLocation() {
		return resourceLocation;
	}

	public void setResourceLocation(int resourceLocation) {
		this.resourceLocation = resourceLocation;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public String getTapURL() {
		return tapURL;
	}

	public void setTapURL(String tapURL) {
		this.tapURL = tapURL;
	}

	public String getXsamURL() {
		return xsamURL;
	}

	public void setXsamURL(String xsamURL) {
		this.xsamURL = xsamURL;
	}

	public boolean isHasTAP() {
		if(tapURL != null){
			hasTAP = true;
		}
		return hasTAP;
	}

	public void setHasTAP(boolean hasTAP) {
		this.hasTAP = hasTAP;
	}

	public boolean isHasXSAM() {
		if(xsamURL != null){
			hasXSAM = true;
		}
		return hasXSAM;
	}

	public void setHasXSAM(boolean hasXSAM) {
		this.hasXSAM = hasXSAM;
	}

	public String getWebURL() {
		return webURL;
	}

	public void setWebURL(String webURL) {
		this.webURL = webURL;
	}

	public boolean isHasWEB() {
		if(webURL != null){
			hasWEB = true;
		}
		return hasWEB;
	}

	public void setHasWEB(boolean hasWEB) {
		this.hasWEB = hasWEB;
	}	
	
}
