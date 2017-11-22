package org.itstep;

public class Revers {
	public String getFinalText(String str) {
		String finalText = "";
		String[] words = str.split(" ");
		for (int k =0; k<words.length;k++) {
			String[] text = new String[words[k].length()];
			char[] chArray = words[k].toCharArray();
			char[] number = new char[words[k].length()];
			for (int i = 0; i < chArray.length; i++) {
				if (chArray[i] >= '0' && chArray[i] <= '9') {
					text[i] = String.valueOf(chArray[i]);
					number[i] = chArray[i];
				}
			}
			int b = words[k].length() - 1;
			for (int i = 0;i < chArray.length; i++) {
				if (!(chArray[i] >= '0' && chArray[i] <= '9')) {
					if (number[b] >= '0' && number[b] <= '9') {
						do {
						if (!(number[b-1] >= '0' && number[b-1] <= '9')) {
								text[b-1] = String.valueOf(chArray[i]);
								if (i == words[k].length() - 2) {
									b = b - 1;
								}
								else {
									 b = b - 2;
								}
						}
						else {
							b--;
						}
						} while (number[b] >= '0' && number[b] <= '9');
					}
					else {
						text[b] = String.valueOf(chArray[i]);
						if (b>0)
						{
							b--;
						}
					}
				}
				if (chArray[i] >= '0' && chArray[i] <= '9') {
					if (number[b] >= '0' && number[b] <= '9' && i != words[k].length() - 1 && b>0) {
						b--;
					}
				}
			}
			for (int i = 0; i < chArray.length; i++) {
				finalText += text[i];
			}
			finalText +=" "; 	
			
		}

		return finalText;

	}

}
