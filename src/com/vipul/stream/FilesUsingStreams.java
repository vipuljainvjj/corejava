package com.vipul.stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilesUsingStreams {
	
	public static void main(String[] args) throws IOException {
		/*
			String inputFile = "C:\\Users\\vipul\\Downloads\\nohup.out";
			String outputFile = "C:\\Users\\vipul\\Downloads\\nohup4.out";

			Stream<String> lines = Files.lines(Paths.get(inputFile));
		*/
		// Probably collector can be used

		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(intList.stream().reduce(5, (x,y) -> x > y ? x : y));
	}
	
	private static void imperativeApproach() {
		String inputFile = "C:\\Users\\vipul\\Downloads\\nohup.out";
		String outputFile = "C:\\Users\\vipul\\Downloads\\nohup4.out";
		
		try(Stream<String> list =  Files.lines(Paths.get(inputFile));) {
			List<String> arrayList = list.collect(Collectors.toList());
			int startIndex = 0, reference = 0;
			OptionalInt opt1;
			OptionalInt opt2;
			while(startIndex >= 0) {
				opt1 = IntStream.range(0, arrayList.size())
								.filter( (i) -> arrayList.get(i).contains("BUGSQUISHER_TEST") )
								.findFirst();
				startIndex = opt1.orElse(-1);
				
				if (startIndex >= 0) {
					opt2 = IntStream.range(startIndex, arrayList.size())
									.filter( (i) -> arrayList.get(i).contains("at java.lang.Thread.run") )
									.findFirst();
					reference = startIndex;
					startIndex = opt2.orElse(-1);
					arrayList.subList(reference, startIndex + 1).clear();
				}
			}
			
			File newFile = new File(outputFile);
			try (BufferedWriter br = new BufferedWriter(new FileWriter(newFile));) {
				arrayList.forEach( (str) -> {
					try {
						br.write(str);
						br.write("\n");
					} catch (IOException e) {
					}
				});
			} 
		} catch (IOException ioExp) {
			ioExp.printStackTrace();
		}
	}
}