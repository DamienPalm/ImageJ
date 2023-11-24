package com.openclassrooms.installeride;

import ij.IJ;
import ij.ImagePlus;

public class ExempleMaven {

	public static void main(String[] args) {
		ImagePlus imp = IJ.openImage(); // Selects a file and stores the result in 'imp'
		imp.show(); // Display image on screen
	}

}
