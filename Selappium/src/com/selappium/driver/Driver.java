package com.selappium.driver;

import com.selappium.utility.TextReader;
import java.io.File;

public class Driver {

	static TextReader txtReader;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length != 1) {
			System.err.println("Please select configuration file path");
			System.exit(-1);
		}

		File configFile = new File(args[0]);

		if (!configFile.exists()) {
			System.err.println("Configuration file not found in" + configFile.getAbsolutePath() + ". Please check");
			System.exit(-1);
		} else {
			txtReader = new TextReader(args[0]);

			System.out.println(txtReader.getURL());
			System.out.println(txtReader.getApkPath());
			System.out.println(txtReader.getIpaPath());
			System.out.println(txtReader.getDeviceId());
			System.out.println(txtReader.getUDID());

		}

	}

}
