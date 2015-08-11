package org.apache.pdfbox.pdmodel.interactive.annotation;

import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.multimedia.PDSoundFile;

public class PDAnnotationSound extends PDAnnotationMarkup {

	public static final String NAME_SPEAKER = "Speaker";
	public static final String NAME_MIC = "Mic";

	static final String SUB_TYPE = "Sound";

	public PDAnnotationSound() {
		super();
		getCOSObject().setItem(COSName.SUBTYPE, COSName.getPDFName(SUB_TYPE));
	}
   
    public void setSound(PDSoundFile sound) {
    	this.getCOSObject().setItem("Sound", sound);
    }
   
    public void setName(String name) {
    	this.getCOSObject().setName(COSName.NAME, name);
    }

}
