package org.apache.pdfbox.multimedia;

import org.apache.pdfbox.cos.COSBase;
import org.apache.pdfbox.cos.COSDictionary;
import org.apache.pdfbox.pdmodel.common.COSObjectable;
import org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification;

public class PDSoundFile implements COSObjectable {

	COSDictionary dictionary = new COSDictionary();

	@Override
	public COSBase getCOSObject() {
		return dictionary;
	}

	/**
	 * Sets an external file.
	 * @param file
	 */
	public void setFile(PDFileSpecification file) {
		dictionary.setItem("F", file);
	}

}
