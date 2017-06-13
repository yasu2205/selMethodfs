package testcases;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StringExcercise {

	public static void main(String[] args) {
String name = "Hi Hi Hey Hi Hey there There";
String[] names = name.split(" ");
System.out.println(names[2]);
HashMap<String, Integer> wordcount = new HashMap<String, Integer>();
for (String name1 : names) {
	if (wordcount.containsKey(name1.toLowerCase()))
	{
		wordcount.put(name1.toLowerCase(),wordcount.get(name1.toLowerCase())+1);
	}
	else
	{
		wordcount.put(name1.toLowerCase(),1);
			
	}
}
	Set<String> wordsInString = wordcount.keySet();
	for(String name2:wordsInString)
	{
	if(wordcount.get(name2)>1)
	{
		System.out.println(name2+":"+wordcount.get(name2));
	}
	}
	
}


	}


