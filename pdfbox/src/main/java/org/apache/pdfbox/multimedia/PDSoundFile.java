package org.apache.pdfbox.multimedia;

import java.io.IOException;
import java.io.InputStream;

import org.apache.pdfbox.cos.COSInteger;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.cos.COSNumber;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.common.PDStream;
import org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification;

public class PDSoundFile extends PDStream {

	static public COSName ENCODING_RAW = COSName.getPDFName("Raw");
	static public COSName ENCODING_SIGNED = COSName.getPDFName("Signed");
	static public COSName ENCODING_MU_LAW = COSName.getPDFName("muLaw");
	static public COSName ENCODING_A_LAW = COSName.getPDFName("ALaw");

	public PDSoundFile(PDDocument doc, InputStream str) throws IOException {
		super(doc, str);
	}

	/**
	 * Sets an external file.
	 * @param file
	 */
	public void setFile(PDFileSpecification file) {
		getStream().setItem(COSName.F, file);
	}

	public void setSamplingRate(COSNumber sampleRate) {
		getStream().setItem(COSName.R, sampleRate);
	}

	public void setNumberOfSoundChannels(COSInteger channels) {
		getStream().setItem(COSName.C, channels);
	}

	public void setBitsPerSample(COSInteger bitsPerSample) {
		getStream().setItem(COSName.B, bitsPerSample);
	}

	public void setEncodingFormat(COSName encodingFormat) {
		getStream().setItem(COSName.E, encodingFormat);
	}

}
