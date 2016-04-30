package com.github.klaus31;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Main {

	public static void main(String...args) throws IOException {
		StringBuilder songlines = new StringBuilder();
		songlines.append("play 60");
		
		File songfile = File.createTempFile("songfile", ".tmp");
		System.out.println("Songfile: " + songfile.toPath());
		FileUtils.writeStringToFile(songfile, songlines.toString());
		
		ProcessBuilder pb = new ProcessBuilder("/bin/sh", "-c", "cat songfile1367337366803632492.tmp | sonic_pi");
		pb.inheritIO();
		pb.directory(songfile.getParentFile());
		pb.start();
	}

}
